$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFolders/Addtocart.feature");
formatter.feature({
  "name": "To Verify add  to cart functionallity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the add to cart function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch the bobsredmill application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter user name \"\u003cMAILID\u003e\"and password \"\u003cPASSWORD\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user sees the home page",
  "keyword": "And "
});
formatter.step({
  "name": "user go to products section",
  "keyword": "And "
});
formatter.step({
  "name": "user click product selected  button",
  "keyword": "And "
});
formatter.step({
  "name": "user sees the added  one item in cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MAILID",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "MOHAN",
        "Mohan@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the add to cart function",
  "description": "",
  "keyword": "Scenario Outline"
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
  "status": "passed"
});
formatter.step({
  "name": "user enter user name \"MOHAN\"and password \"Mohan@1234\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_sees_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user go to products section",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_go_to_products_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click product selected  button",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_product_selected_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees the added  one item in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_sees_the_added_one_item_in_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFolders/Login.feature");
formatter.feature({
  "name": "To Verify add Login  functionallity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To verify login using valid and Invalid  credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter user name \"\u003cMAILID\u003e\" and password \"\u003cPASSWORD\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user sees the home page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MAILID",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "MOHAN",
        "Mohan@1234"
      ]
    },
    {
      "cells": [
        "Sarath",
        "Sarath@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify login using valid and Invalid  credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter user name \"MOHAN\" and password \"Mohan@1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_enter_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_sees_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login using valid and Invalid  credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter user name \"Sarath\" and password \"Sarath@1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_enter_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_sees_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFolders/Search.feature");
formatter.feature({
  "name": "To Verify search functionallity",
  "description": "",
  "keyword": "Feature"
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
  "keyword": "Scenario Outline"
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
  "status": "passed"
});
formatter.step({
  "name": "user Enter the \"Meals\"  in search  Box",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_Enter_the_in_search_Box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Search box",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_the_Search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Sees Relevanc products",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_Relevanc_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the search relevance using Avaliable",
  "description": "",
  "keyword": "Scenario Outline"
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
  "status": "passed"
});
formatter.step({
  "name": "user Enter the \"Powder\"  in search  Box",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_Enter_the_in_search_Box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Search box",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_click_the_Search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Sees Relevanc products",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_Relevanc_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFolders/multivalue.feature");
formatter.feature({
  "name": "To verify Multi Value  Function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the Multi Value Function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User to Launch  the Url",
  "keyword": "Given "
});
formatter.step({
  "name": "User move to the Product-Categeory Dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "User Click  to the  Multiple Food Product  \"\u003csubCategeory\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User add to the FindStore",
  "keyword": "And "
});
formatter.step({
  "name": "User Sees the Selected  Item",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subCategeory"
      ]
    },
    {
      "cells": [
        "Granola"
      ]
    },
    {
      "cells": [
        "Gluten Free"
      ]
    },
    {
      "cells": [
        "Flours \u0026 Meals"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the Multi Value Function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to Launch  the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Bobsredmiill.user_to_Launch_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User move to the Product-Categeory Dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_move_to_the_Product_Categeory_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click  to the  Multiple Food Product  \"Granola\"",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_Click_to_the_Multiple_Food_Product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add to the FindStore",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_add_to_the_FindStore()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Sees the Selected  Item",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_the_Selected_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Multi Value Function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to Launch  the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Bobsredmiill.user_to_Launch_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User move to the Product-Categeory Dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_move_to_the_Product_Categeory_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click  to the  Multiple Food Product  \"Gluten Free\"",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_Click_to_the_Multiple_Food_Product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add to the FindStore",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_add_to_the_FindStore()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Sees the Selected  Item",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_the_Selected_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Multi Value Function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to Launch  the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Bobsredmiill.user_to_Launch_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User move to the Product-Categeory Dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "Bobsredmiill.user_move_to_the_Product_Categeory_Dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click  to the  Multiple Food Product  \"Flours \u0026 Meals\"",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_Click_to_the_Multiple_Food_Product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add to the FindStore",
  "keyword": "And "
});
formatter.match({
  "location": "Bobsredmiill.user_add_to_the_FindStore()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Sees the Selected  Item",
  "keyword": "Then "
});
formatter.match({
  "location": "Bobsredmiill.user_Sees_the_Selected_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});