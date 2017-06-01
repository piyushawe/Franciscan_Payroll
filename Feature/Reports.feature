Feature: Reports
   As a user I would like to open reports
   so that I can verify them

  Background: 
    Given user enter url " http://192.168.10.101:8069/Modules.aspx"
    When user enter username "admin" and password "admin@123"
    And passes school name "rosary"
    And click signin
    Then payroll home page is opened

  #date range retirement report
  @scenario1
  Scenario: To test date range retirement report
    Given date range retirement report page opened
    When user enter from date as month "April" year "2017" and day "1" on date range retirement report
    And enter to date as month "March" year "2018" and day "31" on date range retirement report
    Then click show to open date range retirement report

  #employee statistics
  @scenario2
  Scenario Outline: To test employee statistics
    Given employee statistics report page opened
    When user select school bank "<school bank>" on employee statistics page
    And select salary account no "<salary acc no>" on employee statistics page
    And select designation "<designation>" on employee statistics page
    And select status "<status>" on employee statistics page
    And click select all on employee statistics page
    Then click show to open employee statistics report

    Examples: 
      | school bank      | salary acc no  | designation      | status     |
      | All School Banks | All Salary A/C | All Designations | Select All |

  #esi report
  @scenario3
  Scenario Outline: To test esi report
    Given esi report page opened
    When user select school bank "<school bank>" on esi report
    And select salary account no "<salary acc no>" on esi report
    And select staff type "<staff type>" on esi report
    And select salary month "<salary month>" on esi report
    And select format "<format>" on esi report
    Then click show to open esi report

    Examples: 
      | school bank      | salary acc no  | staff type      | salary month | format  |
      | All School Banks | All Salary A/C | All Staff Types | April - 2017 | Default |

  #form16
  @scenario4
  Scenario Outline: To test form16
    Given form16 report page opened
    When user select staff type "<staff type>" on form 16 page
    And select staff name "<staff name>" on form 16 page
    Then click show to open form 16 page

    Examples: 
      | staff type | staff name                       |
      | Teachers   | ALOK KUMAR SINHA  [SS/P/T/S-240] |

  #pfchallan report
  @scenario5
  Scenario Outline: To test pfchallan report
    Given pfchallan report page opened
    When user select school bank "<school bank>" on pfchallan report
    And select salary account no "<salary acc no>" on pfchallan report
    And select format "<format>" on pfchallan report
    And select salary month "<salary month>" on pfchallan report
    Then click show to open pfchallan report

    Examples: 
      | school bank      | salary acc no  | format     | salary month |
      | All School Banks | All Salary A/c | Format One | April - 2017 |

  #pf report
  @scenario6
  Scenario Outline: To test pf report
    Given pf report page opened
    When user select school bank "<school bank>" on pf report
    And select salary account no "<salary acc no>" on pf report
    And select format "<format>" on pf report
    And select salary month "<salary month>" on pf report
    Then click show to open pf report

    Examples: 
      | school bank      | salary acc no  | format     | salary month |
      | All School Banks | All Salary A/C | Format One | April - 2017 |

  #retirement report
  @scenario7
  Scenario Outline: To test retirement report
    Given retirement report page opened
    When user select month and year "<month-year>" on retirement report
    Then click show to open retirement report

    Examples: 
      | month-year   |
      | April - 2017 |

  #professional tax
  @scenario8
  Scenario Outline: To test professional tax report
    Given professional tax report page opened
    When user select school name "<school name>" on professional tax report
    And user select school bank "<school bank>" on professional tax report
    And select salary account no "<salary acc no>" on professional tax report
    And select salary month "<salary month>" on professional tax report
    Then click show to open professional tax report

    Examples: 
      | school bank      | salary acc no  | school name        | salary month |
      | All School Banks | All Salary A/C | Inspiration School | April - 2017 |

  #super annuciation report
  @scenario9
  Scenario: To test super annuciation report
    Given super annuciation report page opened
    Then click show to open super annuciation report

  #pension list
  @scenario10
  Scenario: To test pension list report
    Given pension list report page opened
    Then click show to open pension list report

  #macp list
  @scenario11
  Scenario Outline: To test macp list report
    Given macp list report page opened
    When user select school bank "<school bank>" on macp list report
    And select salary account no "<salary acc no>" on macp list report
    And select format "<format>" on macp list report
    Then click show to open macp list report

    Examples: 
      | school bank      | salary acc no  | format            |
      | All School Banks | All Salary A/C | Eligible For MACP |

  #fixation report
  @scenario12
  Scenario Outline: To test fixation report
    Given fixation report page opened
    When user select school bank "<school bank>" on fixation report
    And select salary account no "<salary acc no>" on fixation report
    Then click show to open fixation report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |

  @scenario13
  Scenario Outline: To test fixation report with detail
    Given fixation report page opened
    When user select school bank "<school bank>" on fixation report
    And select salary account no "<salary acc no>" on fixation report
    And select in detail on fixation report
    Then click show to open fixation report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |

  #experience certificate report
  @scenario14
  Scenario Outline: To test experience certificate report
    Given experience certificate report page opened
    When user select school bank "<school bank>" on experience certificate report
    And select salary account no "<salary acc no>" on experience certificate report
    And select format "<format>" on experience certificate report
    And select month year "<month-year>" on experience certificate report
    Then click show to open experience certificate report

    Examples: 
      | school bank      | salary acc no  | format         | month-year   |
      | All School Banks | All Salary A/C | Default Format | April - 2017 |

  #glsi report
  @scenario15
  Scenario Outline: To test glsi report
    Given glsi report page opened
    When user select school bank "<school bank>" on glsi report
    And select salary account no "<salary acc no>" on glsi report
    And select salary month "<salary month>" on glsi report
    Then click show to open glsi report

    Examples: 
      | school bank      | salary acc no  | salary month |
      | All School Banks | All Salary A/C | April - 2017 |

  #gross form16
  @scenario16
  Scenario Outline: To test gross form16
    Given gross form16 report page opened
    When user select school name "<school name>" on gross form16 report
    And select school bank "<school bank>" on gross form16 report
    And select session "<session>" on gross form16 report
    Then click show to open gross form16 report

    Examples: 
      | school bank      | school name               | session   |
      | All School Banks | Inspiration public school | 2017-2018 |

  #salary compare
  @scenario17
  Scenario Outline: To test salary compare
    Given salary compare page opened
    When user select school bank "<school bank>" on salary compare report
    And select salary account no "<salary acc no>" on salary compare report
    Then click show to open salary compare report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |

  #increment report
  @scenario18
  Scenario Outline: To test increment report with basic salary and active state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "basic salary" on increment report
    And select status "Active" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |

  @scenario19
  Scenario Outline: To test increment report with dearness allowance and active state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "dearness allowance" on increment report
    And select status "Active" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |
      
  @scenario20
  Scenario Outline: To test increment report with transport allowance and active state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "transport allowance" on increment report
    And select status "Active" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |
      
  @scenario21
  Scenario Outline: To test increment report with house rent allowance and active state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "house rent allowance" on increment report
    And select status "Active" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |
      
  @scenario22
  Scenario Outline: To test increment report with basic salary and deactive state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "basic salary" on increment report
    And select status "Deactive" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |

  @scenario23
  Scenario Outline: To test increment report with dearness allowance and deactive state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "dearness allowance" on increment report
    And select status "Deactive" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |
      
  @scenario24
  Scenario Outline: To test increment report with transport allowance and deactive state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "transport allowance" on increment report
    And select status "Deactive" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |
      
  @scenario25
  Scenario Outline: To test increment report with house rent allowance and deactive state
    Given increment report page opened
    When user select school bank "<school bank>" on increment report
    And select salary account no "<salary acc no>" on increment report
    And select increment "house rent allowance" on increment report
    And select status "Deactive" on increment report
    Then click show to open increment report

    Examples: 
      | school bank      | salary acc no  |
      | All School Banks | All Salary A/C |