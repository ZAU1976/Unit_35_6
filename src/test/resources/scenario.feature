Feature: Filling card
  Scenario: add item to card
    Given url of labirint 'https://www.labirint.ru/'
    When website is open accept all cookie
    Then start search 'детективы'
    Then ckick on first
    Then click add button
  Scenario: find all 'детективы'
    Given url of labirint 'https://www.labirint.ru/'
    When website is open accept all cookie
    Then start search 'ltntrnbds'