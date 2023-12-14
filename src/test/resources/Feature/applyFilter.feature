Feature: User is able to search phone and apply specific filter

Scenario: user is able to apply filter 

Given User is visits Amazone.in website
When User is search iphone on search box
And User is click on filter and select dropdowns - Price low to high, High to low,Average customer review
Then User should be successful apply filter