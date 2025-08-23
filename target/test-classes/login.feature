Feature: Login page test cases

  @test @valid_login
  Scenario: Login as a Admin
    Given Load UI
    Then Enter the Username admin
    Then Enter the password as password
    Then Click the login button
    Then Verify the dashboard header as Student MS
    And Logout from the system


  @test @invalid_login
  Scenario: Verify the invalid login error message
    Given Load UI
    Then Enter the Username admin
    Then Enter the password as wrongpassword
    Then Click the login button
    Then Verify the error message as Invalid username or password
