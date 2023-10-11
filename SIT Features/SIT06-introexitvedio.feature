Feature: introduction and exit vedio feature

  @addcand @adset
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "DPQ9" 
  And click on assessment to navigate to assessment setup page
   When navigate to advanced settings tab
   And add introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
  #And click on checkbox below to play introduction vedio automatically once otp entered correctly
    And click on save button
    
     And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albertiev@2.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
  
   @actac
    Scenario: Candidate takes assessment with intro and exit vedio
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
 # And candidate clicks on next button to proceed with practice questions
  #And candidate answers vedio type question 
   And click on next button
   And verify vedio source contains "videox0pa.mp4"
    And click on next button
  And candidate chooses right option to actual assessment mcq type question
  And click on next button
  And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  
  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
And candidate answers "answer answer answer answer answer answer answer answer" to the eassy type question

  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And close the browser
 
 
 
   @playintovedio
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "DPQ9" 
  And click on assessment to navigate to assessment setup page
   When navigate to advanced settings tab
   And enter the assessment end text "Congratulations ! You've successfully completed the assessment , results will be announced soon . "
   And add introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
  And click on checkbox below to play introduction vedio automatically once otp entered correctly
  And upload the exit vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which  will be shown to the candidate after completion of the assessment
    And click on save button
    
     And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albertiev@b7.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
  
   @playintovedio
    Scenario: verify introduction vedio displayed immediately after otp entered
  And candidate opens assessment link
  #Then verify assessment end time "14th Apr 2023 23:59hrs." being displayed to candidate or not 
  #Then verify candidate able to see banner uploaded while creating assessment
  When candidate enters assessment otp "XD1T0A6WYUI9"
  And candidate clicks on check box which means accepting xopa terms and conditions
  And click on start button to take assessment
   And verify vedio source contains "videox0pa.mp4"
     And click on next button
  And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  And if candidate has not satisfied with the audio or vedio he can click on retake vedio button
  And candidate selects radio button yes if vedio is visible when clicked on play video button
  And candidate selects radio button yes if audio is audible when clicked on play video button
 # And candidate clicks on next button to proceed with practice questions
  #And candidate answers vedio type question 
 
   
    And click on next button
     And candidate clicks next button to take actual assessment
     # And candidate clicks next button to take actual assessment
      And click on Next button
  And candidate chooses right option to actual assessment mcq type question
  And click on next button
  And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  
  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 
And candidate answers "answer answer answer answer answer answer answer answer" to the eassy type question

  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And verify vedio source contains "videox0pa.mp4"
 And verify assessment end text "Congratulations ! You've successfully completed the assessment , results will be announced soon . " being displayed or not
  And close the browser
    
