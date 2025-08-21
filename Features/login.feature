Feature: Login page test cases

  @test
  Scenario: Login as a Admin
    Given Load UI
    Then Enter the Username admin
    Then Enter the password as password
    Then Click the login button
    Then Verify the dashboard header as Student MS

  @login
  Scenario: Verify the Footer text is correct
    Given Load UI
    Then Verify the Footer text is OrangeHRM OS 5.7
    And Close the window
