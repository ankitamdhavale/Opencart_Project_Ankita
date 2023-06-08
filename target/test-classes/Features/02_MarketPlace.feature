Feature: Marketplace

Scenario Outline: Validate Search Functionality with Valid data
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page
     When User clicks on marketplace
     And User navigates to the marketplace page
     And User enters data "<Search>" in the search bar
     And User clicks on search icon
     Then it shows the list of product
     
Examples:
    
      |     Search     |     
      |Shipping Methods|
      |     Themes     |
      
      
Scenario Outline: Validate Search Functionality with InValid data
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page
     When User clicks on marketplace
     And User navigates to the marketplace page
     And User enters data "<Search>" in the search bar
     And User clicks on search icon
     Then it shows the list of product
     
Examples:
    
      |     Search     |     
      |   Mobile App   |
      
      
      
      
      