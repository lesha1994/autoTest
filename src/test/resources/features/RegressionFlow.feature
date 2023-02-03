Feature: RegressionFlow

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
  Scenario: Connect terminal
    And I click on SETTINGS button in sidebar
    And I click on DEVICE SETTING button in Settings dropdowm
    And I click on ADD DEVICE button
    And I click on TERMINALS on Device Type Screen
    And I click on Ingenico iSC250 terminal
    And I click on TOGGLE to use as Signature Capture
    And I click on ADD_DEVICE_ON_TERMINAL_PAGE button
    And I check that POP-UP display
    And I click on DONE button


  @ui
  Scenario: Remove terminal
    And I click on SETTINGS button in sidebar
    And I click on DEVICE SETTING button in Settings dropdowm
    And I click on DOTS in front of Ingenico
    And I click on REMOVE DEVICE button in pop-up
