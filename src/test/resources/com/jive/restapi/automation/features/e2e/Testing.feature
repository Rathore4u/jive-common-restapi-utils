Feature: <Suite Name> - <Jira Ticket Number> - As ADMIN, I want to create a person.

  Background:
    Given ADMIN logged into the system
    And We are running E2E TESTING

  Scenario: As Admin I want to get the list of places available
    When I read document 1071
    When User PIPPO has been created
    And User PIPPO logs in
    When I Look for message with id 1056
    When I Look for discussion with id 1137
    When I Look for discussion with id 1041
    Then I create a discussion DISC under PIPPO
    When I search for all places
    Then I find the community place

  Scenario: Publish discussion in community
    When I create a user with name PIPPO
    And PIPPO logged into the system
    Then I create a discussion DISC under PIPPO

  Scenario: As ADMIN, i want to test few utils [<TC Number>]
    When i test blogpost utils
    And i test idea utils
    When i test announcement utils

  Scenario: As Admin I want to test some utils
    Given I create a user with name Florian Dietrich
    When I search for an user with display name Florian Dietrich
    Then I found some users with Florian Dietrich

  Scenario: Testing content creation
    When I create a discussion
    Then a discussion is created

   Scenario: Testing file upload
     When I upload file image.png
     Then The file gets created

  Scenario: Add Poll Under Place
    Given I create poll under place
    And I create content under place

  @test
  Scenario: Testing Mention In RTE
    When I create a discussion with Group Mention
    Then I create a document with Content Mention


  # Would work if we knew how exactly use it ...
  Scenario: Testing create outcome
    When I create an outcome XYZ
    Then the outcome XYZ is created

  Scenario: Test Various things
    When I want to test create and update comment API
