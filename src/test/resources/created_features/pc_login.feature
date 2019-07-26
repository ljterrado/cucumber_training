@PCLogin
Feature: Login superuser on PC9

  Scenario Outline: Logging In
    Given On PC Login Page
    When Enter <user> and Pass <pass>
    Then Should be on Desktop View on PC

    Examples:
      | user   | pass |
      | "su" | "gw" |