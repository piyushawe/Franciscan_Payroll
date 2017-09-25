$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/SalaryReports.feature");
formatter.feature({
  "line": 1,
  "name": "Salary Reports",
  "description": " As a user I would like to open salary reports\n so that I can verify them",
  "id": "salary-reports",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 12,
      "value": "#advance entry report"
    }
  ],
  "line": 14,
  "name": "To test advance entry report",
  "description": "",
  "id": "salary-reports;to-test-advance-entry-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "advance entry report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enter from date as month \"April\" year \"2017\" and day \"1\" on advance entry report",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "enter to date as month \"March\" year \"2018\" and day \"31\" on advance entry report",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select employee type \"\u003cemployee type\u003e\" on advance entry report",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select designation \"\u003cdesignation\u003e\" on advance entry report",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select employee name \"\u003cemployee name\u003e\" on advance entry report",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click show to open advance entry report",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-advance-entry-report;",
  "rows": [
    {
      "cells": [
        "employee type",
        "designation",
        "employee name"
      ],
      "line": 24,
      "id": "salary-reports;to-test-advance-entry-report;;1"
    },
    {
      "cells": [
        "All Employee Types",
        "All",
        "All Employees"
      ],
      "line": 25,
      "id": "salary-reports;to-test-advance-entry-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4114549348,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 3997263167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 167040942,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 66859,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 5510808334,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 592958190,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "To test advance entry report",
  "description": "",
  "id": "salary-reports;to-test-advance-entry-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "advance entry report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enter from date as month \"April\" year \"2017\" and day \"1\" on advance entry report",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "enter to date as month \"March\" year \"2018\" and day \"31\" on advance entry report",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select employee type \"All Employee Types\" on advance entry report",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select designation \"All\" on advance entry report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select employee name \"All Employees\" on advance entry report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click show to open advance entry report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.advance_entry_report_page_opened()"
});
formatter.result({
  "duration": 2379702512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 31
    },
    {
      "val": "2017",
      "offset": 44
    },
    {
      "val": "1",
      "offset": 59
    }
  ],
  "location": "MyTestSteps.user_enter_from_date_as_month_year_and_day_on_advance_entry_report(String,String,String)"
});
formatter.result({
  "duration": 4495819240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 24
    },
    {
      "val": "2018",
      "offset": 37
    },
    {
      "val": "31",
      "offset": 52
    }
  ],
  "location": "MyTestSteps.enter_to_date_as_month_year_and_day_on_advance_entry_report(String,String,String)"
});
formatter.result({
  "duration": 2316000253,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: 2018\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.Utility.selectDate(Utility.java:45)\r\n\tat pageObjects.AdvanceEntryReport.selectToDate(AdvanceEntryReport.java:44)\r\n\tat stepDef.MyTestSteps.enter_to_date_as_month_year_and_day_on_advance_entry_report(MyTestSteps.java:156)\r\n\tat ✽.And enter to date as month \"March\" year \"2018\" and day \"31\" on advance entry report(Feature/SalaryReports.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employee Types",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_type_on_advance_entry_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.select_designation_on_advance_entry_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employees",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_name_on_advance_entry_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_advance_entry_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2802584406,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 27,
      "value": "#advance repayment report"
    }
  ],
  "line": 29,
  "name": "To test advance repayment report",
  "description": "",
  "id": "salary-reports;to-test-advance-repayment-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "advance repayment report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enter from date as month \"April\" year \"2017\" and day \"1\" on advance repayment report",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "enter to date as month \"March\" year \"2018\" and day \"31\" on advance repayment report",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "select employee type \"\u003cemployee type\u003e\" on advance repayment report",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "select designation \"\u003cdesignation\u003e\" on advance repayment report",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "select employee name \"\u003cemployee name\u003e\" on advance repayment report",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click show to open advance repayment report",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-advance-repayment-report;",
  "rows": [
    {
      "cells": [
        "employee type",
        "designation",
        "employee name"
      ],
      "line": 39,
      "id": "salary-reports;to-test-advance-repayment-report;;1"
    },
    {
      "cells": [
        "All Employee Types",
        "All",
        "All Employees"
      ],
      "line": 40,
      "id": "salary-reports;to-test-advance-repayment-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3347395097,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 2190684211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 207210189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 71258,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3834441400,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1962401903,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "To test advance repayment report",
  "description": "",
  "id": "salary-reports;to-test-advance-repayment-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "advance repayment report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user enter from date as month \"April\" year \"2017\" and day \"1\" on advance repayment report",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "enter to date as month \"March\" year \"2018\" and day \"31\" on advance repayment report",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "select employee type \"All Employee Types\" on advance repayment report",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "select designation \"All\" on advance repayment report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "select employee name \"All Employees\" on advance repayment report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click show to open advance repayment report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.advance_repayment_report_page_opened()"
});
formatter.result({
  "duration": 3485770990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 31
    },
    {
      "val": "2017",
      "offset": 44
    },
    {
      "val": "1",
      "offset": 59
    }
  ],
  "location": "MyTestSteps.user_enter_from_date_as_month_year_and_day_on_advance_repayment_report(String,String,String)"
});
formatter.result({
  "duration": 4521421370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 24
    },
    {
      "val": "2018",
      "offset": 37
    },
    {
      "val": "31",
      "offset": 52
    }
  ],
  "location": "MyTestSteps.enter_to_date_as_month_year_and_day_on_advance_repayment_report(String,String,String)"
});
formatter.result({
  "duration": 2332790737,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: 2018\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.Utility.selectDate(Utility.java:45)\r\n\tat pageObjects.AdvanceRepaymentReport.selectToDate(AdvanceRepaymentReport.java:44)\r\n\tat stepDef.MyTestSteps.enter_to_date_as_month_year_and_day_on_advance_repayment_report(MyTestSteps.java:199)\r\n\tat ✽.And enter to date as month \"March\" year \"2018\" and day \"31\" on advance repayment report(Feature/SalaryReports.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employee Types",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_type_on_advance_repayment_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.select_designation_on_advance_repayment_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employees",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_name_on_advance_repayment_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_advance_repayment_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2710624999,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 42,
      "value": "#bank statement report"
    }
  ],
  "line": 44,
  "name": "To test bank statement report",
  "description": "",
  "id": "salary-reports;to-test-bank-statement-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "bank statement report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "user select school \"\u003cschool\u003e\" on bank statement report",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "select salary month \"\u003csalary month\u003e\" on bank statement report",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "select school bank \"\u003cschool bank\u003e\" on bank statement report",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "# And select bank name \"\u003cbank name\u003e\" on bank statement report"
    }
  ],
  "line": 50,
  "name": "select salary cheque \"\u003csalary cheque\u003e\" on bank statement report",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click show to open bank statement report",
  "keyword": "Then "
});
formatter.examples({
  "line": 53,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-bank-statement-report;",
  "rows": [
    {
      "cells": [
        "school",
        "salary month",
        "school bank",
        "salary cheque"
      ],
      "line": 54,
      "id": "salary-reports;to-test-bank-statement-report;;1"
    },
    {
      "cells": [
        "Inspiration public school",
        "2017 - April",
        "St. Karen Secondary",
        "0"
      ],
      "line": 55,
      "id": "salary-reports;to-test-bank-statement-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3660266745,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 2478098005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 166526595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 54837,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 5748442442,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 649303871,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "To test bank statement report",
  "description": "",
  "id": "salary-reports;to-test-bank-statement-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "bank statement report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "user select school \"Inspiration public school\" on bank statement report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "select salary month \"2017 - April\" on bank statement report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "select school bank \"St. Karen Secondary\" on bank statement report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "# And select bank name \"\u003cbank name\u003e\" on bank statement report"
    }
  ],
  "line": 50,
  "name": "select salary cheque \"0\" on bank statement report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click show to open bank statement report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.bank_statement_report_page_opened()"
});
formatter.result({
  "duration": 11845133610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inspiration public school",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.user_select_school_on_bank_statement_report(String)"
});
formatter.result({
  "duration": 81614394,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Inspiration public school\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.BankStatementReport.selectSchoolName(BankStatementReport.java:43)\r\n\tat stepDef.MyTestSteps.user_select_school_on_bank_statement_report(MyTestSteps.java:236)\r\n\tat ✽.When user select school \"Inspiration public school\" on bank statement report(Feature/SalaryReports.feature:46)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017 - April",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_bank_statement_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "St. Karen Secondary",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.select_school_bank_on_bank_statement_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_salary_cheque_on_bank_statement_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_bank_statement_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2733944822,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 57,
      "value": "#department wise report"
    }
  ],
  "line": 59,
  "name": "To test department wise report",
  "description": "",
  "id": "salary-reports;to-test-department-wise-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "department wise report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "user select school bank \"\u003cschool bank\u003e\" on department wise report",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on department wise report",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "select month from \"\u003cmonth from\u003e\" on department wise report",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "select month to \"\u003cmonth to\u003e\" on department wise report",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "select department \"\u003cdepartment\u003e\" on department wise report",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "click show to open department wise report",
  "keyword": "Then "
});
formatter.examples({
  "line": 68,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-department-wise-report;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "month from",
        "month to",
        "department"
      ],
      "line": 69,
      "id": "salary-reports;to-test-department-wise-report;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "April - 2017",
        "April - 2017",
        "All Departments"
      ],
      "line": 70,
      "id": "salary-reports;to-test-department-wise-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3651880887,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 1634430902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 212433426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 68912,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3634380464,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1451899714,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "To test department wise report",
  "description": "",
  "id": "salary-reports;to-test-department-wise-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "department wise report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "user select school bank \"All School Banks\" on department wise report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "select salary account no \"All Salary A/C\" on department wise report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "select month from \"April - 2017\" on department wise report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "select month to \"April - 2017\" on department wise report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "select department \"All Departments\" on department wise report",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "click show to open department wise report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.department_wise_report_page_opened()"
});
formatter.result({
  "duration": 1817454150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_department_wise_report(String)"
});
formatter.result({
  "duration": 67693289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_department_wise_report(String)"
});
formatter.result({
  "duration": 63123983,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_month_from_on_department_wise_report(String)"
});
formatter.result({
  "duration": 99426534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.select_month_to_on_department_wise_report(String)"
});
formatter.result({
  "duration": 105740634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Departments",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_department_on_department_wise_report(String)"
});
formatter.result({
  "duration": 63973214,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_department_wise_report()"
});
formatter.result({
  "duration": 7491808269,
  "status": "passed"
});
formatter.after({
  "duration": 2771748483,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 72,
      "value": "#employee type wise report"
    }
  ],
  "line": 74,
  "name": "To test employee type wise report",
  "description": "",
  "id": "salary-reports;to-test-employee-type-wise-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 73,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 75,
  "name": "employee type wise report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "user select school bank \"\u003cschool bank\u003e\" on employee type wise report",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "select employee type \"\u003cemployee type\u003e\" on employee type wise report",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "select designation \"\u003cdesignation\u003e\" on employee type wise report",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "select employee name \"\u003cemployee name\u003e\" on employee type wise report",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "click show to open employee type wise report",
  "keyword": "Then "
});
formatter.examples({
  "line": 82,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-employee-type-wise-report;",
  "rows": [
    {
      "cells": [
        "school bank",
        "employee type",
        "designation",
        "employee name"
      ],
      "line": 83,
      "id": "salary-reports;to-test-employee-type-wise-report;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Employee Types",
        "All",
        "All Employees"
      ],
      "line": 84,
      "id": "salary-reports;to-test-employee-type-wise-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3573387474,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 1405676179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 181736500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 67445,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3718776850,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 643099445,
  "status": "passed"
});
formatter.scenario({
  "line": 84,
  "name": "To test employee type wise report",
  "description": "",
  "id": "salary-reports;to-test-employee-type-wise-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 73,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 75,
  "name": "employee type wise report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "user select school bank \"All School Banks\" on employee type wise report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "select employee type \"All Employee Types\" on employee type wise report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "select designation \"All\" on employee type wise report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "select employee name \"All Employees\" on employee type wise report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "click show to open employee type wise report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.employee_type_wise_report_page_opened()"
});
formatter.result({
  "duration": 4206280904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_employee_type_wise_report(String)"
});
formatter.result({
  "duration": 75351319,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: All School Banks\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.EmployeeTypeWiseReport.selectSchoolBank(EmployeeTypeWiseReport.java:39)\r\n\tat stepDef.MyTestSteps.user_select_school_bank_on_employee_type_wise_report(MyTestSteps.java:322)\r\n\tat ✽.When user select school bank \"All School Banks\" on employee type wise report(Feature/SalaryReports.feature:76)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employee Types",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_type_on_employee_type_wise_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.select_designation_on_employee_type_wise_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All Employees",
      "offset": 22
    }
  ],
  "location": "MyTestSteps.select_employee_name_on_employee_type_wise_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_employee_type_wise_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2751317686,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 86,
      "value": "#estimated extra income"
    }
  ],
  "line": 88,
  "name": "To test estimated extra income report when estimated extra income is clicked",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-estimated-extra-income-is-clicked",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 87,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "estimated extra income report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "user select school bank \"\u003cschool bank\u003e\" on estimated extra income report",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "select staff type \"\u003cstaff type\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "select staff \"\u003cstaff\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click estimated extra income on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "click show to open estimated extra income report",
  "keyword": "Then "
});
formatter.examples({
  "line": 97,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-estimated-extra-income-is-clicked;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "staff type",
        "staff"
      ],
      "line": 98,
      "id": "salary-reports;to-test-estimated-extra-income-report-when-estimated-extra-income-is-clicked;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "All Staff Types",
        "All Staffs"
      ],
      "line": 99,
      "id": "salary-reports;to-test-estimated-extra-income-report-when-estimated-extra-income-is-clicked;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3654835600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 1072056152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 168118022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 62754,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3466695854,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 563039530,
  "status": "passed"
});
formatter.scenario({
  "line": 99,
  "name": "To test estimated extra income report when estimated extra income is clicked",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-estimated-extra-income-is-clicked;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 87,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "estimated extra income report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "user select school bank \"All School Banks\" on estimated extra income report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "select salary account no \"All Salary A/C\" on estimated extra income report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "select staff type \"All Staff Types\" on estimated extra income report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "select staff \"All Staffs\" on estimated extra income report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click estimated extra income on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "click show to open estimated extra income report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.estimated_extra_income_report_page_opened()"
});
formatter.result({
  "duration": 10449753471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 71753233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 75112033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 81702661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staffs",
      "offset": 14
    }
  ],
  "location": "MyTestSteps.select_staff_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 82056017,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_estimated_extra_income_on_estimated_extra_income_report()"
});
formatter.result({
  "duration": 149895342,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_estimated_extra_income_report()"
});
formatter.result({
  "duration": 7732776837,
  "status": "passed"
});
formatter.after({
  "duration": 2780118505,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 102,
  "name": "To test estimated extra income report when gross extra income is clicked",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-gross-extra-income-is-clicked",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 101,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "estimated extra income report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "user select school bank \"\u003cschool bank\u003e\" on estimated extra income report",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "select staff type \"\u003cstaff type\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "select staff \"\u003cstaff\u003e\" on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "click gross extra income on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "click show to open estimated extra income report",
  "keyword": "Then "
});
formatter.examples({
  "line": 111,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-gross-extra-income-is-clicked;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "staff type",
        "staff"
      ],
      "line": 112,
      "id": "salary-reports;to-test-estimated-extra-income-report-when-gross-extra-income-is-clicked;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "All Staff Types",
        "All Staffs"
      ],
      "line": 113,
      "id": "salary-reports;to-test-estimated-extra-income-report-when-gross-extra-income-is-clicked;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3818134180,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 2365745924,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 189086332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 51611,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3335322300,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1428045603,
  "status": "passed"
});
formatter.scenario({
  "line": 113,
  "name": "To test estimated extra income report when gross extra income is clicked",
  "description": "",
  "id": "salary-reports;to-test-estimated-extra-income-report-when-gross-extra-income-is-clicked;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 101,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "estimated extra income report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "user select school bank \"All School Banks\" on estimated extra income report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "select salary account no \"All Salary A/C\" on estimated extra income report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "select staff type \"All Staff Types\" on estimated extra income report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "select staff \"All Staffs\" on estimated extra income report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "click gross extra income on estimated extra income report",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "click show to open estimated extra income report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.estimated_extra_income_report_page_opened()"
});
formatter.result({
  "duration": 2888968097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 68418772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 61768030,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 61315557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staffs",
      "offset": 14
    }
  ],
  "location": "MyTestSteps.select_staff_on_estimated_extra_income_report(String)"
});
formatter.result({
  "duration": 81806468,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_gross_extra_income_on_estimated_extra_income_report()"
});
formatter.result({
  "duration": 119272899,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_estimated_extra_income_report()"
});
formatter.result({
  "duration": 7280353686,
  "status": "passed"
});
formatter.after({
  "duration": 2707777321,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 115,
      "value": "#gross salary report"
    }
  ],
  "line": 117,
  "name": "To test gross salary report",
  "description": "",
  "id": "salary-reports;to-test-gross-salary-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 116,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 118,
  "name": "gross salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 119,
  "name": "user select school bank \"\u003cschool bank\u003e\" on gross salary report",
  "keyword": "When "
});
formatter.step({
  "line": 120,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on gross salary report",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "select staff type \"\u003cstaff type\u003e\" on gross salary report",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "select from month \"\u003cfrom month\u003e\" on gross salary report",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "select to month \"\u003cto month\u003e\" on gross salary report",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "click show to open gross salary report",
  "keyword": "Then "
});
formatter.examples({
  "line": 126,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-gross-salary-report;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "staff type",
        "from month",
        "to month"
      ],
      "line": 127,
      "id": "salary-reports;to-test-gross-salary-report;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "All Staff Types",
        "April - 2017",
        "April - 2017"
      ],
      "line": 128,
      "id": "salary-reports;to-test-gross-salary-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3712235781,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 4190612954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 143915246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 57182,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 8560858392,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 5100575459,
  "status": "passed"
});
formatter.scenario({
  "line": 128,
  "name": "To test gross salary report",
  "description": "",
  "id": "salary-reports;to-test-gross-salary-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 116,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 118,
  "name": "gross salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 119,
  "name": "user select school bank \"All School Banks\" on gross salary report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 120,
  "name": "select salary account no \"All Salary A/C\" on gross salary report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "select staff type \"All Staff Types\" on gross salary report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "select from month \"April - 2017\" on gross salary report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "select to month \"April - 2017\" on gross salary report",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "click show to open gross salary report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.gross_salary_report_page_opened()"
});
formatter.result({
  "duration": 15758551686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_gross_salary_report(String)"
});
formatter.result({
  "duration": 63330426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_gross_salary_report(String)"
});
formatter.result({
  "duration": 68896464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_gross_salary_report(String)"
});
formatter.result({
  "duration": 78440044,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_from_month_on_gross_salary_report(String)"
});
formatter.result({
  "duration": 20179195,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"ContentPlaceHolder1_ddlFYearMonth\"}\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 19 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir1156_14847}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: d3a30fc83cc9feb500b2cdceb8133739\n*** Element info: {Using\u003did, value\u003dContentPlaceHolder1_ddlFYearMonth}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:44)\r\n\tat pageObjects.GrossSalaryReport.selectFromMonth(GrossSalaryReport.java:53)\r\n\tat stepDef.MyTestSteps.select_from_month_on_gross_salary_report(MyTestSteps.java:426)\r\n\tat ✽.And select from month \"April - 2017\" on gross salary report(Feature/SalaryReports.feature:122)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.select_to_month_on_gross_salary_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_gross_salary_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2711627889,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 130,
      "value": "#month wise salary report"
    }
  ],
  "line": 132,
  "name": "To test month wise salary report",
  "description": "",
  "id": "salary-reports;to-test-month-wise-salary-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 131,
      "name": "@scenario9"
    }
  ]
});
formatter.step({
  "line": 133,
  "name": "month wise salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 134,
  "name": "user select school bank \"\u003cschool bank\u003e\" on month wise salary report",
  "keyword": "When "
});
formatter.step({
  "line": 135,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on month wise salary report",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "select staff type \"\u003cstaff type\u003e\" on month wise salary report",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "select from month \"\u003cfrom month\u003e\" on month wise salary report",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "select to month \"\u003cto month\u003e\" on month wise salary report",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "click show to open month wise salary report",
  "keyword": "Then "
});
formatter.examples({
  "line": 141,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-month-wise-salary-report;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "staff type",
        "from month",
        "to month"
      ],
      "line": 142,
      "id": "salary-reports;to-test-month-wise-salary-report;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "All Staff Types",
        "April - 2017",
        "April - 2017"
      ],
      "line": 143,
      "id": "salary-reports;to-test-month-wise-salary-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3647508054,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 2637875915,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 166973496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 49558,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 4191510569,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1226660676,
  "status": "passed"
});
formatter.scenario({
  "line": 143,
  "name": "To test month wise salary report",
  "description": "",
  "id": "salary-reports;to-test-month-wise-salary-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 131,
      "name": "@scenario9"
    }
  ]
});
formatter.step({
  "line": 133,
  "name": "month wise salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 134,
  "name": "user select school bank \"All School Banks\" on month wise salary report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 135,
  "name": "select salary account no \"All Salary A/C\" on month wise salary report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "select staff type \"All Staff Types\" on month wise salary report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "select from month \"April - 2017\" on month wise salary report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "select to month \"April - 2017\" on month wise salary report",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "click show to open month wise salary report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.month_wise_salary_report_page_opened()"
});
formatter.result({
  "duration": 3037407782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_month_wise_salary_report(String)"
});
formatter.result({
  "duration": 70809285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_month_wise_salary_report(String)"
});
formatter.result({
  "duration": 62794086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_month_wise_salary_report(String)"
});
formatter.result({
  "duration": 60583037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_from_month_on_month_wise_salary_report(String)"
});
formatter.result({
  "duration": 93064637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.select_to_month_on_month_wise_salary_report(String)"
});
formatter.result({
  "duration": 97334835,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_month_wise_salary_report()"
});
formatter.result({
  "duration": 9263185213,
  "status": "passed"
});
formatter.after({
  "duration": 2694716297,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 145,
      "value": "#salary sheet"
    }
  ],
  "line": 147,
  "name": "To test salary sheet",
  "description": "",
  "id": "salary-reports;to-test-salary-sheet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 146,
      "name": "@scenario10"
    }
  ]
});
formatter.step({
  "line": 148,
  "name": "salary sheet page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 149,
  "name": "user select school bank \"\u003cschool bank\u003e\" on salary sheet",
  "keyword": "When "
});
formatter.step({
  "line": 150,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on salary sheet",
  "keyword": "And "
});
formatter.step({
  "line": 151,
  "name": "select salary month \"\u003csalary month\u003e\" on salary sheet",
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "click show to open salary sheet",
  "keyword": "Then "
});
formatter.examples({
  "line": 154,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-salary-sheet;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "salary month"
      ],
      "line": 155,
      "id": "salary-reports;to-test-salary-sheet;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "April - 2017"
      ],
      "line": 156,
      "id": "salary-reports;to-test-salary-sheet;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3558324482,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 5392980242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 173174990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 58941,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 5141557575,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 585680203,
  "status": "passed"
});
formatter.scenario({
  "line": 156,
  "name": "To test salary sheet",
  "description": "",
  "id": "salary-reports;to-test-salary-sheet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 146,
      "name": "@scenario10"
    }
  ]
});
formatter.step({
  "line": 148,
  "name": "salary sheet page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 149,
  "name": "user select school bank \"All School Banks\" on salary sheet",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 150,
  "name": "select salary account no \"All Salary A/C\" on salary sheet",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 151,
  "name": "select salary month \"April - 2017\" on salary sheet",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "click show to open salary sheet",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.salary_sheet_page_opened()"
});
formatter.result({
  "duration": 2301185346,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_salary_sheet(String)"
});
formatter.result({
  "duration": 73507117,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: All School Banks\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.SalarySheet.selectSchoolBank(SalarySheet.java:44)\r\n\tat stepDef.MyTestSteps.user_select_school_bank_on_salary_sheet(MyTestSteps.java:494)\r\n\tat ✽.When user select school bank \"All School Banks\" on salary sheet(Feature/SalaryReports.feature:149)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_salary_sheet(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_salary_sheet(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_salary_sheet()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2704376294,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 158,
      "value": "#staff statement"
    }
  ],
  "line": 160,
  "name": "To test staff statement",
  "description": "",
  "id": "salary-reports;to-test-staff-statement",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 159,
      "name": "@scenario11"
    }
  ]
});
formatter.step({
  "line": 161,
  "name": "staff statement page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 162,
  "name": "user select school bank \"\u003cschool bank\u003e\" on staff statement",
  "keyword": "When "
});
formatter.step({
  "line": 163,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "select staff type \"\u003cstaff type\u003e\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 165,
  "name": "select joining from date as month \"April\" year \"2016\" and day \"1\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 166,
  "name": "select joining to date as month \"March\" year \"2017\" and day \"31\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 167,
  "name": "select salary month \"\u003csalary month\u003e\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "click show to open staff statement",
  "keyword": "Then "
});
formatter.examples({
  "line": 170,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-staff-statement;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "salary month",
        "staff type"
      ],
      "line": 171,
      "id": "salary-reports;to-test-staff-statement;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "April - 2017",
        "All Staff Types"
      ],
      "line": 172,
      "id": "salary-reports;to-test-staff-statement;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3717115924,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 15628907970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 155501846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 48385,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 4408452893,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 527589727,
  "status": "passed"
});
formatter.scenario({
  "line": 172,
  "name": "To test staff statement",
  "description": "",
  "id": "salary-reports;to-test-staff-statement;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 159,
      "name": "@scenario11"
    }
  ]
});
formatter.step({
  "line": 161,
  "name": "staff statement page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 162,
  "name": "user select school bank \"All School Banks\" on staff statement",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 163,
  "name": "select salary account no \"All Salary A/C\" on staff statement",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "select staff type \"All Staff Types\" on staff statement",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 165,
  "name": "select joining from date as month \"April\" year \"2016\" and day \"1\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 166,
  "name": "select joining to date as month \"March\" year \"2017\" and day \"31\" on staff statement",
  "keyword": "And "
});
formatter.step({
  "line": 167,
  "name": "select salary month \"April - 2017\" on staff statement",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "click show to open staff statement",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.staff_statement_page_opened()"
});
formatter.result({
  "duration": 2017220670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_staff_statement(String)"
});
formatter.result({
  "duration": 61510857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_staff_statement(String)"
});
formatter.result({
  "duration": 59129433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_staff_statement(String)"
});
formatter.result({
  "duration": 60843436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 35
    },
    {
      "val": "2016",
      "offset": 48
    },
    {
      "val": "1",
      "offset": 63
    }
  ],
  "location": "MyTestSteps.select_joining_from_date_as_month_year_and_day_on_staff_statement(String,String,String)"
});
formatter.result({
  "duration": 4535798761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 33
    },
    {
      "val": "2017",
      "offset": 46
    },
    {
      "val": "31",
      "offset": 61
    }
  ],
  "location": "MyTestSteps.select_joining_to_date_as_month_year_and_day_on_staff_statement(String,String,String)"
});
formatter.result({
  "duration": 4923357241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_staff_statement(String)"
});
formatter.result({
  "duration": 139940636,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_staff_statement()"
});
formatter.result({
  "duration": 7230821495,
  "status": "passed"
});
formatter.after({
  "duration": 2718501202,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 174,
      "value": "#tds entry report"
    }
  ],
  "line": 176,
  "name": "To test tds entry report",
  "description": "",
  "id": "salary-reports;to-test-tds-entry-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 175,
      "name": "@scenario12"
    }
  ]
});
formatter.step({
  "line": 177,
  "name": "tds entry report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 178,
  "name": "user select month-year \"\u003cmonth-year\u003e\" on tds entry report",
  "keyword": "When "
});
formatter.step({
  "line": 179,
  "name": "click show to open tds entry report",
  "keyword": "Then "
});
formatter.examples({
  "line": 181,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-tds-entry-report;",
  "rows": [
    {
      "cells": [
        "month-year"
      ],
      "line": 182,
      "id": "salary-reports;to-test-tds-entry-report;;1"
    },
    {
      "cells": [
        "April - 2017"
      ],
      "line": 183,
      "id": "salary-reports;to-test-tds-entry-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4210256101,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 1256096660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 168691312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 51611,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 3585917729,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1344242153,
  "status": "passed"
});
formatter.scenario({
  "line": 183,
  "name": "To test tds entry report",
  "description": "",
  "id": "salary-reports;to-test-tds-entry-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 175,
      "name": "@scenario12"
    }
  ]
});
formatter.step({
  "line": 177,
  "name": "tds entry report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 178,
  "name": "user select month-year \"April - 2017\" on tds entry report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 179,
  "name": "click show to open tds entry report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.tds_entry_report_page_opened()"
});
formatter.result({
  "duration": 1945039010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 24
    }
  ],
  "location": "MyTestSteps.user_select_month_year_on_tds_entry_report(String)"
});
formatter.result({
  "duration": 145706372,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_tds_entry_report()"
});
formatter.result({
  "duration": 5906795779,
  "status": "passed"
});
formatter.after({
  "duration": 2658753027,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 185,
      "value": "#salary certificate report"
    }
  ],
  "line": 187,
  "name": "To test salary certificate report",
  "description": "",
  "id": "salary-reports;to-test-salary-certificate-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 186,
      "name": "@scenario13"
    }
  ]
});
formatter.step({
  "line": 188,
  "name": "salary certificate report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 189,
  "name": "user select school bank \"\u003cschool bank\u003e\" on salary certificate report",
  "keyword": "When "
});
formatter.step({
  "line": 190,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on salary certificate report",
  "keyword": "And "
});
formatter.step({
  "line": 191,
  "name": "select format \"\u003cformat\u003e\" on salary certificate report",
  "keyword": "And "
});
formatter.step({
  "line": 192,
  "name": "select year \"\u003cyear\u003e\" on salary certificate report",
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "click show to open salary certificate report",
  "keyword": "Then "
});
formatter.examples({
  "line": 195,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-salary-certificate-report;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "format",
        "year"
      ],
      "line": 196,
      "id": "salary-reports;to-test-salary-certificate-report;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "Format One",
        "2017-2018"
      ],
      "line": 197,
      "id": "salary-reports;to-test-salary-certificate-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3345031269,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 3486746315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 176803573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 52198,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 5227051863,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1638212264,
  "status": "passed"
});
formatter.scenario({
  "line": 197,
  "name": "To test salary certificate report",
  "description": "",
  "id": "salary-reports;to-test-salary-certificate-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 186,
      "name": "@scenario13"
    }
  ]
});
formatter.step({
  "line": 188,
  "name": "salary certificate report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 189,
  "name": "user select school bank \"All School Banks\" on salary certificate report",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 190,
  "name": "select salary account no \"All Salary A/C\" on salary certificate report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 191,
  "name": "select format \"Format One\" on salary certificate report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 192,
  "name": "select year \"2017-2018\" on salary certificate report",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 193,
  "name": "click show to open salary certificate report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.salary_certificate_report_page_opened()"
});
formatter.result({
  "duration": 1445094726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_salary_certificate_report(String)"
});
formatter.result({
  "duration": 66627060,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_salary_certificate_report(String)"
});
formatter.result({
  "duration": 58269353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Format One",
      "offset": 15
    }
  ],
  "location": "MyTestSteps.select_format_on_salary_certificate_report(String)"
});
formatter.result({
  "duration": 89983244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017-2018",
      "offset": 13
    }
  ],
  "location": "MyTestSteps.select_year_on_salary_certificate_report(String)"
});
formatter.result({
  "duration": 95220264,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_salary_certificate_report()"
});
formatter.result({
  "duration": 8578082874,
  "status": "passed"
});
formatter.after({
  "duration": 2668883385,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 199,
      "value": "#quarterly form 24q"
    }
  ],
  "line": 201,
  "name": "To test quarterly form 24q",
  "description": "",
  "id": "salary-reports;to-test-quarterly-form-24q",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 200,
      "name": "@scenario14"
    }
  ]
});
formatter.step({
  "line": 202,
  "name": "quarterly form 24q page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 203,
  "name": "user select school bank \"\u003cschool bank\u003e\" on quarterly form 24q",
  "keyword": "When "
});
formatter.step({
  "line": 204,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on quarterly form 24q",
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "select salary month \"\u003csalary month\u003e\" on quarterly form 24q",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "click show to open quarterly form 24q",
  "keyword": "Then "
});
formatter.examples({
  "line": 208,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-quarterly-form-24q;",
  "rows": [
    {
      "cells": [
        "school bank",
        "salary acc no",
        "salary month"
      ],
      "line": 209,
      "id": "salary-reports;to-test-quarterly-form-24q;;1"
    },
    {
      "cells": [
        "All School Banks",
        "All Salary A/C",
        "2017 - April"
      ],
      "line": 210,
      "id": "salary-reports;to-test-quarterly-form-24q;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3387002786,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 4840376043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 168503929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 51904,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 12757070811,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1933221628,
  "status": "passed"
});
formatter.scenario({
  "line": 210,
  "name": "To test quarterly form 24q",
  "description": "",
  "id": "salary-reports;to-test-quarterly-form-24q;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 200,
      "name": "@scenario14"
    }
  ]
});
formatter.step({
  "line": 202,
  "name": "quarterly form 24q page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 203,
  "name": "user select school bank \"All School Banks\" on quarterly form 24q",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 204,
  "name": "select salary account no \"All Salary A/C\" on quarterly form 24q",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "select salary month \"2017 - April\" on quarterly form 24q",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "click show to open quarterly form 24q",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 15
    }
  ],
  "location": "MyTestSteps.quarterly_form_q_page_opened(int)"
});
formatter.result({
  "duration": 76849495,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Quarterly Form 24Q\"}\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir5484_15417}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 757ad30cef16ed14cd8425184cc8ed1c\n*** Element info: {Using\u003dlink text, value\u003dQuarterly Form 24Q}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat pageObjects.QuarterlyForm24Q.openQuarterlyForm24Q(QuarterlyForm24Q.java:35)\r\n\tat stepDef.MyTestSteps.quarterly_form_q_page_opened(MyTestSteps.java:624)\r\n\tat ✽.Given quarterly form 24q page opened(Feature/SalaryReports.feature:202)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    },
    {
      "val": "24",
      "offset": 61
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_quarterly_form_q(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    },
    {
      "val": "24",
      "offset": 60
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_quarterly_form_q(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2017 - April",
      "offset": 21
    },
    {
      "val": "24",
      "offset": 53
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_quarterly_form_q(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 34
    }
  ],
  "location": "MyTestSteps.click_show_to_open_quarterly_form_q(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2657856291,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 212,
      "value": "#salary statement employee wise"
    }
  ],
  "line": 214,
  "name": "To test salary statement employee wise",
  "description": "",
  "id": "salary-reports;to-test-salary-statement-employee-wise",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 213,
      "name": "@scenario15"
    }
  ]
});
formatter.step({
  "line": 215,
  "name": "salary statement employee wise page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 216,
  "name": "user select salary account no \"\u003csalary acc no\u003e\" on salary statement employee wise",
  "keyword": "When "
});
formatter.step({
  "line": 217,
  "name": "select staff type \"\u003cstaff type\u003e\" on salary statement employee wise",
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "select staff \"\u003cstaff\u003e\" on salary statement employee wise",
  "keyword": "And "
});
formatter.step({
  "line": 219,
  "name": "click show to open salary statement employee wise",
  "keyword": "Then "
});
formatter.examples({
  "line": 221,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-salary-statement-employee-wise;",
  "rows": [
    {
      "cells": [
        "salary acc no",
        "staff type",
        "staff"
      ],
      "line": 222,
      "id": "salary-reports;to-test-salary-statement-employee-wise;;1"
    },
    {
      "cells": [
        "All Salary A/C",
        "All Staff Types",
        "All Staffs"
      ],
      "line": 223,
      "id": "salary-reports;to-test-salary-statement-employee-wise;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3354855481,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 1177153705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 170946054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 50437,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 8037705130,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1628051409,
  "status": "passed"
});
formatter.scenario({
  "line": 223,
  "name": "To test salary statement employee wise",
  "description": "",
  "id": "salary-reports;to-test-salary-statement-employee-wise;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 213,
      "name": "@scenario15"
    }
  ]
});
formatter.step({
  "line": 215,
  "name": "salary statement employee wise page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 216,
  "name": "user select salary account no \"All Salary A/C\" on salary statement employee wise",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 217,
  "name": "select staff type \"All Staff Types\" on salary statement employee wise",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 218,
  "name": "select staff \"All Staffs\" on salary statement employee wise",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 219,
  "name": "click show to open salary statement employee wise",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.salary_statement_employee_wise_page_opened()"
});
formatter.result({
  "duration": 4214643010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 31
    }
  ],
  "location": "MyTestSteps.user_select_salary_account_no_on_salary_statement_employee_wise(String)"
});
formatter.result({
  "duration": 63361216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_salary_statement_employee_wise(String)"
});
formatter.result({
  "duration": 69354801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staffs",
      "offset": 14
    }
  ],
  "location": "MyTestSteps.select_staff_on_salary_statement_employee_wise(String)"
});
formatter.result({
  "duration": 91395207,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_salary_statement_employee_wise()"
});
formatter.result({
  "duration": 63992770398,
  "status": "passed"
});
formatter.after({
  "duration": 2673169712,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 225,
      "value": "#estimated salary report"
    }
  ],
  "line": 227,
  "name": "To test estimated salary report",
  "description": "",
  "id": "salary-reports;to-test-estimated-salary-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 226,
      "name": "@scenario16"
    }
  ]
});
formatter.step({
  "line": 228,
  "name": "estimated salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 229,
  "name": "user select school bank \"\u003cschool bank\u003e\" on estimated salary report",
  "keyword": "When "
});
formatter.step({
  "line": 230,
  "name": "select salary account no \"\u003csalary acc no\u003e\" on estimated salary report",
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "select staff type \"\u003cstaff type\u003e\" on estimated salary report",
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "select staff \"\u003cstaff\u003e\" on estimated salary report",
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "select format \"\u003cformat\u003e\" on estimated salary report",
  "keyword": "And "
});
formatter.step({
  "line": 234,
  "name": "click show to open estimated salary report",
  "keyword": "Then "
});
formatter.examples({
  "line": 236,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-estimated-salary-report;",
  "rows": [
    {
      "cells": [
        "salary acc no",
        "staff type",
        "staff",
        "school bank",
        "format"
      ],
      "line": 237,
      "id": "salary-reports;to-test-estimated-salary-report;;1"
    },
    {
      "cells": [
        "All Salary A/C",
        "All Staff Types",
        "All Staffs",
        "All School Banks",
        "Format 1"
      ],
      "line": 238,
      "id": "salary-reports;to-test-estimated-salary-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3386213376,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 21082337824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 172433087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 304093,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 9846126823,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 3247116985,
  "status": "passed"
});
formatter.scenario({
  "line": 238,
  "name": "To test estimated salary report",
  "description": "",
  "id": "salary-reports;to-test-estimated-salary-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 226,
      "name": "@scenario16"
    }
  ]
});
formatter.step({
  "line": 228,
  "name": "estimated salary report page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 229,
  "name": "user select school bank \"All School Banks\" on estimated salary report",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 230,
  "name": "select salary account no \"All Salary A/C\" on estimated salary report",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "select staff type \"All Staff Types\" on estimated salary report",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "select staff \"All Staffs\" on estimated salary report",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "select format \"Format 1\" on estimated salary report",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 234,
  "name": "click show to open estimated salary report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.estimated_salary_report_page_opened()"
});
formatter.result({
  "duration": 5342407627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All School Banks",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_bank_on_estimated_salary_report(String)"
});
formatter.result({
  "duration": 61141370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Salary A/C",
      "offset": 26
    }
  ],
  "location": "MyTestSteps.select_salary_account_no_on_estimated_salary_report(String)"
});
formatter.result({
  "duration": 60221762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_estimated_salary_report(String)"
});
formatter.result({
  "duration": 63953274,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staffs",
      "offset": 14
    }
  ],
  "location": "MyTestSteps.select_staff_on_estimated_salary_report(String)"
});
formatter.result({
  "duration": 62093823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Format 1",
      "offset": 15
    }
  ],
  "location": "MyTestSteps.select_format_on_estimated_salary_report(String)"
});
formatter.result({
  "duration": 60932289,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_estimated_salary_report()"
});
formatter.result({
  "duration": 9527751305,
  "status": "passed"
});
formatter.after({
  "duration": 2681937078,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 240,
      "value": "#salary slip"
    }
  ],
  "line": 242,
  "name": "To test salary slip",
  "description": "",
  "id": "salary-reports;to-test-salary-slip",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 241,
      "name": "@scenario17"
    }
  ]
});
formatter.step({
  "line": 243,
  "name": "salary slip page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 244,
  "name": "user select school name \"\u003cschool name\u003e\" on salary slip",
  "keyword": "When "
});
formatter.step({
  "line": 245,
  "name": "select staff type \"\u003cstaff type\u003e\" on salary slip",
  "keyword": "And "
});
formatter.step({
  "line": 246,
  "name": "select salary month \"\u003csalary month\u003e\" on salary slip",
  "keyword": "And "
});
formatter.step({
  "line": 247,
  "name": "click show to open salary slip",
  "keyword": "Then "
});
formatter.step({
  "line": 248,
  "name": "select employee \"\u003cemployee\u003e\" on salary slip",
  "keyword": "And "
});
formatter.step({
  "line": 249,
  "name": "click print to view salary slip",
  "keyword": "Then "
});
formatter.examples({
  "line": 251,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-salary-slip;",
  "rows": [
    {
      "cells": [
        "staff type",
        "school name",
        "salary month",
        "employee"
      ],
      "line": 252,
      "id": "salary-reports;to-test-salary-slip;;1"
    },
    {
      "cells": [
        "All Staff Types",
        "Inspiration public school",
        "April - 2017",
        "pallavi"
      ],
      "line": 253,
      "id": "salary-reports;to-test-salary-slip;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3405171802,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 8058086663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 148825593,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 75950,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 10520486806,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 695490164,
  "status": "passed"
});
formatter.scenario({
  "line": 253,
  "name": "To test salary slip",
  "description": "",
  "id": "salary-reports;to-test-salary-slip;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 241,
      "name": "@scenario17"
    }
  ]
});
formatter.step({
  "line": 243,
  "name": "salary slip page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 244,
  "name": "user select school name \"Inspiration public school\" on salary slip",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 245,
  "name": "select staff type \"All Staff Types\" on salary slip",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 246,
  "name": "select salary month \"April - 2017\" on salary slip",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 247,
  "name": "click show to open salary slip",
  "keyword": "Then "
});
formatter.step({
  "line": 248,
  "name": "select employee \"pallavi\" on salary slip",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 249,
  "name": "click print to view salary slip",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.salary_slip_page_opened()"
});
formatter.result({
  "duration": 12003986340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inspiration public school",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_select_school_name_on_salary_slip(String)"
});
formatter.result({
  "duration": 69055401,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Inspiration public school\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.SalarySlip.selectSchoolName(SalarySlip.java:41)\r\n\tat stepDef.MyTestSteps.user_select_school_name_on_salary_slip(MyTestSteps.java:1247)\r\n\tat ✽.When user select school name \"Inspiration public school\" on salary slip(Feature/SalaryReports.feature:244)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Staff Types",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.select_staff_type_on_salary_slip(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "April - 2017",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_salary_slip(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_salary_slip()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "pallavi",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.select_employee_on_salary_slip(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_print_to_view_salary_slip()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2670208842,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 255,
      "value": "#consolidated salary statement"
    }
  ],
  "line": 257,
  "name": "To test consolidated salary statement",
  "description": "",
  "id": "salary-reports;to-test-consolidated-salary-statement",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 256,
      "name": "@scenario18"
    }
  ]
});
formatter.step({
  "line": 258,
  "name": "consolidated salary statement page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 259,
  "name": "user select staff type \"\u003cstaff type\u003e\" on consolidated salary statement",
  "keyword": "When "
});
formatter.step({
  "line": 260,
  "name": "select salary month \"\u003csalary month\u003e\" on consolidated salary statement",
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "click show to open consolidated salary statement",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "select employee \"\u003cemployee\u003e\" on consolidated salary statement",
  "keyword": "And "
});
formatter.examples({
  "line": 264,
  "name": "",
  "description": "",
  "id": "salary-reports;to-test-consolidated-salary-statement;",
  "rows": [
    {
      "cells": [
        "staff type",
        "salary month",
        "employee"
      ],
      "line": 265,
      "id": "salary-reports;to-test-consolidated-salary-statement;;1"
    },
    {
      "cells": [
        "Teachers",
        "2017 - April",
        "pallavi"
      ],
      "line": 266,
      "id": "salary-reports;to-test-consolidated-salary-statement;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3548836619,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "payroll home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enter_url(String)"
});
formatter.result({
  "duration": 7977647585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyTestSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 145595232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 43693,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 11119894573,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 2579494837,
  "status": "passed"
});
formatter.scenario({
  "line": 266,
  "name": "To test consolidated salary statement",
  "description": "",
  "id": "salary-reports;to-test-consolidated-salary-statement;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 256,
      "name": "@scenario18"
    }
  ]
});
formatter.step({
  "line": 258,
  "name": "consolidated salary statement page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 259,
  "name": "user select staff type \"Teachers\" on consolidated salary statement",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 260,
  "name": "select salary month \"2017 - April\" on consolidated salary statement",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "click show to open consolidated salary statement",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "select employee \"pallavi\" on consolidated salary statement",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyTestSteps.consolidated_salary_statement_page_opened()"
});
formatter.result({
  "duration": 6625396391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teachers",
      "offset": 24
    }
  ],
  "location": "MyTestSteps.user_select_staff_type_on_consolidated_salary_statement(String)"
});
formatter.result({
  "duration": 48974443,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Teachers\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat pageObjects.ConsolidatedSalaryStatement.selectStaffType(ConsolidatedSalaryStatement.java:39)\r\n\tat stepDef.MyTestSteps.user_select_staff_type_on_consolidated_salary_statement(MyTestSteps.java:1290)\r\n\tat ✽.When user select staff type \"Teachers\" on consolidated salary statement(Feature/SalaryReports.feature:259)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017 - April",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.select_salary_month_on_consolidated_salary_statement(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_show_to_open_consolidated_salary_statement()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "pallavi",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.select_employee_on_consolidated_salary_statement(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2670890923,
  "status": "passed"
});
});