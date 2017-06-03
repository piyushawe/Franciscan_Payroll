Feature: Salary Reports
   As a user I would like to open salary reports
   so that I can verify them

  Background: 
    Given user enter url "http://erp.stkarenssecondaryschool.com"
    When user enter username "admin" and password "stkss#54321techpass"
    And passes school name "st karen"
    And click signin
    Then payroll home page is opened

  #advance entry report
  @scenario1
  Scenario Outline: To test advance entry report
    Given advance entry report page opened
    When user enter from date as month "April" year "2017" and day "1" on advance entry report
    And enter to date as month "March" year "2018" and day "31" on advance entry report
    And select employee type "<employee type>" on advance entry report
    And select designation "<designation>" on advance entry report
    And select employee name "<employee name>" on advance entry report
    Then click show to open advance entry report

    Examples: 
      | employee type      | designation | employee name |
      | All Employee Types | All         | All Employees |

  #advance repayment report
  @scenario2
  Scenario Outline: To test advance repayment report
    Given advance repayment report page opened
    When user enter from date as month "April" year "2017" and day "1" on advance repayment report
    And enter to date as month "March" year "2018" and day "31" on advance repayment report
    And select employee type "<employee type>" on advance repayment report
    And select designation "<designation>" on advance repayment report
    And select employee name "<employee name>" on advance repayment report
    Then click show to open advance repayment report

    Examples: 
      | employee type      | designation | employee name |
      | All Employee Types | All         | All Employees |

  #bank statement report
  @scenario3
  Scenario Outline: To test bank statement report
    Given bank statement report page opened
    When user select school "<school>" on bank statement report
    And select salary month "<salary month>" on bank statement report
    And select school bank "<school bank>" on bank statement report
    # And select bank name "<bank name>" on bank statement report
    And select salary cheque "<salary cheque>" on bank statement report
    Then click show to open bank statement report

    Examples: 
      | school                    | salary month | school bank         | salary cheque |
      | Inspiration public school | 2017 - April | St. Karen Secondary |             0 |

  #department wise report
  @scenario4
  Scenario Outline: To test department wise report
    Given department wise report page opened
    When user select school bank "<school bank>" on department wise report
    And select salary account no "<salary acc no>" on department wise report
    And select month from "<month from>" on department wise report
    And select month to "<month to>" on department wise report
    And select department "<department>" on department wise report
    Then click show to open department wise report

    Examples: 
      | school bank      | salary acc no  | month from   | month to     | department      |
      | All School Banks | All Salary A/C | April - 2017 | April - 2017 | All Departments |

  #employee type wise report
  @scenario5
  Scenario Outline: To test employee type wise report
    Given employee type wise report page opened
    When user select school bank "<school bank>" on employee type wise report
    And select employee type "<employee type>" on employee type wise report
    And select designation "<designation>" on employee type wise report
    And select employee name "<employee name>" on employee type wise report
    Then click show to open employee type wise report

    Examples: 
      | school bank      | employee type      | designation | employee name |
      | All School Banks | All Employee Types | All         | All Employees |

  #estimated extra income
  @scenario6
  Scenario Outline: To test estimated extra income report when estimated extra income is clicked
    Given estimated extra income report page opened
    When user select school bank "<school bank>" on estimated extra income report
    And select salary account no "<salary acc no>" on estimated extra income report
    And select staff type "<staff type>" on estimated extra income report
    And select staff "<staff>" on estimated extra income report
    And click estimated extra income on estimated extra income report
    Then click show to open estimated extra income report

    Examples: 
      | school bank      | salary acc no  | staff type      | staff      |
      | All School Banks | All Salary A/C | All Staff Types | All Staffs |

  @scenario7
  Scenario Outline: To test estimated extra income report when gross extra income is clicked
    Given estimated extra income report page opened
    When user select school bank "<school bank>" on estimated extra income report
    And select salary account no "<salary acc no>" on estimated extra income report
    And select staff type "<staff type>" on estimated extra income report
    And select staff "<staff>" on estimated extra income report
    And click gross extra income on estimated extra income report
    Then click show to open estimated extra income report

    Examples: 
      | school bank      | salary acc no  | staff type      | staff      |
      | All School Banks | All Salary A/C | All Staff Types | All Staffs |

  #gross salary report
  @scenario8
  Scenario Outline: To test gross salary report
    Given gross salary report page opened
    When user select school bank "<school bank>" on gross salary report
    And select salary account no "<salary acc no>" on gross salary report
    And select staff type "<staff type>" on gross salary report
    And select from month "<from month>" on gross salary report
    And select to month "<to month>" on gross salary report
    Then click show to open gross salary report

    Examples: 
      | school bank      | salary acc no  | staff type      | from month   | to month     |
      | All School Banks | All Salary A/C | All Staff Types | April - 2017 | April - 2017 |

  #month wise salary report
  @scenario9
  Scenario Outline: To test month wise salary report
    Given month wise salary report page opened
    When user select school bank "<school bank>" on month wise salary report
    And select salary account no "<salary acc no>" on month wise salary report
    And select staff type "<staff type>" on month wise salary report
    And select from month "<from month>" on month wise salary report
    And select to month "<to month>" on month wise salary report
    Then click show to open month wise salary report

    Examples: 
      | school bank      | salary acc no  | staff type      | from month   | to month     |
      | All School Banks | All Salary A/C | All Staff Types | April - 2017 | April - 2017 |

  #salary sheet
  @scenario10
  Scenario Outline: To test salary sheet
    Given salary sheet page opened
    When user select school bank "<school bank>" on salary sheet
    And select salary account no "<salary acc no>" on salary sheet
    And select salary month "<salary month>" on salary sheet
    Then click show to open salary sheet

    Examples: 
      | school bank      | salary acc no  | salary month |
      | All School Banks | All Salary A/C | April - 2017 |

  #staff statement
  @scenario11
  Scenario Outline: To test staff statement
    Given staff statement page opened
    When user select school bank "<school bank>" on staff statement
    And select salary account no "<salary acc no>" on staff statement
    And select staff type "<staff type>" on staff statement
    And select joining from date as month "April" year "2016" and day "1" on staff statement
    And select joining to date as month "March" year "2017" and day "31" on staff statement
    And select salary month "<salary month>" on staff statement
    Then click show to open staff statement

    Examples: 
      | school bank      | salary acc no  | salary month | staff type      |
      | All School Banks | All Salary A/C | April - 2017 | All Staff Types |

  #tds entry report
  @scenario12
  Scenario Outline: To test tds entry report
    Given tds entry report page opened
    When user select month-year "<month-year>" on tds entry report
    Then click show to open tds entry report

    Examples: 
      | month-year   |
      | April - 2017 |

  #salary certificate report
  @scenario13
  Scenario Outline: To test salary certificate report
    Given salary certificate report page opened
    When user select school bank "<school bank>" on salary certificate report
    And select salary account no "<salary acc no>" on salary certificate report
    And select format "<format>" on salary certificate report
    And select year "<year>" on salary certificate report
    Then click show to open salary certificate report

    Examples: 
      | school bank      | salary acc no  | format     | year      |
      | All School Banks | All Salary A/C | Format One | 2017-2018 |

  #quarterly form 24q
  @scenario14
  Scenario Outline: To test quarterly form 24q
    Given quarterly form 24q page opened
    When user select school bank "<school bank>" on quarterly form 24q
    And select salary account no "<salary acc no>" on quarterly form 24q
    And select salary month "<salary month>" on quarterly form 24q
    Then click show to open quarterly form 24q

    Examples: 
      | school bank      | salary acc no  | salary month |
      | All School Banks | All Salary A/C | 2017 - April |

  #salary statement employee wise
  @scenario15
  Scenario Outline: To test salary statement employee wise
    Given salary statement employee wise page opened
    When user select salary account no "<salary acc no>" on salary statement employee wise
    And select staff type "<staff type>" on salary statement employee wise
    And select staff "<staff>" on salary statement employee wise
    Then click show to open salary statement employee wise

    Examples: 
      | salary acc no  | staff type      | staff      |
      | All Salary A/C | All Staff Types | All Staffs |

  #estimated salary report
  @scenario16
  Scenario Outline: To test estimated salary report
    Given estimated salary report page opened
    When user select school bank "<school bank>" on estimated salary report
    And select salary account no "<salary acc no>" on estimated salary report
    And select staff type "<staff type>" on estimated salary report
    And select staff "<staff>" on estimated salary report
    And select format "<format>" on estimated salary report
    Then click show to open estimated salary report

    Examples: 
      | salary acc no  | staff type      | staff      | school bank      | format   |
      | All Salary A/C | All Staff Types | All Staffs | All School Banks | Format 1 |

  #salary slip
  @scenario17
  Scenario Outline: To test salary slip
    Given salary slip page opened
    When user select school name "<school name>" on salary slip
    And select staff type "<staff type>" on salary slip
    And select salary month "<salary month>" on salary slip
    Then click show to open salary slip
    And select employee "<employee>" on salary slip
    Then click print to view salary slip

    Examples: 
      | staff type      | school name               | salary month |employee|
      | All Staff Types | Inspiration public school | April - 2017 |pallavi|

  #consolidated salary statement
  @scenario18
  Scenario Outline: To test consolidated salary statement
    Given consolidated salary statement page opened
    When user select staff type "<staff type>" on consolidated salary statement
    And select salary month "<salary month>" on consolidated salary statement
    Then click show to open consolidated salary statement
    And select employee "<employee>" on consolidated salary statement

    Examples: 
      | staff type | salary month | employee |
      | Teachers   | 2017 - April | pallavi  |
