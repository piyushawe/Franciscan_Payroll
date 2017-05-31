$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/VerifyPage.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan Fee",
  "description": "    As a user I would like to verify that \r\n    The page is loaded successfully",
  "id": "franciscan-fee",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4229746076,
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
  "duration": 1909399589,
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
  "duration": 152183049,
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
  "duration": 73604,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_signin()"
});
formatter.result({
  "duration": 2757988362,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.payroll_home_page_is_opened()"
});
formatter.result({
  "duration": 1217432716,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 271,
      "value": "#advance ledger report"
    }
  ],
  "line": 273,
  "name": "To verify advance ledger report page",
  "description": "",
  "id": "franciscan-fee;to-verify-advance-ledger-report-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 272,
      "name": "@scenario46"
    }
  ]
});
formatter.step({
  "line": 274,
  "name": "user open advance ledger report page",
  "keyword": "When "
});
formatter.step({
  "line": 275,
  "name": "verify advance ledger report page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_open_advance_ledger_report_page()"
});
formatter.result({
  "duration": 2957107044,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.verify_advance_ledger_report_page()"
});
formatter.result({
  "duration": 1172942160,
  "status": "passed"
});
formatter.after({
  "duration": 2784035269,
  "status": "passed"
});
});