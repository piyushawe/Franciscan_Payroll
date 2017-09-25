package stepDef;

import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AdvancePageObject.AdvanceEntry;
import AdvancePageObject.AdvanceLedgerReport;
import AdvancePageObject.AdvanceRepayment;
import AdvancePageObject.FixAdvanceAccount;
import GlobalMastersPageObject.DefineAcademicYear;
import GlobalMastersPageObject.DefineDepartment;
import GlobalMastersPageObject.DefineDesignation;
import GlobalMastersPageObject.DefineFinancialYear;
import GlobalMastersPageObject.DefineProfession;
import GlobalMastersPageObject.DefineSmsTemplate;
import GlobalMastersPageObject.DefineStaffType;
import GlobalMastersPageObject.SessionTransfer;
import MasterSettingsPageObject.ChangeAcademic;
import PayrollMasterPageObject.AssignSalaryGroupToHead;
import PayrollMasterPageObject.AssignSalaryGroupToStaff;
import PayrollMasterPageObject.BasicSalaryStructure;
import PayrollMasterPageObject.DefineFixation;
import PayrollMasterPageObject.DefineGlobalSettings;
import PayrollMasterPageObject.DefineGradePay;
import PayrollMasterPageObject.DefineITHead;
import PayrollMasterPageObject.DefineITHeadGroups;
import PayrollMasterPageObject.DefineIncomeTaxSlab;
import PayrollMasterPageObject.DefinePayScale;
import PayrollMasterPageObject.DefinePayScaleAmount;
import PayrollMasterPageObject.DefineSalaryAccount;
import PayrollMasterPageObject.DefineSalaryGroup;
import PayrollMasterPageObject.DefineSalaryHead;
import PayrollMasterPageObject.DefineSalaryMonth;
import PayrollMasterPageObject.DefineTDSDeductee;
import PayrollMasterPageObject.GenerateBarCode;
import PayrollMasterPageObject.RelateStaticDynamicHeads;
import SalaryStructurePageObject.AssignInfoBulk;
import SalaryStructurePageObject.AutoIncrement;
import SalaryStructurePageObject.BankStatement;
import SalaryStructurePageObject.BonusCalculations;
import SalaryStructurePageObject.ITHeadEntry;
import SalaryStructurePageObject.IncrementRollback;
import SalaryStructurePageObject.LeaveLwpManual;
import SalaryStructurePageObject.OccasionalAllowanceDeduction;
import SalaryStructurePageObject.SalaryGeneration;
import SalaryStructurePageObject.StaffSalaryStructure;
import SalaryStructurePageObject.TDSEntry;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdvanceEntryReport;
import pageObjects.AdvanceRepaymentReport;
import pageObjects.BankStatementReport;
import pageObjects.ConsolidatedSalaryStatement;
import pageObjects.DateRangeRetirementReport;
import pageObjects.DepartmentWiseReport;
import pageObjects.ESIReport;
import pageObjects.EmployeeStatistics;
import pageObjects.EmployeeTypeWiseReport;
import pageObjects.EstimatedExtraIncome;
import pageObjects.EstimatedSalaryReport;
import pageObjects.ExperienceCertificateReport;
import pageObjects.FixationReport;
import pageObjects.Form16;
import pageObjects.GLSIReport;
import pageObjects.GrossForm16;
import pageObjects.GrossSalaryReport;
import pageObjects.IncrementReport;
import pageObjects.MACPList;
import pageObjects.MonthWiseSalaryReport;
import pageObjects.PFChallanReport;
import pageObjects.PFReport;
import pageObjects.PensionList;
import pageObjects.ProfessionalTax;
import pageObjects.QuarterlyForm24Q;
import pageObjects.RetirementReport;
import pageObjects.SalaryCertificateReport;
import pageObjects.SalaryCompare;
import pageObjects.SalarySheet;
import pageObjects.SalarySlip;
import pageObjects.SalaryStatementEmployeeWise;
import pageObjects.StaffStatement;
import pageObjects.SuperAnnuciationReport;
import pageObjects.TDSEntryReport;

public class MyTestSteps {
  WebDriver dr;
  String schoolname;
  Collection<String> scenario;
  
  @Before
  public void launchBrowser(Scenario sc)
  {
	 //System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	 dr= new ChromeDriver();
	 dr.manage().window().maximize();
	 scenario= sc.getSourceTagNames();
  }
  
  @After
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  dr.quit();
  }
  
  @Given("^user enter url \"([^\"]*)\"$")
  public void user_enter_url(String arg1) throws Throwable {
      dr.get(arg1);
  }

  @When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void user_enter_username_and_password(String arg1, String arg2) throws Throwable {
	  dr.findElement(By.id("txtUserName")).sendKeys(arg1);
	  dr.findElement(By.id("txtPassword")).sendKeys(arg2);
  }

  @When("^passes school name \"([^\"]*)\"$")
  public void passes_school_name(String arg1) throws Throwable {
      schoolname= arg1;
  }

  @When("^click signin$")
  public void click_signin() throws Throwable {
	  dr.findElement(By.id("btnLogin")).click();
	  Thread.sleep(2000);
  }

  @Then("^payroll home page is opened$")
  public void payroll_home_page_is_opened() throws Throwable {
      dr.findElement(By.xpath("//img[@src='images/big/Payroll-Manager.png']")).click();
  }

//advance entry report
  @Given("^advance entry report page opened$")
  public void advance_entry_report_page_opened() throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.openAdvanceEntryReport();
  }

  @When("^user enter from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on advance entry report$")
  public void user_enter_from_date_as_month_year_and_day_on_advance_entry_report(String arg1, String arg2, String arg3) throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.selectFromDate(arg1, arg2, arg3);
  }

  @When("^enter to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on advance entry report$")
  public void enter_to_date_as_month_year_and_day_on_advance_entry_report(String arg1, String arg2, String arg3) throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.selectToDate(arg1, arg2, arg3);
  }

  @When("^select employee type \"([^\"]*)\" on advance entry report$")
  public void select_employee_type_on_advance_entry_report(String arg1) throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.selectEmployeeType(arg1);
  }

  @When("^select designation \"([^\"]*)\" on advance entry report$")
  public void select_designation_on_advance_entry_report(String arg1) throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.selectDesignation(arg1);
  }

  @When("^select employee name \"([^\"]*)\" on advance entry report$")
  public void select_employee_name_on_advance_entry_report(String arg1) throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.selectEmployeeName(arg1);
  }

  @Then("^click show to open advance entry report$")
  public void click_show_to_open_advance_entry_report() throws Throwable {
	  AdvanceEntryReport r= new AdvanceEntryReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//advance repayment report
  @Given("^advance repayment report page opened$")
  public void advance_repayment_report_page_opened() throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.openAdvanceRepaymentReport();
  }

  @When("^user enter from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on advance repayment report$")
  public void user_enter_from_date_as_month_year_and_day_on_advance_repayment_report(String arg1, String arg2, String arg3) throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.selectFromDate(arg1, arg2, arg3);
  }

  @When("^enter to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on advance repayment report$")
  public void enter_to_date_as_month_year_and_day_on_advance_repayment_report(String arg1, String arg2, String arg3) throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.selectToDate(arg1, arg2, arg3);
  }

  @When("^select employee type \"([^\"]*)\" on advance repayment report$")
  public void select_employee_type_on_advance_repayment_report(String arg1) throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.selectEmployeeType(arg1);
  }

  @When("^select designation \"([^\"]*)\" on advance repayment report$")
  public void select_designation_on_advance_repayment_report(String arg1) throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.selectDesignation(arg1);
  }

  @When("^select employee name \"([^\"]*)\" on advance repayment report$")
  public void select_employee_name_on_advance_repayment_report(String arg1) throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.selectEmployeeName(arg1);
  }

  @Then("^click show to open advance repayment report$")
  public void click_show_to_open_advance_repayment_report() throws Throwable {
	  AdvanceRepaymentReport a= new AdvanceRepaymentReport(dr);
	  a.clickShow(schoolname, scenario);
  }

//bank statement report
  @Given("^bank statement report page opened$")
  public void bank_statement_report_page_opened() throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.openBankStatementReport();
  }

  @When("^user select school \"([^\"]*)\" on bank statement report$")
  public void user_select_school_on_bank_statement_report(String arg1) throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.selectSchoolName(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on bank statement report$")
  public void select_salary_month_on_bank_statement_report(String arg1) throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.selectSalaryMonth(arg1);
  }

  @When("^select school bank \"([^\"]*)\" on bank statement report$")
  public void select_school_bank_on_bank_statement_report(String arg1) throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.selectSchoolBank(arg1);
  }

  @When("^select bank name \"([^\"]*)\" on bank statement report$")
  public void select_bank_name_on_bank_statement_report(String arg1) throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.selectBankName(arg1);
  }

  @When("^select salary cheque \"([^\"]*)\" on bank statement report$")
  public void select_salary_cheque_on_bank_statement_report(String arg1) throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.selectSalaryCheque(arg1);
  }

  @Then("^click show to open bank statement report$")
  public void click_show_to_open_bank_statement_report() throws Throwable {
	  BankStatementReport s= new BankStatementReport(dr);
	  s.clickShow(schoolname, scenario);
  }

//department wise report
  @Given("^department wise report page opened$")
  public void department_wise_report_page_opened() throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.openDepartmentWiseReport();
  }

  @When("^user select school bank \"([^\"]*)\" on department wise report$")
  public void user_select_school_bank_on_department_wise_report(String arg1) throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on department wise report$")
  public void select_salary_account_no_on_department_wise_report(String arg1) throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.selectSalaryAccountNo(arg1);
  }

  @When("^select month from \"([^\"]*)\" on department wise report$")
  public void select_month_from_on_department_wise_report(String arg1) throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.selectMonthFrom(arg1);
  }

  @When("^select month to \"([^\"]*)\" on department wise report$")
  public void select_month_to_on_department_wise_report(String arg1) throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.selectMonthTo(arg1);
  }

  @When("^select department \"([^\"]*)\" on department wise report$")
  public void select_department_on_department_wise_report(String arg1) throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.selectDepartment(arg1);
  }

  @Then("^click show to open department wise report$")
  public void click_show_to_open_department_wise_report() throws Throwable {
	  DepartmentWiseReport d= new DepartmentWiseReport(dr);
	  d.clickShow(schoolname, scenario);
  }

//employee type wise report
  @Given("^employee type wise report page opened$")
  public void employee_type_wise_report_page_opened() throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.openEmployeeTypeWiseReport();
  }

  @When("^user select school bank \"([^\"]*)\" on employee type wise report$")
  public void user_select_school_bank_on_employee_type_wise_report(String arg1) throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.selectSchoolBank(arg1);
  }

  @When("^select employee type \"([^\"]*)\" on employee type wise report$")
  public void select_employee_type_on_employee_type_wise_report(String arg1) throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.selectEmployeeType(arg1);
  }

  @When("^select designation \"([^\"]*)\" on employee type wise report$")
  public void select_designation_on_employee_type_wise_report(String arg1) throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.selectDesignation(arg1);
  }

  @When("^select employee name \"([^\"]*)\" on employee type wise report$")
  public void select_employee_name_on_employee_type_wise_report(String arg1) throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.selectEmployeeName(arg1);
  }

  @Then("^click show to open employee type wise report$")
  public void click_show_to_open_employee_type_wise_report() throws Throwable {
	  EmployeeTypeWiseReport e= new EmployeeTypeWiseReport(dr);
	  e.clickShow(schoolname, scenario);
  }

//estimated extra income
  @Given("^estimated extra income report page opened$")
  public void estimated_extra_income_report_page_opened() throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.openEmployeeTypeWiseReport();
  }

  @When("^user select school bank \"([^\"]*)\" on estimated extra income report$")
  public void user_select_school_bank_on_estimated_extra_income_report(String arg1) throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on estimated extra income report$")
  public void select_salary_account_no_on_estimated_extra_income_report(String arg1) throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on estimated extra income report$")
  public void select_staff_type_on_estimated_extra_income_report(String arg1) throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.selectStaffType(arg1);
  }

  @When("^select staff \"([^\"]*)\" on estimated extra income report$")
  public void select_staff_on_estimated_extra_income_report(String arg1) throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.selectStaff(arg1);
  }

  @When("^click estimated extra income on estimated extra income report$")
  public void click_estimated_extra_income_on_estimated_extra_income_report() throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.clickEstimatedExtraIncome();
  }

  @When("^click gross extra income on estimated extra income report$")
  public void click_gross_extra_income_on_estimated_extra_income_report() throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.clickGrossExtraIncome();
  }

  @Then("^click show to open estimated extra income report$")
  public void click_show_to_open_estimated_extra_income_report() throws Throwable {
	  EstimatedExtraIncome e= new EstimatedExtraIncome(dr);
	  e.clickShow(schoolname, scenario);
  }

//gross salary report
  @Given("^gross salary report page opened$")
  public void gross_salary_report_page_opened() throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.openGrossSalaryReport();
  }

  @When("^user select school bank \"([^\"]*)\" on gross salary report$")
  public void user_select_school_bank_on_gross_salary_report(String arg1) throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on gross salary report$")
  public void select_salary_account_no_on_gross_salary_report(String arg1) throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on gross salary report$")
  public void select_staff_type_on_gross_salary_report(String arg1) throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.selectStaffType(arg1);
  }

  @When("^select from month \"([^\"]*)\" on gross salary report$")
  public void select_from_month_on_gross_salary_report(String arg1) throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.selectFromMonth(arg1);
  }

  @When("^select to month \"([^\"]*)\" on gross salary report$")
  public void select_to_month_on_gross_salary_report(String arg1) throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.selectToMonth(arg1);
  }

  @Then("^click show to open gross salary report$")
  public void click_show_to_open_gross_salary_report() throws Throwable {
	  GrossSalaryReport s= new GrossSalaryReport(dr);
	  s.clickShow(schoolname, scenario);
  }

//month wise salary report
  @Given("^month wise salary report page opened$")
  public void month_wise_salary_report_page_opened() throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.openMonthWiseSalaryReport();
  }

  @When("^user select school bank \"([^\"]*)\" on month wise salary report$")
  public void user_select_school_bank_on_month_wise_salary_report(String arg1) throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on month wise salary report$")
  public void select_salary_account_no_on_month_wise_salary_report(String arg1) throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on month wise salary report$")
  public void select_staff_type_on_month_wise_salary_report(String arg1) throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.selectStaffType(arg1);
  }

  @When("^select from month \"([^\"]*)\" on month wise salary report$")
  public void select_from_month_on_month_wise_salary_report(String arg1) throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.selectFromMonth(arg1);
  }

  @When("^select to month \"([^\"]*)\" on month wise salary report$")
  public void select_to_month_on_month_wise_salary_report(String arg1) throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.selectToMonth(arg1);
  }

  @Then("^click show to open month wise salary report$")
  public void click_show_to_open_month_wise_salary_report() throws Throwable {
	  MonthWiseSalaryReport r= new MonthWiseSalaryReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//salary sheet
  @Given("^salary sheet page opened$")
  public void salary_sheet_page_opened() throws Throwable {
	  SalarySheet s= new SalarySheet(dr);
	  s.openSalarySheet();
  }

  @When("^user select school bank \"([^\"]*)\" on salary sheet$")
  public void user_select_school_bank_on_salary_sheet(String arg1) throws Throwable {
	  SalarySheet s= new SalarySheet(dr);
	  s.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on salary sheet$")
  public void select_salary_account_no_on_salary_sheet(String arg1) throws Throwable {
	  SalarySheet s= new SalarySheet(dr);
	  s.selectSalaryAccountNo(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on salary sheet$")
  public void select_salary_month_on_salary_sheet(String arg1) throws Throwable {
	  SalarySheet s= new SalarySheet(dr);
	  s.selectSalaryMonth(arg1);
  }

  @Then("^click show to open salary sheet$")
  public void click_show_to_open_salary_sheet() throws Throwable {
	  SalarySheet s= new SalarySheet(dr);
	  s.clickShow(schoolname, scenario);
  }

//tds entry report
  @Given("^tds entry report page opened$")
  public void tds_entry_report_page_opened() throws Throwable {
	  TDSEntryReport r= new TDSEntryReport(dr);
	  r.openTDSEntryReport();
  }

  @When("^user select month-year \"([^\"]*)\" on tds entry report$")
  public void user_select_month_year_on_tds_entry_report(String arg1) throws Throwable {
	  TDSEntryReport r= new TDSEntryReport(dr);
	  r.selectMonthYear(arg1);
  }

  @Then("^click show to open tds entry report$")
  public void click_show_to_open_tds_entry_report() throws Throwable {
	  TDSEntryReport r= new TDSEntryReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//staff statement
  @Given("^staff statement page opened$")
  public void staff_statement_page_opened() throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.openStaffStatement();
  }

  @When("^user select school bank \"([^\"]*)\" on staff statement$")
  public void user_select_school_bank_on_staff_statement(String arg1) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on staff statement$")
  public void select_salary_account_no_on_staff_statement(String arg1) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on staff statement$")
  public void select_staff_type_on_staff_statement(String arg1) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectStaffType(arg1);
  }

  @When("^select joining from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on staff statement$")
  public void select_joining_from_date_as_month_year_and_day_on_staff_statement(String arg1, String arg2, String arg3) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectJoiningFromdate(arg1, arg2, arg3);
  }

  @When("^select joining to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on staff statement$")
  public void select_joining_to_date_as_month_year_and_day_on_staff_statement(String arg1, String arg2, String arg3) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectJoiningToDate(arg1, arg2, arg3);
  }

  @When("^select salary month \"([^\"]*)\" on staff statement$")
  public void select_salary_month_on_staff_statement(String arg1) throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.selectSalaryMonth(arg1);
  }

  @Then("^click show to open staff statement$")
  public void click_show_to_open_staff_statement() throws Throwable {
	  StaffStatement s= new StaffStatement(dr);
	  s.clickShow(schoolname, scenario);
  }

//salary certificate report
  @Given("^salary certificate report page opened$")
  public void salary_certificate_report_page_opened() throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.openSalaryCertificateReport();
  }

  @When("^user select school bank \"([^\"]*)\" on salary certificate report$")
  public void user_select_school_bank_on_salary_certificate_report(String arg1) throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on salary certificate report$")
  public void select_salary_account_no_on_salary_certificate_report(String arg1) throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.selectSalaryAccountNo(arg1);
  }

  @When("^select format \"([^\"]*)\" on salary certificate report$")
  public void select_format_on_salary_certificate_report(String arg1) throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.selectFormat(arg1);
  }

  @When("^select year \"([^\"]*)\" on salary certificate report$")
  public void select_year_on_salary_certificate_report(String arg1) throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.selectYear(arg1);
  }

  @Then("^click show to open salary certificate report$")
  public void click_show_to_open_salary_certificate_report() throws Throwable {
	  SalaryCertificateReport s= new SalaryCertificateReport(dr);
	  s.clickShow(schoolname, scenario);
  }

//quarterly form 24q
  @Given("^quarterly form (\\d+)q page opened$")
  public void quarterly_form_q_page_opened(int arg1) throws Throwable {
	  QuarterlyForm24Q q= new QuarterlyForm24Q(dr);
	  q.openQuarterlyForm24Q();
  }

  @When("^user select school bank \"([^\"]*)\" on quarterly form (\\d+)q$")
  public void user_select_school_bank_on_quarterly_form_q(String arg1, int arg2) throws Throwable {
	  QuarterlyForm24Q q= new QuarterlyForm24Q(dr);
	  q.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on quarterly form (\\d+)q$")
  public void select_salary_account_no_on_quarterly_form_q(String arg1, int arg2) throws Throwable {
	  QuarterlyForm24Q q= new QuarterlyForm24Q(dr);
	  q.selectsalaryAccountNo(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on quarterly form (\\d+)q$")
  public void select_salary_month_on_quarterly_form_q(String arg1, int arg2) throws Throwable {
	  QuarterlyForm24Q q= new QuarterlyForm24Q(dr);
	  q.selectSalaryMonth(arg1);
  }

  @Then("^click show to open quarterly form (\\d+)q$")
  public void click_show_to_open_quarterly_form_q(int arg1) throws Throwable {
	  QuarterlyForm24Q q= new QuarterlyForm24Q(dr);
	  q.clickShow(schoolname, scenario);
  }

//salary statement employee wise
  @Given("^salary statement employee wise page opened$")
  public void salary_statement_employee_wise_page_opened() throws Throwable {
	  SalaryStatementEmployeeWise s= new SalaryStatementEmployeeWise(dr);
	  s.openSalaryStatementEmployeeWise();
  }

  @When("^user select salary account no \"([^\"]*)\" on salary statement employee wise$")
  public void user_select_salary_account_no_on_salary_statement_employee_wise(String arg1) throws Throwable {
	  SalaryStatementEmployeeWise s= new SalaryStatementEmployeeWise(dr);
	  s.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on salary statement employee wise$")
  public void select_staff_type_on_salary_statement_employee_wise(String arg1) throws Throwable {
	  SalaryStatementEmployeeWise s= new SalaryStatementEmployeeWise(dr);
	  s.selectStaffType(arg1);
  }

  @When("^select staff \"([^\"]*)\" on salary statement employee wise$")
  public void select_staff_on_salary_statement_employee_wise(String arg1) throws Throwable {
	  SalaryStatementEmployeeWise s= new SalaryStatementEmployeeWise(dr);
	  s.selectStaff(arg1);
  }

  @Then("^click show to open salary statement employee wise$")
  public void click_show_to_open_salary_statement_employee_wise() throws Throwable {
	  SalaryStatementEmployeeWise s= new SalaryStatementEmployeeWise(dr);
	  s.clickShow(schoolname, scenario);
  }

//estimated salary report
  @Given("^estimated salary report page opened$")
  public void estimated_salary_report_page_opened() throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.openEstimatedSalaryReport();
  }

  @When("^user select school bank \"([^\"]*)\" on estimated salary report$")
  public void user_select_school_bank_on_estimated_salary_report(String arg1) throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on estimated salary report$")
  public void select_salary_account_no_on_estimated_salary_report(String arg1) throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on estimated salary report$")
  public void select_staff_type_on_estimated_salary_report(String arg1) throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.selectStaffType(arg1);
  }

  @When("^select staff \"([^\"]*)\" on estimated salary report$")
  public void select_staff_on_estimated_salary_report(String arg1) throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.selectStaff(arg1);
  }

  @When("^select format \"([^\"]*)\" on estimated salary report$")
  public void select_format_on_estimated_salary_report(String arg1) throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.selectFormat(arg1);
  }

  @Then("^click show to open estimated salary report$")
  public void click_show_to_open_estimated_salary_report() throws Throwable {
	  EstimatedSalaryReport r= new EstimatedSalaryReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//date range retirement report
  @Given("^date range retirement report page opened$")
  public void date_range_retirement_report_page_opened() throws Throwable {
	  DateRangeRetirementReport d= new DateRangeRetirementReport(dr);
	  d.openDateRangeRetirementReport();
  }

  @When("^user enter from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on date range retirement report$")
  public void user_enter_from_date_as_month_year_and_day_on_date_range_retirement_report(String arg1, String arg2, String arg3) throws Throwable {
	  DateRangeRetirementReport d= new DateRangeRetirementReport(dr);
	  d.selectFromDate(arg1, arg2, arg3);
  }

  @When("^enter to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on date range retirement report$")
  public void enter_to_date_as_month_year_and_day_on_date_range_retirement_report(String arg1, String arg2, String arg3) throws Throwable {
	  DateRangeRetirementReport d= new DateRangeRetirementReport(dr);
	  d.selectToDate(arg1, arg2, arg3);
  }

  @Then("^click show to open date range retirement report$")
  public void click_show_to_open_date_range_retirement_report() throws Throwable {
	  DateRangeRetirementReport d= new DateRangeRetirementReport(dr);   
	  d.clickShow(schoolname, scenario);
  }

//employee statistics
  @Given("^employee statistics report page opened$")
  public void employee_statistics_report_page_opened() throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
	  e.openEmployeeStatistics();
  }

  @When("^user select school bank \"([^\"]*)\" on employee statistics page$")
  public void user_select_school_bank_on_employee_statistics_page(String arg1) throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
	  
  }

  @When("^select salary account no \"([^\"]*)\" on employee statistics page$")
  public void select_salary_account_no_on_employee_statistics_page(String arg1) throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
  }

  @When("^select designation \"([^\"]*)\" on employee statistics page$")
  public void select_designation_on_employee_statistics_page(String arg1) throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
  }

  @When("^select status \"([^\"]*)\" on employee statistics page$")
  public void select_status_on_employee_statistics_page(String arg1) throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
  }

  @When("^click select all on employee statistics page$")
  public void click_select_all_on_employee_statistics_page() throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
	  e.clickSelectAll();
  }

  @Then("^click show to open employee statistics report$")
  public void click_show_to_open_employee_statistics_report() throws Throwable {
	  EmployeeStatistics e= new EmployeeStatistics(dr);
	  e.clickShow(schoolname, scenario);
  }

//esi report
  @Given("^esi report page opened$")
  public void esi_report_page_opened() throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.openESIReport();
  }

  @When("^user select school bank \"([^\"]*)\" on esi report$")
  public void user_select_school_bank_on_esi_report(String arg1) throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on esi report$")
  public void select_salary_account_no_on_esi_report(String arg1) throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.selectSalaryAccountNo(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on esi report$")
  public void select_staff_type_on_esi_report(String arg1) throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.selectStaffType(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on esi report$")
  public void select_salary_month_on_esi_report(String arg1) throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.selectSalaryMonth(arg1);
  }

  @When("^select format \"([^\"]*)\" on esi report$")
  public void select_format_on_esi_report(String arg1) throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.selectFormat(arg1);
  }

  @Then("^click show to open esi report$")
  public void click_show_to_open_esi_report() throws Throwable {
	  ESIReport r= new ESIReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//form16
  @Given("^form(\\d+) report page opened$")
  public void form_report_page_opened(int arg1) throws Throwable {
	  Form16 f= new Form16(dr); 
	  f.openForm16();
  }

  @When("^user select staff type \"([^\"]*)\" on form (\\d+) page$")
  public void user_select_staff_type_on_form_page(String arg1, int arg2) throws Throwable {
	  Form16 f= new Form16(dr); 
	  f.selectStaffType(arg1);
  }

  @When("^select staff name \"([^\"]*)\" on form (\\d+) page$")
  public void select_staff_name_on_form_page(String arg1, int arg2) throws Throwable {
	  Form16 f= new Form16(dr); 
	  f.selectStaffName(arg1);
  }

  @Then("^click show to open form (\\d+) page$")
  public void click_show_to_open_form_page(int arg1) throws Throwable {
	  Form16 f= new Form16(dr); 
	  f.clickShow(schoolname, scenario);
  }

//pfchallan report
  @Given("^pfchallan report page opened$")
  public void pfchallan_report_page_opened() throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.openPFChallanReport();
  }

  @When("^user select school bank \"([^\"]*)\" on pfchallan report$")
  public void user_select_school_bank_on_pfchallan_report(String arg1) throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on pfchallan report$")
  public void select_salary_account_no_on_pfchallan_report(String arg1) throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.selectSalaryAccountNo(arg1);
  }

  @When("^select format \"([^\"]*)\" on pfchallan report$")
  public void select_format_on_pfchallan_report(String arg1) throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.selectFormat(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on pfchallan report$")
  public void select_salary_month_on_pfchallan_report(String arg1) throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.selectSalaryMonth(arg1);
  }

  @Then("^click show to open pfchallan report$")
  public void click_show_to_open_pfchallan_report() throws Throwable {
	  PFChallanReport p= new PFChallanReport(dr);
	  p.clickShow(schoolname, scenario);
  }

//retirement report
  @Given("^retirement report page opened$")
  public void retirement_report_page_opened() throws Throwable {
	  RetirementReport r= new RetirementReport(dr);
	  r.openRetirementReport();
  }

  @When("^user select month and year \"([^\"]*)\" on retirement report$")
  public void user_select_month_and_year_on_retirement_report(String arg1) throws Throwable {
	  RetirementReport r= new RetirementReport(dr);
	  r.selectMonthAndYear(arg1);
  }

  @Then("^click show to open retirement report$")
  public void click_show_to_open_retirement_report() throws Throwable {
	  RetirementReport r= new RetirementReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//pf report
  @Given("^pf report page opened$")
  public void pf_report_page_opened() throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.openPFReport();
  }

  @When("^user select school bank \"([^\"]*)\" on pf report$")
  public void user_select_school_bank_on_pf_report(String arg1) throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.selectSchoolbank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on pf report$")
  public void select_salary_account_no_on_pf_report(String arg1) throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.selectSalaryAccountNo(arg1);
  }

  @When("^select format \"([^\"]*)\" on pf report$")
  public void select_format_on_pf_report(String arg1) throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.selectFormat(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on pf report$")
  public void select_salary_month_on_pf_report(String arg1) throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.selectSalaryMonth(arg1);
  }

  @Then("^click show to open pf report$")
  public void click_show_to_open_pf_report() throws Throwable {
	  PFReport p= new PFReport(dr);
	  p.clickShow(schoolname, scenario);
  }

//professional tax
  @Given("^professional tax report page opened$")
  public void professional_tax_report_page_opened() throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.openProfessionalTax();
  }

  @When("^user select school name \"([^\"]*)\" on professional tax report$")
  public void user_select_school_name_on_professional_tax_report(String arg1) throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.selectSchoolName(arg1);
  }

  @When("^user select school bank \"([^\"]*)\" on professional tax report$")
  public void user_select_school_bank_on_professional_tax_report(String arg1) throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on professional tax report$")
  public void select_salary_account_no_on_professional_tax_report(String arg1) throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.selectSalaryAccountNo(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on professional tax report$")
  public void select_salary_month_on_professional_tax_report(String arg1) throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.selectSalaryMonth(arg1);
  }

  @Then("^click show to open professional tax report$")
  public void click_show_to_open_professional_tax_report() throws Throwable {
	  ProfessionalTax p= new ProfessionalTax(dr);
	  p.clickShow(schoolname, scenario);
  }

//pension list
  @Given("^pension list report page opened$")
  public void pension_list_report_page_opened() throws Throwable {
	  PensionList p= new PensionList(dr);
	  p.openPensionList();
  }

  @Then("^click show to open pension list report$")
  public void click_show_to_open_pension_list_report() throws Throwable {
	  PensionList p= new PensionList(dr);
	  p.clickShow(schoolname, scenario);
  }
  
//super annuciation report
  @Given("^super annuciation report page opened$")
  public void super_annuciation_report_page_opened() throws Throwable {
	  SuperAnnuciationReport s= new SuperAnnuciationReport(dr);
	  s.openSuperAnnuciationReport();
  }

  @Then("^click show to open super annuciation report$")
  public void click_show_to_open_super_annuciation_report() throws Throwable {
	  SuperAnnuciationReport s= new SuperAnnuciationReport(dr);
	  s.clickShow(schoolname, scenario);
  }

//macp list
  @Given("^macp list report page opened$")
  public void macp_list_report_page_opened() throws Throwable {
	  MACPList l=new MACPList(dr);
	  l.openMACPList();
  }

  @When("^user select school bank \"([^\"]*)\" on macp list report$")
  public void user_select_school_bank_on_macp_list_report(String arg1) throws Throwable {
	  MACPList l=new MACPList(dr);
	  l.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on macp list report$")
  public void select_salary_account_no_on_macp_list_report(String arg1) throws Throwable {
	  MACPList l=new MACPList(dr);
	  l.selectSalaryAccountNo(arg1);
  }

  @When("^select format \"([^\"]*)\" on macp list report$")
  public void select_format_on_macp_list_report(String arg1) throws Throwable {
	  MACPList l=new MACPList(dr);
	  l.selectFormat(arg1);
  }

  @Then("^click show to open macp list report$")
  public void click_show_to_open_macp_list_report() throws Throwable {
	  MACPList l=new MACPList(dr);
	  l.clickShow(schoolname, scenario);
  }

//fixation report
  @Given("^fixation report page opened$")
  public void fixation_report_page_opened() throws Throwable {
	  FixationReport f= new FixationReport(dr);
	  f.openFixationReport();
  }

  @When("^user select school bank \"([^\"]*)\" on fixation report$")
  public void user_select_school_bank_on_fixation_report(String arg1) throws Throwable {
	  FixationReport f= new FixationReport(dr);
	  f.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on fixation report$")
  public void select_salary_account_no_on_fixation_report(String arg1) throws Throwable {
	  FixationReport f= new FixationReport(dr);
	  f.selectSalaryAccountNo(arg1);
  }

  @When("^select in detail on fixation report$")
  public void select_in_detail_on_fixation_report() throws Throwable {
	  FixationReport f= new FixationReport(dr);
	  f.clickInDetail();
  }

  @Then("^click show to open fixation report$")
  public void click_show_to_open_fixation_report() throws Throwable {
	  FixationReport f= new FixationReport(dr);
	  f.clickShow(schoolname, scenario);
  }
  
//experience certificate report
  @Given("^experience certificate report page opened$")
  public void experience_certificate_report_page_opened() throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.openExperienceCertificateReport();
  }

  @When("^user select school bank \"([^\"]*)\" on experience certificate report$")
  public void user_select_school_bank_on_experience_certificate_report(String arg1) throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on experience certificate report$")
  public void select_salary_account_no_on_experience_certificate_report(String arg1) throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.selectSalaryAccountNo(arg1);
  }

  @When("^select format \"([^\"]*)\" on experience certificate report$")
  public void select_format_on_experience_certificate_report(String arg1) throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.selectFormat(arg1);
  }

  @When("^select month year \"([^\"]*)\" on experience certificate report$")
  public void select_month_year_on_experience_certificate_report(String arg1) throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.selectMonthYear(arg1);
  }

  @Then("^click show to open experience certificate report$")
  public void click_show_to_open_experience_certificate_report() throws Throwable {
	  ExperienceCertificateReport e= new ExperienceCertificateReport(dr);
	  e.clickShow(schoolname, scenario);
  }

//glsi report
  @Given("^glsi report page opened$")
  public void glsi_report_page_opened() throws Throwable {
	  GLSIReport r= new GLSIReport(dr);
	  r.openGLSIReport();
  }

  @When("^user select school bank \"([^\"]*)\" on glsi report$")
  public void user_select_school_bank_on_glsi_report(String arg1) throws Throwable {
	  GLSIReport r= new GLSIReport(dr);
	  r.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on glsi report$")
  public void select_salary_account_no_on_glsi_report(String arg1) throws Throwable {
	  GLSIReport r= new GLSIReport(dr);
	  r.selectSalaryAccountNo(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on glsi report$")
  public void select_salary_month_on_glsi_report(String arg1) throws Throwable {
	  GLSIReport r= new GLSIReport(dr);
	  r.selectSalaryMonth(arg1);
  }

  @Then("^click show to open glsi report$")
  public void click_show_to_open_glsi_report() throws Throwable {
	  GLSIReport r= new GLSIReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//gross from16
  @Given("^gross form(\\d+) report page opened$")
  public void gross_form_report_page_opened(int arg1) throws Throwable {
	  GrossForm16 g= new GrossForm16(dr);
	  g.openGrossForm16();
  }

  @When("^user select school name \"([^\"]*)\" on gross form(\\d+) report$")
  public void user_select_school_name_on_gross_form_report(String arg1, int arg2) throws Throwable {
	  GrossForm16 g= new GrossForm16(dr);
	  g.selectSchoolName(arg1);
  }

  @When("^select school bank \"([^\"]*)\" on gross form(\\d+) report$")
  public void select_school_bank_on_gross_form_report(String arg1, int arg2) throws Throwable {
	  GrossForm16 g= new GrossForm16(dr);
	  g.selectSchoolBank(arg1);
  }

  @When("^select session \"([^\"]*)\" on gross form(\\d+) report$")
  public void select_session_on_gross_form_report(String arg1, int arg2) throws Throwable {
	  GrossForm16 g= new GrossForm16(dr);
	  g.selectSession(arg1);
  }

  @Then("^click show to open gross form(\\d+) report$")
  public void click_show_to_open_gross_form_report(int arg1) throws Throwable {
	  GrossForm16 g= new GrossForm16(dr);
	  g.clickShow(schoolname, scenario);
  }

//salary compare
  @Given("^salary compare page opened$")
  public void salary_compare_page_opened() throws Throwable {
	  SalaryCompare c= new SalaryCompare(dr);
	  c.openSalaryCompare();
  }

  @When("^user select school bank \"([^\"]*)\" on salary compare report$")
  public void user_select_school_bank_on_salary_compare_report(String arg1) throws Throwable {
	  SalaryCompare c= new SalaryCompare(dr);
	  c.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on salary compare report$")
  public void select_salary_account_no_on_salary_compare_report(String arg1) throws Throwable {
	  SalaryCompare c= new SalaryCompare(dr);
	  c.selectSalaryAccountNo(arg1);
  }

  @Then("^click show to open salary compare report$")
  public void click_show_to_open_salary_compare_report() throws Throwable {
	  SalaryCompare c= new SalaryCompare(dr);
	  c.clickShow(schoolname, scenario);
  }

//increment report
  @Given("^increment report page opened$")
  public void increment_report_page_opened() throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.openIncrementReport();
  }

  @When("^user select school bank \"([^\"]*)\" on increment report$")
  public void user_select_school_bank_on_increment_report(String arg1) throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.selectSchoolBank(arg1);
  }

  @When("^select salary account no \"([^\"]*)\" on increment report$")
  public void select_salary_account_no_on_increment_report(String arg1) throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.selectSalaryAccountNo(arg1);
  }
  
  @When("^select increment \"([^\"]*)\" on increment report$")
  public void select_increment_on_increment_report(String arg1) throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.selectIncrement(arg1);
  }

  @When("^select status \"([^\"]*)\" on increment report$")
  public void select_status_on_increment_report(String arg1) throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.selectStatus(arg1);
  }

  @Then("^click show to open increment report$")
  public void click_show_to_open_increment_report() throws Throwable {
	  IncrementReport r= new IncrementReport(dr);
	  r.clickShow(schoolname, scenario);
  }

//salary slip
  @Given("^salary slip page opened$")
  public void salary_slip_page_opened() throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.openSalarySlip();
  }

  @When("^user select school name \"([^\"]*)\" on salary slip$")
  public void user_select_school_name_on_salary_slip(String arg1) throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.selectSchoolName(arg1);
  }

  @When("^select staff type \"([^\"]*)\" on salary slip$")
  public void select_staff_type_on_salary_slip(String arg1) throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.selectStaffType(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on salary slip$")
  public void select_salary_month_on_salary_slip(String arg1) throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.selectSalaryMonth(arg1);
  }

  @Then("^click show to open salary slip$")
  public void click_show_to_open_salary_slip() throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.clickShow();
  }
  
  @Then("^select employee \"([^\"]*)\" on salary slip$")
  public void select_employee_on_salary_slip(String arg1) throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.selectEmployee(arg1);
  }
  
  @Then("^click print to view salary slip$")
  public void click_print_to_view_salary_slip() throws Throwable {
	  SalarySlip s= new SalarySlip(dr);
	  s.clickPrint(schoolname, scenario);
  }

//consolidated salary statement
  @Given("^consolidated salary statement page opened$")
  public void consolidated_salary_statement_page_opened() throws Throwable {
	  ConsolidatedSalaryStatement s= new ConsolidatedSalaryStatement(dr);
	  s.openConsolidatedSalaryStatement();
  }

  @When("^user select staff type \"([^\"]*)\" on consolidated salary statement$")
  public void user_select_staff_type_on_consolidated_salary_statement(String arg1) throws Throwable {
	  ConsolidatedSalaryStatement s= new ConsolidatedSalaryStatement(dr);
	  s.selectStaffType(arg1);
  }

  @When("^select salary month \"([^\"]*)\" on consolidated salary statement$")
  public void select_salary_month_on_consolidated_salary_statement(String arg1) throws Throwable {
	  ConsolidatedSalaryStatement s= new ConsolidatedSalaryStatement(dr);
	  s.selectSalaryMonth(arg1);
  }

  @Then("^click show to open consolidated salary statement$")
  public void click_show_to_open_consolidated_salary_statement() throws Throwable {
	  ConsolidatedSalaryStatement s= new ConsolidatedSalaryStatement(dr);
	  s.clickShow();
  }

  @Then("^select employee \"([^\"]*)\" on consolidated salary statement$")
  public void select_employee_on_consolidated_salary_statement(String arg1) throws Throwable {
	  ConsolidatedSalaryStatement s= new ConsolidatedSalaryStatement(dr);
	  s.selectEmployee(arg1, schoolname, scenario);
  }
  
//change academic
  @When("^user open change academic page$")
  public void user_open_change_academic_page() throws Throwable {
	  ChangeAcademic ca= new ChangeAcademic(dr);
	  ca.openChangeAcademic();
  }

  @Then("^verify change academic page$")
  public void verify_change_academic_page() throws Throwable {
	  ChangeAcademic ca= new ChangeAcademic(dr);
	  ca.verifyPage(schoolname, scenario);
  }
  
//define profession
  @When("^user open define profession page$")
  public void user_open_define_profession_page() throws Throwable {
	  DefineProfession dp= new DefineProfession(dr);
	  dp.openDefineProfession();
  }

  @Then("^verify define profession page$")
  public void verify_define_profession_page() throws Throwable {
	  DefineProfession dp= new DefineProfession(dr);
	  dp.verifyPage(schoolname, scenario);
  }

  @When("^enter profession as \"([^\"]*)\"$")
  public void enter_profession_as(String arg1) throws Throwable {
      DefineProfession dp= new DefineProfession(dr);
      dp.enterProfession(arg1);
  }

  @Then("^click save on define profession page$")
  public void click_save_on_define_profession_page() throws Throwable {
      DefineProfession dp= new DefineProfession(dr);
      dp.clickSave(schoolname, scenario);
  }

  @Then("^click view on define profession page$")
  public void click_view_on_define_profession_page() throws Throwable {
      DefineProfession dp= new DefineProfession(dr);
      dp.clickView(schoolname, scenario);
  }

//define staff type
  @When("^user open define staff type page$")
  public void user_open_define_staff_type_page() throws Throwable {
	  DefineStaffType dst= new DefineStaffType(dr);
	  dst.openDefineStaffType();
  }

  @Then("^verify define staff type page$")
  public void verify_define_staff_type_page() throws Throwable {
	  DefineStaffType dst= new DefineStaffType(dr);
	  dst.verifyPage(schoolname, scenario);
  }

    @When("^enter staff type as \"([^\"]*)\" on define staff type page$")
    public void enter_staff_type_as_on_define_staff_type_page(String arg1) throws Throwable {
        DefineStaffType dst= new DefineStaffType(dr);
        dst.enterStaffType(arg1);
    }

    @When("^select show on e care on define staff type page$")
    public void select_show_on_e_care_on_define_staff_type_page() throws Throwable {
        DefineStaffType dst= new DefineStaffType(dr);
        dst.selectClickOnECare();
    }

    @Then("^click save on define staff type page$")
    public void click_save_on_define_staff_type_page() throws Throwable {
        DefineStaffType dst= new DefineStaffType(dr);
        dst.clickSave(schoolname, scenario);
    }

    @Then("^click view on define staff type page$")
    public void click_view_on_define_staff_type_page() throws Throwable {
        DefineStaffType dst= new DefineStaffType(dr);
        dst.clickView(schoolname, scenario);
    }

//define department
  @When("^user open define department page$")
  public void user_open_define_department_page() throws Throwable {
	  DefineDepartment dd= new DefineDepartment(dr);
	  dd.openDefineDepartment();
  }

  @Then("^verify define department page$")
  public void verify_define_department_page() throws Throwable {
	  DefineDepartment dd= new DefineDepartment(dr);
	  dd.verifyPage(schoolname, scenario);
  }

//define sms template
  @When("^user open define sms template page$")
  public void user_open_define_sms_template_page() throws Throwable {
	  DefineSmsTemplate dst= new DefineSmsTemplate(dr); 
	  dst.openDefineSmsTemplate();
  }

  @Then("^verify define sms template page$")
  public void verify_define_sms_template_page() throws Throwable {
	  DefineSmsTemplate dst= new DefineSmsTemplate(dr); 
	  dst.verifyPage(schoolname, scenario);
  }

//define designation
  @When("^user open define designation page$")
  public void user_open_define_designation_page() throws Throwable {
	  DefineDesignation dd= new DefineDesignation(dr);
	  dd.openDefineDesignation();
  }

  @Then("^verify define designation page$")
  public void verify_define_designation_page() throws Throwable {
	  DefineDesignation dd= new DefineDesignation(dr);
	  dd.verifyPage(schoolname, scenario);
  }
  
//define academic year
  @When("^user open define academic year page$")
  public void user_open_define_academic_year_page() throws Throwable {
	  DefineAcademicYear day= new DefineAcademicYear(dr);
	  day.openDefineAcademicYear();
  }

  @Then("^verify define academic year page$")
  public void verify_define_academic_year_page() throws Throwable {
	  DefineAcademicYear day= new DefineAcademicYear(dr);
	  day.verifyPage(schoolname, scenario);
  }
  
//define financial year
  @When("^user open define financial year page$")
  public void user_open_define_financial_year_page() throws Throwable {
	  DefineFinancialYear dfy= new DefineFinancialYear(dr);
	  dfy.openDefineFinancialYear();
  }

  @Then("^verify define financial year page$")
  public void verify_define_financial_year_page() throws Throwable {
	  DefineFinancialYear dfy= new DefineFinancialYear(dr);
	  dfy.verifyPage(schoolname, scenario);
  }

//session transfer
  @When("^user open session transfer page$")
  public void user_open_session_transfer_page() throws Throwable {
	  SessionTransfer st= new SessionTransfer(dr);
	  st.openSessionTransfer();
  }

  @Then("^verify session transfer page$")
  public void verify_session_transfer_page() throws Throwable {
	  SessionTransfer st= new SessionTransfer(dr);
	  st.verifyPage(schoolname, scenario);
  }

  @Then("^verify account manager session transfer page$")
  public void verify_account_manager_session_transfer_page() throws Throwable {
	  SessionTransfer st= new SessionTransfer(dr);
	  st.verifyAccountManagerPage(schoolname, scenario);
  }
  
  @Then("^verify fee manager session transfer page$")
  public void verify_fee_manager_session_transfer_page() throws Throwable {
	  SessionTransfer st= new SessionTransfer(dr);
	  st.verifyFeesManagerPage(schoolname, scenario);
  }
  
//define salary account
  @When("^user open define salary account page$")
  public void user_open_define_salary_account_page() throws Throwable {
	  DefineSalaryAccount dsa= new DefineSalaryAccount(dr);
	  dsa.openDefineSalaryAccount();
  }

  @Then("^verify define salary account page$")
  public void verify_define_salary_account_page() throws Throwable {
	  DefineSalaryAccount dsa= new DefineSalaryAccount(dr);
	  dsa.verifyPage(schoolname, scenario);
  }
  
//define global settings
  @When("^user open define global settings page$")
  public void user_open_define_global_settings_page() throws Throwable {
	  DefineGlobalSettings dgs= new DefineGlobalSettings(dr);
	  dgs.openDefineGlobalSettings();
  }

  @Then("^verify define global settings page$")
  public void verify_define_global_settings_page() throws Throwable {
	  DefineGlobalSettings dgs= new DefineGlobalSettings(dr);
	  dgs.verifyPage(schoolname, scenario);
  }
  
//define salary month
  @When("^user open define salary month page$")
  public void user_open_define_salary_month_page() throws Throwable {
	  DefineSalaryMonth dsm= new DefineSalaryMonth(dr);
	  dsm.openDefineSalaryMonth();
  }

  @Then("^verify define salary month page$")
  public void verify_define_salary_month_page() throws Throwable {
	  DefineSalaryMonth dsm= new DefineSalaryMonth(dr);
	  dsm.verifyPage(schoolname, scenario);
  }
  
//define income tax slab
  @When("^user open define income tax slab page$")
  public void user_open_define_income_tax_slab_page() throws Throwable {
	  DefineIncomeTaxSlab dits= new DefineIncomeTaxSlab(dr);
	  dits.openDefineIncomeTaxSlab();
  }

  @Then("^verify define income tax slab page$")
  public void verify_define_income_tax_slab_page() throws Throwable {
	  DefineIncomeTaxSlab dits= new DefineIncomeTaxSlab(dr);
	  dits.verifyPage(schoolname, scenario);
  }
  
//define salary group
  @When("^user open define salary group page$")
  public void user_open_define_salary_group_page() throws Throwable {
	  DefineSalaryGroup dsg= new DefineSalaryGroup(dr);
	  dsg.openDefineSalaryGroup();
  }

  @Then("^verify define salary group page$")
  public void verify_define_salary_group_page() throws Throwable {
	  DefineSalaryGroup dsg= new DefineSalaryGroup(dr);
	  dsg.verifyPage(schoolname, scenario);
  }
  
//define salary head
  @When("^user open define salary head page$")
  public void user_open_define_salary_head_page() throws Throwable {
	  DefineSalaryHead dsh= new DefineSalaryHead(dr);
	  dsh.openDefineSalaryHead();
  }

  @Then("^verify define salary head page$")
  public void verify_define_salary_head_page() throws Throwable {
	  DefineSalaryHead dsh= new DefineSalaryHead(dr);
	  dsh.verifyPage(schoolname, scenario);
  }
  
//relate static dynamic heads
  @When("^user open relate static dynamic heads page$")
  public void user_open_relate_static_dynamic_heads_page() throws Throwable {
	  RelateStaticDynamicHeads rsdh= new RelateStaticDynamicHeads(dr);
	  rsdh.openRelateStaticDynamicHeads();
  }

  @Then("^verify relate static dynamic heads page$")
  public void verify_relate_static_dynamic_heads_page() throws Throwable {
	  RelateStaticDynamicHeads rsdh= new RelateStaticDynamicHeads(dr);
	  rsdh.verifyPage(schoolname, scenario);
  }

//assign salary group to head
  @When("^user open assign salary group to head page$")
  public void user_open_assign_salary_group_to_head_page() throws Throwable {
	  AssignSalaryGroupToHead asgh= new AssignSalaryGroupToHead(dr);
	  asgh.openAssignSalaryGroupToHead();
  }

  @Then("^verify assign salary group to head page$")
  public void verify_assign_salary_group_to_head_page() throws Throwable {
	  AssignSalaryGroupToHead asgh= new AssignSalaryGroupToHead(dr);
	  asgh.verifyPage(schoolname, scenario);
  }
  
//assign salary group to staff
  @When("^user open assign salary group to staff page$")
  public void user_open_assign_salary_group_to_staff_page() throws Throwable {
	  AssignSalaryGroupToStaff asgs= new AssignSalaryGroupToStaff(dr);
	  asgs.openAssignSalaryGroupToStaff();
  }

  @Then("^verify assign salary group to staff page$")
  public void verify_assign_salary_group_to_staff_page() throws Throwable {
	  AssignSalaryGroupToStaff asgs= new AssignSalaryGroupToStaff(dr);
	  asgs.verifyPage(schoolname, scenario);
  }
  
//define it head groups
  @When("^user open define it head groups page$")
  public void user_open_define_it_head_groups_page() throws Throwable {
	  DefineITHeadGroups dhg= new DefineITHeadGroups(dr);
	  dhg.openDefineITHeadGroups();
  }

  @Then("^verify define it head groups page$")
  public void verify_define_it_head_groups_page() throws Throwable {
	  DefineITHeadGroups dhg= new DefineITHeadGroups(dr);
	  dhg.verifyPage(schoolname, scenario);
  }

//define it head 
  @When("^user open define it head page$")
  public void user_open_define_it_head_page() throws Throwable {
	  DefineITHead dh= new DefineITHead(dr);
	  dh.openDefineITHead();
  }

  @Then("^verify define it head page$")
  public void verify_define_it_head_page() throws Throwable {
	  DefineITHead dh= new DefineITHead(dr);
	  dh.verifyPage(schoolname, scenario);
  }
  
//define tds deductee
  @When("^user open define tds deductee page$")
  public void user_open_define_tds_deductee_page() throws Throwable {
	  DefineTDSDeductee dtd= new DefineTDSDeductee(dr);
	  dtd.openDefineTDSDeductee();
  }

  @Then("^verify define tds deductee page$")
  public void verify_define_tds_deductee_page() throws Throwable {
	  DefineTDSDeductee dtd= new DefineTDSDeductee(dr);
	  dtd.verifyPage(schoolname, scenario);
  }

//basic salary structure
  @When("^user open basic salary structure page$")
  public void user_open_basic_salary_structure_page() throws Throwable {
	  BasicSalaryStructure bss= new BasicSalaryStructure(dr);
	  bss.openBasicSalaryStructure();
  }

  @Then("^verify basic salary structure page$")
  public void verify_basic_salary_structure_page() throws Throwable {
	  BasicSalaryStructure bss= new BasicSalaryStructure(dr);
	  bss.verifyPage(schoolname, scenario);
  }

//generate bar code
  @When("^user open generate bar code page$")
  public void user_open_generate_bar_code_page() throws Throwable {
	  GenerateBarCode gbc= new GenerateBarCode(dr);
	  gbc.openGenerateBarCode();
  }

  @Then("^verify generate bar code page$")
  public void verify_generate_bar_code_page() throws Throwable {
	  GenerateBarCode gbc= new GenerateBarCode(dr);
	  gbc.verifyPage(schoolname, scenario);
  }
  
//define pay scale
  @When("^user open define pay scale page$")
  public void user_open_define_pay_scale_page() throws Throwable {
	  DefinePayScale dps= new DefinePayScale(dr);
	  dps.openDefinePayScale();
  }

  @Then("^verify define pay scale page$")
  public void verify_define_pay_scale_page() throws Throwable {
	  DefinePayScale dps= new DefinePayScale(dr);
	  dps.verifyPage(schoolname, scenario);
  }
  
//define pay scale amount
  @When("^user open define pay scale amount page$")
  public void user_open_define_pay_scale_amount_page() throws Throwable {
	  DefinePayScaleAmount dpsa= new DefinePayScaleAmount(dr);
	  dpsa.openDefinePayScaleAmount();
  }

  @Then("^verify define pay scale amount page$")
  public void verify_define_pay_scale_amount_page() throws Throwable {
	  DefinePayScaleAmount dpsa= new DefinePayScaleAmount(dr);
	  dpsa.verifyPage(schoolname, scenario);
  }
//define grade pay
  @When("^user open define grade pay page$")
  public void user_open_define_grade_pay_page() throws Throwable {
	  DefineGradePay dgp= new DefineGradePay(dr);
	  dgp.openDefineGradePay();
  }

  @Then("^verify define grade pay page$")
  public void verify_define_grade_pay_page() throws Throwable {
	  DefineGradePay dgp= new DefineGradePay(dr);
	  dgp.verifyPage(schoolname, scenario);
  }
  
//define fixation
  @When("^user open define fixation page$")
  public void user_open_define_fixation_page() throws Throwable {
	  DefineFixation df= new DefineFixation(dr);
	  df.openDefineFixation();
  }

  @Then("^verify define fixation page$")
  public void verify_define_fixation_page() throws Throwable {
	  DefineFixation df= new DefineFixation(dr);
	  df.verifyPage(schoolname, scenario);
  }
  
//staff salary structure
  @When("^user open staff salary structure page$")
  public void user_open_staff_salary_structure_page() throws Throwable {
	  StaffSalaryStructure dss= new StaffSalaryStructure(dr);
	  dss.openStaffSalaryStructure();
  }

  @Then("^verify staff salary structure page$")
  public void verify_staff_salary_structure_page() throws Throwable {
	  StaffSalaryStructure dss= new StaffSalaryStructure(dr);
	  dss.verifyPage(schoolname, scenario);
  }
  
//assign info bulk
  @When("^user open assign info bulk page$")
  public void user_open_assign_info_bulk_page() throws Throwable {
	  AssignInfoBulk aib= new AssignInfoBulk(dr);
	  aib.openAssignInfoBulk();
  }

  @Then("^verify assign info bulk page$")
  public void verify_assign_info_bulk_page() throws Throwable {
	  AssignInfoBulk aib= new AssignInfoBulk(dr);
	  aib.verifyPage(schoolname, scenario);
  }
  
//bonus calculations
  @When("^user open bonus calculations page$")
  public void user_open_bonus_calculations_page() throws Throwable {
	  BonusCalculations bc= new BonusCalculations(dr);
	  bc.openBonusCalculations();
  }

  @Then("^verify bonus calculations page$")
  public void verify_bonus_calculations_page() throws Throwable {
	  BonusCalculations bc= new BonusCalculations(dr);
	  bc.verifyPage(schoolname, scenario);
  }

//leave lwp manual
  @When("^user open leave lwp manual page$")
  public void user_open_leave_lwp_manual_page() throws Throwable {
	  LeaveLwpManual llm= new LeaveLwpManual(dr);
	  llm.openLeaveLwpManual();
  }

  @Then("^verify leave lwp manual page$")
  public void verify_leave_lwp_manual_page() throws Throwable {
	  LeaveLwpManual llm= new LeaveLwpManual(dr);
	  llm.verifyPage(schoolname, scenario);
  }
  
//occasional allowance deduction
  @When("^user open occasional allowance deduction page$")
  public void user_open_occasional_allowance_deduction_page() throws Throwable {
	  OccasionalAllowanceDeduction oad= new OccasionalAllowanceDeduction(dr);
	  oad.openOccasionalAllowanceDeduction();
  }

  @Then("^verify occasional allowance deduction page$")
  public void verify_occasional_allowance_deduction_page() throws Throwable {
	  OccasionalAllowanceDeduction oad= new OccasionalAllowanceDeduction(dr);
	  oad.verifyPage(schoolname, scenario);
  }
  
//salary generation
  @When("^user open salary generation page$")
  public void user_open_salary_generation_page() throws Throwable {
	  SalaryGeneration sg= new SalaryGeneration(dr);
	  sg.openSalaryGeneration();
  }

  @Then("^verify salary generation page$")
  public void verify_salary_generation_page() throws Throwable {
	  SalaryGeneration sg= new SalaryGeneration(dr);
	  sg.verifyPage(schoolname, scenario);
  }

//increment roll back
  @When("^user open increment roll back page$")
  public void user_open_increment_roll_back_page() throws Throwable {
	  IncrementRollback irb= new IncrementRollback(dr);
	  irb.openIncrementRollback();
  }

  @Then("^verify increment roll back page$")
  public void verify_increment_roll_back_page() throws Throwable {
	  IncrementRollback irb= new IncrementRollback(dr);
	  irb.verifyPage(schoolname, scenario);
  }
  
//bank statement
  @When("^user open bank statement page$")
  public void user_open_bank_statement_page() throws Throwable {
	  BankStatement bs= new BankStatement(dr);
	  bs.openBankStatement();
  }

  @Then("^verify bank statement page$")
  public void verify_bank_statement_page() throws Throwable {
	  BankStatement bs= new BankStatement(dr);
	  bs.verifyPage(schoolname, scenario);
  }
  
//it head entry
  @When("^user open it head entry page$")
  public void user_open_it_head_entry_page() throws Throwable {
	  ITHeadEntry ihe= new ITHeadEntry(dr);
	  ihe.openITHeadEntry();
  }

  @Then("^verify it head entry page$")
  public void verify_it_head_entry_page() throws Throwable {
	  ITHeadEntry ihe= new ITHeadEntry(dr);
	  ihe.verifyPage(schoolname, scenario);
  }
  
//tds entry
  @When("^user open tds entry page$")
  public void user_open_tds_entry_page() throws Throwable {
	  TDSEntry te= new TDSEntry(dr);
	  te.openTDSEntry();
  }

  @Then("^verify tds entry page$")
  public void verify_tds_entry_page() throws Throwable {
	  TDSEntry te= new TDSEntry(dr);
	  te.verifyPage(schoolname, scenario);
  }

//auto increment
  @When("^user open auto increment page$")
  public void user_open_auto_increment_page() throws Throwable {
	  AutoIncrement ai= new AutoIncrement(dr);
	  ai.openAutoIncrement();
  }

  @Then("^verify auto increment page$")
  public void verify_auto_increment_page() throws Throwable {
	  AutoIncrement ai= new AutoIncrement(dr);
	  ai.verifyPage(schoolname, scenario);
  }
  
//fix advance account
  @When("^user open fix advance account page$")
  public void user_open_fix_advance_account_page() throws Throwable {
	  FixAdvanceAccount faa= new FixAdvanceAccount(dr);
	  faa.openFixAdvanceAccount();
  }

  @Then("^verify fix advance account page$")
  public void verify_fix_advance_account_page() throws Throwable {
	  FixAdvanceAccount faa= new FixAdvanceAccount(dr);
	  faa.verifyPage(schoolname, scenario);
  }

//advance entry
  @When("^user open advance entry page$")
  public void user_open_advance_entry_page() throws Throwable {
	  AdvanceEntry ae= new AdvanceEntry(dr);
	  ae.openAdvanceEntry();
  }

  @Then("^verify advance entry page$")
  public void verify_advance_entry_page() throws Throwable {
	  AdvanceEntry ae= new AdvanceEntry(dr);
	  ae.verifyPage(schoolname, scenario);
  }

//advance repayment
  @When("^user open advance repayment page$")
  public void user_open_advance_repayment_page() throws Throwable {
	  AdvanceRepayment ar= new AdvanceRepayment(dr);
	  ar.openAdvanceRepayment();
  }

  @Then("^verify advance repayment page$")
  public void verify_advance_repayment_page() throws Throwable {
	  AdvanceRepayment ar= new AdvanceRepayment(dr);
	  ar.verifyPage(schoolname, scenario);
  }

//advance ledger report
  @When("^user open advance ledger report page$")
  public void user_open_advance_ledger_report_page() throws Throwable {
	  AdvanceLedgerReport alr= new AdvanceLedgerReport(dr);
	  alr.openAdvanceLedgerReport();
  }

  @Then("^verify advance ledger report page$")
  public void verify_advance_ledger_report_page() throws Throwable {
	  AdvanceLedgerReport alr= new AdvanceLedgerReport(dr);
	  alr.verifyPage(schoolname, scenario);
  }
}
