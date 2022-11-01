@contactsTag
Feature: Contacts Module Functionality
  Agile story: As a user, I should be able to create a new contact and
  edit/delete any contact under Contacts module


Scenario: User can create a new contact
  When user add new contact
  Then new contact is created


Scenario: User can have list of contacts
  When user is on the contact's page
  Then user can observe list of contacts


Scenario: User can change contact avatar
  Given user is on the contact's page
  When user choose avatar from files
  Then avatar is successfully changed

  @wip
Scenario: User can delete contact
  Given user add new contact
  When user delete contact
  Then contact is successfully deleted


