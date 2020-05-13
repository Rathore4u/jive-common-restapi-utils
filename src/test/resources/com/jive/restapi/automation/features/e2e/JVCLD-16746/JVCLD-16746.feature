@sample
Feature: [CLOUD - API Experimental Suite] - [JVCLD-16746] - [E2E test scenario for JVCLD-1534]

  Background:
    Given We are running E2E JVCLD-16746
    Given ADMIN logged into the system

  Scenario: Verify that user is able to create/edit "\" tag in a document [23006381]
    Given User FOO has been created
    When User FOO logs in
    When Logged in user requests to create document DOCFOO with tags test\upgrade
    Then Document DOCFOO is created successfully
    When Logged in user requests to update document DOCFOO with tags test\upgrade,NewTag
    Then Document DOCFOO is updated with tags test\upgrade successfully

  Scenario: API - Verify that user is able to edit/delete document with "\" tag [23162771]
    # Precondition and Step 1 Covered in previous test case 23006381
    When User request to search document DOCFOO by subject from spotlight
    Then Document DOCFOO is searched successfully
    When User request to delete document DOCFOO
    Then Document DOCFOO is deleted successfully

  Scenario: API - Verify that user is able to create/edit "\" tag in a Discussion [23162804]
    # Precondition and Step 1 Covered in previous test case 23006381
    When Logged in user requests to create a discussion DISFOO with tags test\upgrade
    Then Discussion DISFOO is created successfully
    When Logged in user requests to update a discussion DISFOO with tags test\upgrade,NewTag
    Then Discussion DISFOO is updated with tags test\upgrade successfully

  Scenario: API - Verify that user is able to edit/delete Discussion with "\" tag [23162815]
    # Precondition and Step 1 Covered in previous test case 23006381
    When User request to search discussion DISFOO by subject from spotlight
    Then Discussion DISFOO is searched successfully
    When User request to delete discussion DISFOO
    Then Discussion DISFOO is deleted successfully