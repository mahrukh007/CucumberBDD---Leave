$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/webuniversity/CucumberFrameworkESS/FeatureFiles/Leave.Feature");
formatter.feature({
  "line": 1,
  "name": "apply leaves",
  "description": "",
  "id": "apply-leaves",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4694161277,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login into account with correct validation and apply leaves",
  "description": "",
  "id": "apply-leaves;login-into-account-with-correct-validation-and-apply-leaves",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to ESS",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User navigates to Leave Managment \u003e\u003e Leave Request",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks ADD button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User selects leave type",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters days",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters start date",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters Reason",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks submit for approval button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Record is submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "LeaveSteps.user_navigates_to_ESS()"
});
formatter.result({
  "duration": 2794222988,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_enters_login_credentials()"
});
formatter.result({
  "duration": 2602787365,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_navigates_to_Leave_Managment_Leave_Request()"
});
formatter.result({
  "duration": 1793954422,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_clicks_ADD_button()"
});
formatter.result({
  "duration": 1602136476,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_selects_leave_type()"
});
formatter.result({
  "duration": 1225242555,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_enters_days()"
});
formatter.result({
  "duration": 1204190842,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_enters_start_date()"
});
formatter.result({
  "duration": 2671599089,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_enters_Reason()"
});
formatter.result({
  "duration": 1166221550,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_clicks_save_button()"
});
formatter.result({
  "duration": 937738230,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.user_clicks_submit_for_approval_button()"
});
formatter.result({
  "duration": 1590450392,
  "status": "passed"
});
formatter.match({
  "location": "LeaveSteps.record_is_submitted()"
});
formatter.result({
  "duration": 41254105,
  "status": "passed"
});
});