Feature: reordering assessment attempt

@adc
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "AssessmentTC51" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a06.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser

Scenario: candidate assessment attempt
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
  #And candidate answers vedio type question 
  
 And candidate clicks on start recording button to test auto and vedio
 And candidate clicks on stop recording button
 And candidate clicks on play vedio button to check audio and vedio
 And candidate clicks on stop vedio button 
 And candidate clicks on delete answer and re attempt button
 And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 And candidate chooses right option to mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And candidate answers "answer answer answer answer answer answer answer answer aaa bbb ccc ddd eee ffff " to the eassy type question
  And click on next button
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
 And candidate chooses option for rating type question
 And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And close the browser 
 
 
 
 
  
