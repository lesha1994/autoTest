Feature: Login into

  Background: Successful login into
    When Login page is opened
    And I input in field ACCESS_CODE value
    And I click CONTINUE button on Login Page
    And I input in field USERNAME value
    And I input in field PASSWORD value
    And I click LOGIN button on Login Page
    And I click STORE dropdown
    And I click dropdown item by 'Ingenico Test Store (test)' value in dropdown list
    And I input in field REGISTER value in string '1'
    And I click LANGUAGE dropdown
    And I click dropdown item by 'English' value in dropdown list
    And I click OK button on Login Page
    And i click on SideBar icon REGISTER_OPERATIONS
    And I checked CashRegister if it is open then open register and if it is close then do nothing
    And i click on SideBar icon CART


  @ui
  Scenario: Synchronize system
    And I click on SYNCHRONIZE button on side bar
    And I check if SIDEBAR_MENU display


  @ui
  Scenario: Cash transaction
    And I click on SEARCH_INPUT button to find product
    And I input in search field SEARCH_INPUT value '2720'
    And I click on PRODUCT that was found
    And I click MAKE_PAYMENT button on General Page
    And I choose payment type CASH
    And I click EXACT button in Cash Payment block
    And I click COMPLETE_TRANSACTION button on General Page
    And I sleep for 4 seconds




      @ui
      Scenario: Void transaction
        And I processed new transaction without complete
        And I get transaction id on receipt page
        And I click COMPLETE_TRANSACTION button on General Page
        And I click on TRANSACTIONS button in sidebar
        And I click on line by id from last transaction
        And I click on VOID_BUTTON button on transaction details screen
        And I click on CONTINUE_BUTTON button on transaction details screen




      @ui
      Scenario: Successful logout
        And I click on SideBar icon LOGOUT
        And I check if I can see USERNAME field on Login Page
        And I check if I can see PASSWORD field on Login Page
        And I check if I can see ACCESS_CODE field on Login Page





















