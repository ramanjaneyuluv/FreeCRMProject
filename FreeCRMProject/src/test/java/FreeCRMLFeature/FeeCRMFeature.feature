@FreeCRM_Tool
Feature: FreeCRM Tool Site

@Login_Page_FreeCRM
Scenario: FreeCRM Login Page
    Given usl for FreeCRM
    When Enter username and password 
    Then click on login button