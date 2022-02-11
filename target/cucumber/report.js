$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/webdriveruniversity_features/Login.feature");
formatter.feature({
  "name": "User logins to webdriveruniversity.com with diff credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User login to webdriver university with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enters Username \"\u003cUsername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters Password \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "sasasa",
        "dsds"
      ]
    },
    {
      "cells": [
        "ddsdsd",
        "uuttyt"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on webdriveruniversity.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_is_on_webdriveruniversity_com_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login portal to sign in",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_click_on_login_portal_to_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login to webdriver university with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enters Username \"sasasa\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password \"dsds\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_submits_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on webdriveruniversity.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_is_on_webdriveruniversity_com_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login portal to sign in",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_click_on_login_portal_to_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login to webdriver university with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user enters Username \"ddsdsd\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password \"uuttyt\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_submits_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User login to webdriver university with invalid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters Username \"\u003cUsername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters Password \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "121212",
        "dfsfd"
      ]
    },
    {
      "cells": [
        "888888",
        "ujklo"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on webdriveruniversity.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_is_on_webdriveruniversity_com_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login portal to sign in",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_click_on_login_portal_to_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login to webdriver university with invalid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters Username \"121212\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password \"dfsfd\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_submits_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on webdriveruniversity.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_is_on_webdriveruniversity_com_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login portal to sign in",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_click_on_login_portal_to_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login to webdriver university with invalid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters Username \"888888\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password \"ujklo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_enters_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits the details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.Login.user_submits_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});