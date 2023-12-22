Feature: Job search test on CV library functionality

  Scenario Outline: Verify Job Search Result Using Different Data Set
    Given I am on homepage
    When I enter JobTitle "<jobTitle>"
    Then I enter Location "<location>"
    And I select Distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter minimum salary "<salaryMin>"
    And I enter maximum salary "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select JobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"

    Examples:
      |jobTitle                  |location     |distance       |salaryMin |salaryMax |salaryType |jobType    |result                                     |
      |Tester                    |Harrow       |up to 5 miles  |30000     |500000    |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Developer                 |Manchester   |up to 10 miles |25000     |500000    |Per annum  | contract  |Permanent Developer jobs in Manchester|
      |Developer                 |Glasgow      |up to 10 miles |50000     |600000    |Per annum  | Permanent |Developer jobs in Glasgow|
      |Engineer                  |Leeds        |up to 15 miles |40000     |600000    |Per annum  | contract  |Contract Developer jobs in Leeds|
      |Doctor                    |Liverpool    |up to 15 miles |40000     |600000    |Per annum  | contract  |Permanent Doctor jobs in Liverpool|
      |Senior Primary Care Nurse |Liverpool    |up to 15 miles |36000     |450000    |Per annum  | contract  |Permanent Senior Primary Care Nurse jobs in Liverpool|
      |Senior Primary Care Nurse |Liverpool    |up to 15 miles |36000     |450000    |Per annum  | contract  |Permanent Accountant jobs in Glasgow|
