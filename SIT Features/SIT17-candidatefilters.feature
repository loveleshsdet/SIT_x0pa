Feature: candidate filters

  @status
   Scenario: verify filter candidates by status
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "Assessmentstatus01" 
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  When filter candidates by draft status
  Then verify candidates having draft status "Draft" are being filtered or not
  When uncheck filter candidates by draft status
  When filter candidates by awaiting response status
  Then verify candidates under awaiting status "Awaiting Response" are being filtered or not
    When uncheck filter candidates by awaiting response status
  When filter candidates by in progress status
  Then verify candidates are in progress status "In Progress" are being filtered or not
   When uncheck filter candidates by in progress status
  When filter candidates by completed status
  Then verify candidates having completed status "Completed" are being filtered or not
    When uncheck filter candidates by completed status
     And close the browser
    
      
  @result
  Scenario: verify filter candidates by status
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "Assessmentstatus01"
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  When filter candidates who passed the assessment
  Then verify result of filtered candidates is "Pass" or displaying "There are no candidates added to this assessment."
  When click on clear filters button
  When filter candidates who failed the assessment
  Then verify result of filtered candidates is "Fail" or displaying "There are no candidates added to this assessment."
  When click on clear filters button
  When filter candidates who have no result
  Then verify result of filtered candidates is "No Result" or displaying "There are no candidates added to this assessment."
  When click on clear filters button
  And close the browser