$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Data.feature");
formatter.feature({
  "name": "Veriyfying the mirrorfly application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login in webchat and check if name of user is displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "webchat login page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.webchat_login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scan the QR code",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_scan_the_QR_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Name \"VimalVijayan\" should be displayed on top left corner",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.name_should_be_displayed_on_top_left_corner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should get navigated to \u0027New chat\u0027 tab on clicking on new chat icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Recent chat list header is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.recent_chat_list_header_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicks on new chat icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_clicks_on_new_chat_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New chat tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.new_chat_tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search result should match with the keyword entered in the search field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Again New chat tab is displayed",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on search field",
  "keyword": "When "
});
formatter.step({
  "name": "Enter a search text \"\u003ckeyword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "search result should contain the entered text \u003ckeyword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword"
      ]
    },
    {
      "cells": [
        "VimalVijayan"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search result should match with the keyword entered in the search field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Again New chat tab is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.again_New_chat_tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_click_on_search_field()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d86.0.4240.183)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-Q6E29EQ\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.183, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52007}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b9af4de32d00e625216adab281fe9359\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat org.step.StepDefinition.i_click_on_search_field(StepDefinition.java:71)\r\n\tat ✽.I click on search field(src/test/resources/Feature/Data.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter a search text \"VimalVijayan\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_a_search_text(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "search result should contain the entered text VimalVijayan",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.search_result_should_contain_the_entered_text_VimalVijayan()"
});
formatter.result({
  "status": "skipped"
});
});