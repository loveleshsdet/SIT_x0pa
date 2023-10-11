Feature: assessment without practice questions feature

  @addcand
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "DPQ9"
  And enter information to test takers "welcome to the Assessment !"
  And keep interview type fixed
  And enable remainders
  And choose remainder interval "4" days and choose maximum remainders "2" times
  And enable toggle which allows candidates to cut copy paste for essay type questions
  And enable toggle which allows candidates to retake the assessment
 
  And choose assessment start date and time "03/08/2023, 11:00 AM"
    And enable toggle which allows candidates to see responses after submission of assessment
  And choose assessment end date "05/03/2023"
  And enable company branding
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And disable rating criteria
  And click on submit button
 And search for assessment "DPQ9" 
  And click on assessment to navigate to assessment setup page
  And click on add from question bank button
  And filter question bank by eassy type questions
  Then verify all questions filtered are of type "Essay" or not
  When select a question from filtered questions and click on add button
  Then verify question added to assessment or not 
  When click on edit button of essay type question

  And enter the question "what is manual testing ?"
  And click on next button
  And enter minimum words required to answer this question "5"
  And enter maximum words required to answer this question "15"
  And click on next button
  And click on next button
  And click on the submit button 
  When click on add from question bank button
  And filter question bank by video type questions
  Then verify all questions filtered are of type "Video" or not
  When select a question from filtered questions and click on add button
  And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
  When click on add from question bank button
  And filter question bank by mcq type questions
  Then verify all questions filtered are of type "Multiple Choice Question (MCQ)" or not
  When select a question from filtered questions and click on add button
  And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
  When navigate to advanced settings tab
  And disable practice questions setup
  # And upload introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
 # And click on checkbox below to play introduction vedio automatically once otp entered correctly
    And click on save button
    And close the browser 
    
    @actac
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "DPQ9" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a0a4.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
    
    @actac
    Scenario: Candidate takes assessment without practice questions
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
   #And click on next button
    And candidate click on the next button
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
    
    
    
  
  
  
  