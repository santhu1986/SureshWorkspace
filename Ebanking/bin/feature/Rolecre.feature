Feature: Role Creation

Scenario Outline: Verify Role Creation with Multiple Data

Given Tester On Ranford Home Page

When Tester Enters Username and Password click Login

When Tester Click on Role Button

Then Tester Click on New Role and Enters "<RoleName>" and "<RoleType>"

Then Tester Close the Application

Examples:

    | RoleName | RoleType |
    | Cashierbk | E |
    | ClerkBhk | E |
    | Managerjh | E |
