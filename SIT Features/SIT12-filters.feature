Feature: filter assessments by me others and favourite


  @me_others
  Scenario: verify assessment created by others being displayed in assessments list when filtered by "Assessments by everyone"
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "saikishore@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "<assessmentname>"
  And enter information to test takers "welcome to the Assessment !"
  And keep interview type fixed
  And enable remainders
  And choose remainder interval "4" days and choose maximum remainders "2" times
  And enable toggle which allows candidates to cut copy paste for essay type questions
  And enable toggle which allows candidates to retake the assessment
  And choose assessment start date and time "03/28/2023, 11:00 AM"
  And enable toggle which allows candidates to see responses after submission of assessment
  And choose assessment end date "05/03/2023"
  And enable company branding
  And enable masked hiring
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
   And filter assessments by "Assessments - by me"
  And verify assessment created by user "<assessmentname>" is displayed or not
   And close the browser
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And filter assessments by "Assessments - Everyone"
  And verify assessment created by other user "<assessmentname>" is displayed or not
    And close the browser
    
    Examples: 
    |assessmentname|
    |assessmentmeevo9|

  @favourite
  Scenario: verify assessment created by others being displayed in assessments list when filtered by "Assessments by everyone"
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "saikishore@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "<assessmentname>"
  And enter information to test takers "welcome to the Assessment !"
  And keep interview type fixed
  And enable remainders
  And choose remainder interval "4" days and choose maximum remainders "2" times
  And enable toggle which allows candidates to cut copy paste for essay type questions
  And enable toggle which allows candidates to retake the assessment
  And choose assessment start date and time "03/28/2023, 11:00 AM"
  And enable toggle which allows candidates to see responses after submission of assessment
  And choose assessment end date "05/03/2023"
  And enable company branding
  And enable masked hiring
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
  And make assessment as favourite by clicking on heart symbol
  And filter assessments by "Assessments - Favorite"
  And verify assessment created by other user "<assessmentname>" is displayed or not
    And close the browser
    
    Examples:
    |assessmentname|
    |otrxopa9009|
    
    
      @catg
  Scenario: verify filter question bank by category
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on add from question bank button
  And filter question bank by question cateogory
  Then verify questions are filtered by question cateogory or not 
    And close the browser
    
    
      @catgglobal
  Scenario: verify filter global question bank by category
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on add from question bank button
  And navigate to global question bank
  And filter question bank by question cateogory
  Then verify questions are filtered by question cateogory or not
    And close the browser 
    
     @closed
  Scenario: verify assessment setup functionality (add custom questions)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on close assessment button
  And navigate back to xopa room
  And navigate to closed assessments
    #And filter assessments by "Assessments - Everyone"
  And search for the assessment
  Then verify the assessment closed being displayed in closed assessments list
  When click on assessment to navigate to assessment setup page
  And click on reopen assessment button
  And navigate back to xopa room
  #And navigate to open assessments
    #And filter assessments by "Assessments - Everyone"
  And search for the assessment
  Then verify the assessment reopened being displayed in open assessments list
    And close the browser
  
  
  @clone
   Scenario: verify clone assessment functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on clone assessment button
  And navigate back to xopa room
 # And navigate to closed assessments
   # And filter assessments by "Assessments - Everyone"
  #And search for the assessment
  Then verify the assessment being cloned "Cloned" or not
    And close the browser
