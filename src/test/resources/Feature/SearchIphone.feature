Feature: User able to search iphone and also able to add to cart the same product

Scenario: User able to search iphone

Given User visits website Amazone.in
When User is  search the iphone on search box
And User click on search button
Then Users should be visible the list of the products

Scenario: User able to select the specific product from the list

Given Users visible the list of products
When User is  click on specific product which is want
Then User select the product 
And User reach out on the product details page 
Then User able to see product details page

Scenario: User able to product are select and Add To Cart

Given User should be visible specific product on the product details page
When User  click on Add to Cart 
Then User should be add the product on Add To Cart