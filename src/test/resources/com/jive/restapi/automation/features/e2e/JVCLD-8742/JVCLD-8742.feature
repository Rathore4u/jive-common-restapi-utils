Feature: [CLOUD - API Experimental Suite] - [JVCLD-8742] - [Content - Structured Outcomes - Mark as Outdated]

  Background:
    Given ADMIN logged into the system

  Scenario: Create a Regular User [23005513]
    When Requests to create a person
    Then person is created successfully
