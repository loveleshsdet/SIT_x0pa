Feature: Assessment future start date end date

 Scenario: verify assessment start date and end date visibility to the candidate
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "retakespq9" 
  And click on assessment to navigate to assessment setup page

  #And edit assessment start date "27/03/2023, 7:00 PM" by clicking on edit button
 
    And click on edit button to edit assessment end date
  And choose date "14/05/2023, 07:00 PM"
  #And edit assessment end date "14/04/2023, 07:00 PM" by clicking on edit button
  And click on the submit button
    And click on edit button to edit assessment start date
  And choose date "27/04/2023, 7:00 PM"
   And click on the submit button
  And navigate to candidates tab
   And click on add candidate button to enter candidates information
  And enter first name of the candidate "wilbert"
  And enter last name of the candidate "w"
  And enter email address of the candidate "wilbert@w06.com"
  And click on the submit button
  And search for the candidate "wilbert@w06.com"
   And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
  
  
  

  
   @actac3
    Scenario: fixed assessment attempt
  And candidate opens assessment link
  Then verify assessment end time "14th May 2023 23:59hrs." being displayed to candidate or not 
  Then verify assessment start time "27th Apr 2023 19:00hrs" being displayed to candidate or not
  #Then verify candidate able to see banner uploaded while creating assessment
  #When candidate enters assessment otp "XD1T0A6WYUI9"
  #And candidate clicks on check box which means accepting xopa terms and conditions
   And close the browser