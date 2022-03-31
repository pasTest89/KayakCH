$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/org.kayakCH/KayakSearch.feature");
formatter.feature({
  "name": "Search Roadtrip flight",
  "description": "  As a user\n  I want to search the roadtrip flight\n  So that I can book the flight",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SearchRoadtrip"
    }
  ]
});
formatter.scenario({
  "name": "Return roadtrip",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SearchRoadtrip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user connected to kayak site",
  "keyword": "Given "
});
formatter.match({
  "location": "org.kayakCH.StepDefinitions.a_user_connected_to_kayak_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user choose the departure \"BGY\" and arrival \"ZRH\" airports",
  "keyword": "When "
});
formatter.match({
  "location": "org.kayakCH.StepDefinitions.a_user_choose_the_departure_and_arrival_airports(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user choose the departure \"10.05.2022\" and return \"15.05.2022\" time range",
  "keyword": "And "
});
formatter.match({
  "location": "org.kayakCH.StepDefinitions.a_user_choose_the_departure_and_return_time_range(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user start the search",
  "keyword": "And "
});
formatter.match({
  "location": "org.kayakCH.StepDefinitions.a_user_start_the_search()"
});
