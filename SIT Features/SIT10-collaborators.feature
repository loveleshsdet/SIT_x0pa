   Feature: Admin collaborators , Reviewer Collaborators
   
   @admin_collab
   Scenario: verify add admin collaborators to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And navigate to collaborators tab
  And click on add collaborator button
  And select user "Sai Charan (saicharan@trainingqa.com)"
  And select users role "Administrator"
  And click on the submit button
  
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "Arun"
  And enter last name of the candidate "A"
  And enter email address of the candidate "arun@a01.com"
  And click on the submit button
  
  #And navigate to admin collaborators candidates page
  
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
   When accept xopaterms
  And choose login type
  And enters valid credentials "saicharan@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  #And search for assessment "CPYEQ1" 
  And click on assessment to navigate to assessment setup page
  
  #And navigate to assessment setup
   And click on add custom question button
  And enter the question "who will do manual testing ?"
  And click on next button
  And choose question type multiple choice
  And give options to the question option a "humans" option b "robots" option c "Manual Testers" option d "computers" 
  And pick right options from the given options "humans" or "Manual Testers"
  And pick red flag options from the given options "computers" or "robots"
  And click on checkbox which takes answer as correct if candidate chooses any of the right option
  And click on checkbox which allows candidates to choose only one option
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
  #And enable save as draft mode to avoid preparation time and max time to answer question
  And give score "5" to the question
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And click on submit button to add question
  And navigate to candidates tab
  And search for the candidate "arun@a01.com"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
    And click on shorlist button to shortlist the candidate
    And verify candidate decision text "Shortlisted" or not
     And close the browser

  
  
     @reviewer_collab
   Scenario: verify add reviewer collaborators to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And navigate to collaborators tab
  And click on add collaborator button
  And select user "Sai Kishore Nagunoori (saikishore@trainingqa.com)"
  And select users role "Reviewer"
  And click on the submit button
   And navigate to candidates tab
   And navigate to reviewer collaborators candidates page
   When accept xopaterms
  And choose login type
  And enters valid credentials "saikishore@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify add candidate and send invite buttons are not showing or not
   And close the browser