Feature: Choucair Empleos

    Scenario: look for a title
        Given I go to Choucair page
        When page loads
        Then I should see Empleos sectionTitles

    Scenario: Look for ¿Qué es ser Choucair?
        Given I go to Choucair page
        When page loads
        Then ¿Que es ser Choucair? title should exist

    Scenario: Check if youtube video exist and plays
        Given I go to Choucair page
        When page loads
        Then Video Should exist and play