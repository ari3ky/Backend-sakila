Feature: get a specific actor.


  Scenario Outline: getting a specific actor from the DB.
    Given an actor exists with id <Actorid>
    When i request an actors details
    Then the webpage should show the actors "<firstname>" and "<lastname>"
    Examples:
      | Actorid | firstname | lastname     |
      |   1     | PENELOPE  | GUINESS      |
      |   5     | JOHNNY    | LOLLOBRIGIDA |
      |   3     | BORIS     | JOHNSON      |