@stories
  Feature: Utest Page
    As user, I want to join to page Utest

  @scenario
  Scenario: Go to page Utest and join
    Given than Brandon wants to join to page Utest
    When He fill all forms
    |strName|strLastName|strEmail          |strMonth|strDay|strYear|strCity|strZIP|strCountry|strLanguage|strComputer|strComputerOS  |strDevice|strDeviceModel|strDeviceOS|strPassword|
    |Brandon|Rogers     |brogers@mymail.com|January |1     |1990   |Quepos |00000 |Costa Rica|Spanish    |Windows    |Windows 10 Home|Xiaomi   |Mi Mix        |Android 10 |r39c7"UY4{ |
    Then He can view the Utest welcome Page
    |strverification|
    |Complete Setup |