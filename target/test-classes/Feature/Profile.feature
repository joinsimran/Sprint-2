Feature: I want to use this template to make changes into my profile

  Background: SignUp
    Given Admin is on the login page of Real Estate
    When admin will enter the UserId "mohankrishna176@gmail.com" and password "Secret@123&&"
    And admin will click on the login button
    And will be redirected to the the dashboard of the real estate page
    And will click on the Users
    And will click on the Your Profile
    Then admin will be redirected to the Your Profile page

  Scenario Outline: 
    When user will enter the value under Personal Options
    And user will click on Visual Editor
    And user will click on Syntax Highlighting
    And user will click on Admin Color Scheme
    And user will click on Keyboard Shortcuts
    And user will click on Toolbar
    When user enters the value under Name section
    And user will check if the Username is "admin"
    And user will write "<name>" in the First Name place
    And user will write "<lastname>" in the Last Name place
    And user will write "<nickname>" in the Nickname place
    And user will select from "<display>" in Display name publicly as
    When user enters the value under Contact Info
    And user will write "<email>" in Email
    And user will write "<website>" in Website
    And user will write "<phone_no>" in Phone
    And user will write "<twitter>" in Twitter
    And user will write "<facebook>" in Facebook URL
    And user will write "<linkedin>" in Linkedin
    When user enters the value under About Yourself
    And user will write "<bio>" in Biographical Info
    And user will click on Gravatar on Profile Picture field
    And user will write "<pwd>" in New Password
    And user will click on Log Out Everywhere Else
    When user will enter the value under Realteo Avatar
    And user will write "<avatar>" in Agent Avatar
    When user will check for Extra profile information
    And user will write "<title>" in Title
    When user will check for Customer billing address
    And user will write "<first_name>" in First Name field
    And user will write "<last_name>" in Last Name field
    And user will write "<company>" in Company field
    And user will write "<add_line1>" in Address line1
    And user will write "<add_line2>" in Address line2
    And user will write "<city>" in City field
    And user will write "<pincode>" in Postcode / ZIP
    And user will select "<country>" from Country
    And user will select "<state>" from State / County
    And user will write "<phone>" in Phone field
    And user will write "<email_id>" in Email address
    And user will click Copy
    Then will click on Update Profile

    Examples: 
      | name   | lastname | nickname | display      | email              | website            | phone_no   | twitter                      | facebook                           | linkedin                             | bio    | pwd          | avatar | title | first_name | last_name | company | add_line1   | add_line2    | city   | pincode | country | state | phone      | email_id           |
      | simran | gupta    | simmy    | simran gupta | simran78@gmail.com | www.indianfood.com | 9876543210 | https://twitter.com/simran78 | https://www.facebook.com/simran78/ | https://www.linkedin.com/in/simran78 | Tester | Secret@123&& | minion | Miss  | Anuradha   | Gupta     | Wipro   | Church Road | Civil Lines  | Gaya   |  823001 | India   | Bihar | 8791234560 | anuradha@gmail.com |
      | rachit | durgesh  | rac      | rachit       | rachit78@gmail.com | www.indianfood.com | 9876543210 | https://twitter.com/rachit78 | https://www.facebook.com/rachit78/ | https://www.linkedin.com/in/rachit78 | Tester | Secret@123&& | groot  | Mr    | Rajesh     | Sah       | TCS     | Main Road   | Police Lines | Purnia |  823551 | India   | Delhi | 8791234560 | rajesh@gmail.com   |
      | @#$%^& | $%^&*    | $%^&&*&  | $%^&*        | simran78@gmail.com | www.indianfood.com | $%^&*(((@  | https://twitter.com/simran78 | https://www.facebook.com/simran78/ | https://www.linkedin.com/in/simran78 | Tester | Secret@123&& | minion | Miss  | Anuradha   | Gupta     | Wipro   | Church Road | Civil Lines  | Gaya   |  823001 | India   | Bihar | 8791234560 | anuradha@gmail.com |
      | 147137 |    28638 | simmy    |        28638 | simran78@gmail.com | www.indianfood.com | sfdasajadg | https://twitter.com/simran78 | https://www.facebook.com/simran78/ | https://www.linkedin.com/in/simran78 | Tester | Secret@123&& | minion | Miss  | Anuradha   | Gupta     | Wipro   | Church Road | Civil Lines  | Gaya   |  823001 | India   | Delhi | 8791234560 | anuradha@gmail.com |
