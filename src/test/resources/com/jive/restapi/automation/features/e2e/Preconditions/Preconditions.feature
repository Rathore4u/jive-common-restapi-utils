Feature: <CLOUD - API Experimental Suite> - <Precondition> - As ADMIN, I want to create Preconditions.

  Background:
    Given ADMIN logged into the system

  Scenario: API - As a first user create question [23007425]
    When Request to create a question
    Then Question is Created Successfully

  Scenario: API - Create a private group as first user [23007377]
    When Request to create an Private Group
    Then Private Group is Created Successfully

  Scenario: API - Verify standard user is able to create a discussion in Community [23007462]
    When Request to create a Discussion
    Then Discussion is Created Successfully

  Scenario: API - Verify standard user is able to create a blog post in Community [23007461]
    When Request to create a BlogPost
    Then BlogPost is Created Successfully

  Scenario: API - As a first user create question under group [23007431]
    When Request to create a question Under Place
    Then Question is Created Successfully Under Place

  Scenario: API - User 1 creates a BlogPost under group [23007406]
    When Request to create a BlogPost Under Place
    Then BlogPost is Created Successfully Under Place

  Scenario: API - User 1 creates a poll in group [23007388]
    When Request to create an Poll Under Place
    Then Poll is Created Successfully Under Place

  Scenario: API - Verify standard user is able to create a poll in Community [23007474]
    When Request to create an Poll
    Then Poll is Created Successfully

  Scenario: API - User 1 creates a Project in group [23007492]
    When Request to create an Project
    Then Project is Created Successfully

  Scenario: API - User 1 creates a discussion in group [23007404]
    When Request to create a Discussion Under Place
    Then Discussion is Created Successfully Under Place

  Scenario: API - As a first user create a document Under Group [23007372]
    When Request to create a document "TestDocument" under place
    Then Document is created successfully

  Scenario: API - User 1 creates a Idea in group [23007393]
    When Request to create an "TestIdea" idea
    Then Idea is Created Successfully

  Scenario: API - Verify standard user is able to create an idea in Community [23007473]
    When Request to create an idea "TestIdea" Under Place
    Then Idea is Created Successfully Under Place