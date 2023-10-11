Feature: Rating Criteria feature
  
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on rating criteria tab
  And click on add criteria
  And enter rating criteria name "Behaviour01"
  And click on the submit button
  And search for rating criteria "Behaviour01"
  Then verify created rating criteria "Behaviour" being fetched from list of rating criterias
  When click on edit button to rename rating criteria
  And enter rating criteria name "Behaviour02"
   And click on the submit button
   And search for rating criteria "Behaviour02"
  Then verify created rating criteria "Behaviour02" being fetched from list of rating criterias
  When click on delete button of rating criteria
   And search for rating criteria "Behaviour02"
    And close the browser
  
  
  
  
  