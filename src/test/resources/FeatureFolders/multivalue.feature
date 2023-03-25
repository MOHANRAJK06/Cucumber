

Feature: To verify Multi Value  Function

Scenario Outline: To validate the Multi Value Function

Given  User to Launch  the Url
When   User move to the Product-Categeory Dropdown
And    User Click  to the  Multiple Food Product  "<subCategeory>"
And    User add to the FindStore 
Then   User Sees the Selected  Item

Examples:

|subCategeory|
|Granola|
|Gluten Free|
|Flours & Meals|

