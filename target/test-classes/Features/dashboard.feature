Feature: Dashboard Test Cases

  @dashboard @test
  Scenario: Verify the functionality of search option in dashboard
    Given Load UI
    Then Enter the Username admin@example.com
    Then Enter the password as qwerty
    Then Click the login button
    Then Check the visual bugs in Dashboard

  @dashboard @test
  Scenario: Verify the Upgrade option in navigation bar
    Given Load UI
    Then Enter the Username Admin
    Then Enter the password as admin123
    Then Click the login button
    Then Verify the upgrade option in navbar
    Then Logout from the system
#    And Close the window

  @dashboard @test
  Scenario: Verify the Side navigation minimize arrow
    Given Load UI
    Then Enter the Username Admin
    Then Enter the password as admin123
    Then Click the login button
    Then Click the Minimize arrow in side navigation bar
    Then Logout from the system

  @dashboard @test
  Scenario: Verify the Help button is available in dashboard
    Given Load UI
    Then Enter the Username Admin
    Then Enter the password as admin123
    Then Click the login button
    Then Click the help button in dashboard
    Then Close the window
