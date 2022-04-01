@SearchRoadtrip
Feature: Search Roadtrip flight
  As a user
  I want to search the roadtrip flight
  So that I can book the flight

  Scenario: Return roadtrip
    Given a user connected to kayak site
    When a user choose the departure "FCO" and arrival "ZRH" airports
    And a user choose the departure "22 maggio 2022" and return "24 giugno 2022" time range
    And a user start the search
    And a user choose the max price in CHF "340"
    Then the system shows the flights