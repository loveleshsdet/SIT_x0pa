Feature: deleted featureds

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
    |assessmentmeevo5|
  
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
    |otrxopa9005|
    
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

    
    #RETAKE RETAKE
    
    @actac
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "test1w11" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a16.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url 
   And close the browser
 
 
 @cre
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "Test1w11" 
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And search for the candidate "albert@a16.com"
  And click on candidate to view assessment details of candidate
  And click on accept button to allow candidate to retake assessment 
  And copy assessment url
   And close the browser
  
   @actac
    Scenario: fixed assessment attempt
  And candidate opens assessment link
  #Then verify assessment end time "14th Apr 2023 23:59hrs." being displayed to candidate or not 
  #Then verify candidate able to see banner uploaded while creating assessment
  When candidate enters assessment otp "XD1T0A6WYUI9"
  And candidate clicks on check box which means accepting xopa terms and conditions
  And click on start button to take assessment
  And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  And if candidate has not satisfied with the audio or vedio he can click on retake vedio button
  And candidate selects radio button yes if vedio is visible when clicked on play video button
  And candidate selects radio button yes if audio is audible when clicked on play video button
    And candidate clicks on next button to proceed with practice questions
   #EASSY
   And candidate answers "answer answer answer answer answer answer answer answer aaa bbb ccc ddd eee ffff " to the eassy type question
  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 #MCQ
 And candidate chooses right option to mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
  #VEDIO
  
 And candidate clicks on start recording button to test auto and vedio
 And candidate clicks on stop recording button
 #And candidate clicks on play vedio button to check audio and vedio
# And candidate clicks on stop vedio button 
 #And candidate clicks on delete answer and re attempt button
 # And candidate clicks on stop recording button
 And click on the next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
  

  #And candidate chooses right option to mcq type question
   # And click on next button
 #And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And candidate clicks next button to take actual assessment


  And candidate answers "answer answer answer answer answer answer answer answer" to the eassy type question
  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
 
  And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
 And candidate chooses right option to actual assessment mcq type question
 And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 Then verify retake assessment link is not visible to candidates or not
  And close the browser
    