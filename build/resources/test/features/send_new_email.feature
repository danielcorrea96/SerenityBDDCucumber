@Feature1
Feature: FUNCTIONALITY - Send email on the gmail page.
  AS an AccentureTesting@gmail.com user
  I want to send an email.
  TO expose an introduction to the automation of cucumber tests, and in pickle language.

  Background: Open the browser on the Gmail page, and access with AccentureTesting2018 credentials
    Given Given that Accenture Testing enters with AccentureTesting2018 and 123456Accenture

  @tag1
  Scenario: TEST TO BE PERFORMED - Send Email from the Gmail page.
    When Accenture Testing wants to send a new email to danielcorrea1058@gmail.com with subject Automation of tests and body This message is generated automatically
    Then Accenture Testing expects to have sent your message to your friend with the subject Automation of tests