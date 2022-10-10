$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "In order to access herokuapp \nAs a valid user with valid credentials\nI want to login successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the herokuapp welcome page",
  "keyword": "Given "
});
formatter.step({
  "name": "click on Form Authentication link",
  "keyword": "And "
});
formatter.step({
  "name": "I enter valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should be taken to the secure area page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "\"tomsmith\"",
        "\"SuperSecretPassword!\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the herokuapp welcome page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.testingproject.steps.Steps.i_am_on_the_herokuapp_welcome_page() in file:/C:/WebUICucumberProject/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Form Authentication link",
  "keyword": "And "
});
formatter.match({
  "location": "com.testingproject.steps.Steps.click_on_Form_Authentication_link() in file:/C:/WebUICucumberProject/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"tomsmith\" and \"SuperSecretPassword!\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.testingproject.steps.Steps.i_enter_valid_credentials(String,String) in file:/C:/WebUICucumberProject/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the secure area page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.testingproject.steps.Steps.i_should_be_taken_to_the_secure_area_page() in file:/C:/WebUICucumberProject/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});