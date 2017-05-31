Feature: Franciscan Payroll
      As a user I would like to verify that 
      The page is loaded successfully

  Background: 
    Given user enter url "http://qaerp.franciscanecare.net"
    When user enter username "admin" and password "Admin#franciscan"
    And passes school name "qaerp"
    And click signin
    Then payroll home page is opened

  #change academic
  @scenario1
  Scenario: To verify change academic page
    When user open change academic page
    Then verify change academic page

  #define academic year
  @scenario2
  Scenario: To verify define academic year page
    When user open define academic year page
    Then verify define academic year page

  #define financial year
  @scenario3
  Scenario: To verify define financial year page
    When user open define financial year page
    Then verify define financial year page

  #define profession
  @scenario4
  Scenario: To verify define profession page
    When user open define profession page
    Then verify define profession page

  #define staff type
  @scenario5
  Scenario: To verify define staff type page
    When user open define staff type page
    Then verify define staff type page

  #define staff
  @scenario6
  Scenario: To verify define staff page
    When user open define staff page
    Then verify define staff page

  #define department
  @scenario7
  Scenario: To verify define department page
    When user open define department page
    Then verify define department page

  #define sms template
  @scenario8
  Scenario: To verify define sms template page
    When user open define sms template page
    Then verify define sms template page

  #define designation
  @scenario9
  Scenario: To verify define designation page
    When user open define designation page
    Then verify define designation page

  #define salary account
  @scenario10
  Scenario: To verify define salary account page
    When user open define salary account page
    Then verify define salary account page

  #define global settings
  @scenario11
  Scenario: To verify define global settings page
    When user open define global settings page
    Then verify define global settings page

  #define salary month
  @scenario12
  Scenario: To verify define salary month page
    When user open define salary month page
    Then verify define salary month page

  #define income tax slab
  @scenario13
  Scenario: To verify define income tax slab page
    When user open define income tax slab page
    Then verify define income tax slab page

  #define salary group
  @scenario14
  Scenario: To verify define salary group page
    When user open define salary group page
    Then verify define salary group page

  #define salary head
  @scenario15
  Scenario: To verify define salary head page
    When user open define salary head page
    Then verify define salary head page

  #relate static dynamic heads
  @scenario16
  Scenario: To verify relate static dynamic heads page
    When user open relate static dynamic heads page
    Then verify relate static dynamic heads page

  #assign salary group to head
  @scenario17
  Scenario: To verify assign salary group to head page
    When user open assign salary group to head page
    Then verify assign salary group to head page

  #assign salary group to staff
  @scenario18
  Scenario: To verify assign salary group to staff page
    When user open assign salary group to staff page
    Then verify assign salary group to staff page

  #define it head groups
  @scenario19
  Scenario: To verify define it head groups page
    When user open define it head groups page
    Then verify define it head groups page

  #define it head
  @scenario20
  Scenario: To verify define it head page
    When user open define it head page
    Then verify define it head page

  #define tds deductee
  @scenario21
  Scenario: To verify define tds deductee page
    When user open define tds deductee page
    Then verify define tds deductee page

  #basic salary structure
  @scenario22
  Scenario: To verify basic salary structure page
    When user open basic salary structure page
    Then verify basic salary structure page

  #generate bar code
  @scenario23
  Scenario: To verify generate bar code page
    When user open generate bar code page
    Then verify generate bar code page

  #define pay scale
  @scenario24
  Scenario: To verify define pay scale page
    When user open define pay scale page
    Then verify define pay scale page

  #define pay scale amount
  @scenario25
  Scenario: To verify define pay scale amount page
    When user open define pay scale amount page
    Then verify define pay scale amount page

  #define grade pay
  @scenario26
  Scenario: To verify define grade pay page
    When user open define grade pay page
    Then verify define grade pay page

  #define fixation
  @scenario27
  Scenario: To verify define fixation page
    When user open define fixation page
    Then verify define fixation page

  #staff salary structure
  @scenario28
  Scenario: To verify staff salary structure page
    When user open staff salary structure page
    Then verify staff salary structure page

  #assign info bulk
  @scenario29
  Scenario: To verify assign info bulk page
    When user open assign info bulk page
    Then verify assign info bulk page

  #bonus calculations
  @scenario30
  Scenario: To verify bonus calculations page
    When user open bonus calculations page
    Then verify bonus calculations page

  #leave lwp manual
  @scenario31
  Scenario: To verify leave lwp manual page
    When user open leave lwp manual page
    Then verify leave lwp manual page

  #occasional allowance deduction
  @scenario32
  Scenario: To verify occasional allowance deduction page
    When user open occasional allowance deduction page
    Then verify occasional allowance deduction page

  #salary generation
  @scenario33
  Scenario: To verify salary generation page
    When user open salary generation page
    Then verify salary generation page

  #increment roll back
  @scenario34
  Scenario: To verify increment roll back page
    When user open increment roll back page
    Then verify increment roll back page

  #bank statement
  @scenario35
  Scenario: To verify bank statement page
    When user open bank statement page
    Then verify bank statement page

  #it head entry
  @scenario36
  Scenario: To verify it head entry page
    When user open it head entry page
    Then verify it head entry page

  #tds entry
  @scenario37
  Scenario: To verify tds entry page
    When user open tds entry page
    Then verify tds entry page

  #auto increment
  @scenario38
  Scenario: To verify auto increment page
    When user open auto increment page
    Then verify auto increment page

  #fix advance account
  @scenario39
  Scenario: To verify fix advance account page
    When user open fix advance account page
    Then verify fix advance account page

  #advance entry
  @scenario40
  Scenario: To verify advance entry page
    When user open advance entry page
    Then verify advance entry page

  #advance repayment
  @scenario41
  Scenario: To verify advance repayment page
    When user open advance repayment page
    Then verify advance repayment page

  #advance ledger report
  @scenario42
  Scenario: To verify advance ledger report page
    When user open advance ledger report page
    Then verify advance ledger report page
