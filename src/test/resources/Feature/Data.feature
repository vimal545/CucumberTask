
Feature: Veriyfying the mirrorfly application


Scenario: Login in webchat and check if name of user is displayed
Given webchat login page is displayed
When I scan the QR code
Then Name "VimalVijayan" should be displayed on top left corner

Scenario: User should get navigated to 'New chat' tab on clicking on new chat icon
Given Recent chat list header is displayed
When I clicks on new chat icon
Then New chat tab is displayed

Scenario Outline: Search result should match with the keyword entered in the search field
Given Again New chat tab is displayed 
When I click on search field
And Enter a search text "<keyword>"
Then search result should contain the entered text <keyword>

Examples:
|keyword     |
|VimalVijayan|