@OpenAUT
Feature: Tags in Feature FIle

  @EDUBankCustomer
  Scenario: Open AUT and Print Title
    Given The Customer is on EDU customer Login Page
    When Enters Login credentials
    Then Get title of the Page Displayed

  @EDUBankTeller
  Scenario: Open AUT and Print Title
    Given EDU Bank Teller Home Page
    When Enters login Details
    Then Logged in 

