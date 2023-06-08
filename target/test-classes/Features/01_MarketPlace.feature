Feature: Marketplace 

Scenario: Validate user Navigates to marketplace page
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page
     When User clicks on marketplace
     And User Navigates on marketplace page
    
Scenario: View the marketplace page UI
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page and able to see logo
     When User clicks on marketplace 
     And User Navigates to the marketplace page and see text
     

Scenario: View the marketplace page Functionality
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page
     When User clicks on marketplace
     And User Navigates on marketplace page
     Then User click on dropdrown list of sort by and select option
     
   
     