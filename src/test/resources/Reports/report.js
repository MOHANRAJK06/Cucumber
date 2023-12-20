$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFolders/Search.feature");
formatter.feature({
  "name": "To Verify search functionallity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mastro"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the search relevance using Avaliable",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch the bobsredmill application",
  "keyword": "Given "
});
formatter.step({
  "name": "user Enter the \"\u003cproduct\u003e\"  in search  Box",
  "keyword": "When "
});
formatter.step({
  "name": "user click the Search box",
  "keyword": "And "
});
formatter.step({
  "name": "user Sees Relevanc products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Meals"
      ]
    },
    {
      "cells": [
        "Powder"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the search relevance using Avaliable",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the bobsredmill application",
  "keyword": "Given "
});
formatter.match({
  "location": "Bobsredmiill.user_launch_the_bobsredmill_application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 114\nCurrent browser version is 119.0.6045.159 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe \nHost info: host: \u0027SARATH\u0027, ip: \u0027192.168.0.102\u0027\nBuild info: version: \u00274.8.2\u0027, revision: \u0027826dbfc730\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [null, newSession {capabilities\u003d[Capabilities {browserName: chrome, goog:chromeOptions: {args: [--remote-allow-origins\u003d*], extensions: []}}], desiredCapabilities\u003dCapabilities {browserName: chrome, goog:chromeOptions: {args: [--remote-allow-origins\u003d*], extensions: []}}}]\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:148)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:106)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:67)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:165)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:229)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:157)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:101)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:84)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:52)\r\n\tat mypac.Baseclass.laChorme(Baseclass.java:61)\r\n\tat org.steps.Bobsredmiill.user_launch_the_bobsredmill_application(Bobsredmiill.java:31)\r\n\tat ✽.User launch the bobsredmill application(file:src/test/resources/FeatureFolders/Search.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Enter the \"Meals\"  in search  Box",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_Enter_the_in_search_Box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click the Search box",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_the_Search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Sees Relevanc products",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_Relevanc_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the search relevance using Avaliable",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the bobsredmill application",
  "keyword": "Given "
});
formatter.match({
  "location": "Bobsredmiill.user_launch_the_bobsredmill_application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 114\nCurrent browser version is 119.0.6045.159 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe \nHost info: host: \u0027SARATH\u0027, ip: \u0027192.168.0.102\u0027\nBuild info: version: \u00274.8.2\u0027, revision: \u0027826dbfc730\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [null, newSession {capabilities\u003d[Capabilities {browserName: chrome, goog:chromeOptions: {args: [--remote-allow-origins\u003d*], extensions: []}}], desiredCapabilities\u003dCapabilities {browserName: chrome, goog:chromeOptions: {args: [--remote-allow-origins\u003d*], extensions: []}}}]\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:148)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:106)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:67)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:165)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:229)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:157)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:101)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:84)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:52)\r\n\tat mypac.Baseclass.laChorme(Baseclass.java:61)\r\n\tat org.steps.Bobsredmiill.user_launch_the_bobsredmill_application(Bobsredmiill.java:31)\r\n\tat ✽.User launch the bobsredmill application(file:src/test/resources/FeatureFolders/Search.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Enter the \"Powder\"  in search  Box",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_Enter_the_in_search_Box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click the Search box",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_the_Search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Sees Relevanc products",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_Relevanc_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});