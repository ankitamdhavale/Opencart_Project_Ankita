Feature: Excel

Scenario: Validate Search Functionality with Valid data
     Given Chrome is opened and Opencart application is launched
     Then User Navigates on landing page
     When User clicks on marketplace
     And User navigates to the marketplace page
     And User enters data from given sheetname "<SheetName>" and <RowNumber> in the search bar
     And User clicks on search icon
     Then it shows the list of product
     
Examples:
    
      |SheetName  |RowNumber  |     
      |Sheet1     |          0|
      |Sheet1     |          1|