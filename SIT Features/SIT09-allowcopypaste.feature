Feature: allow copy paste while answering essay type questions

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
  And enter assessment name "CPYEQ6"
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
 And search for assessment "CPYEQ6" 
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
  When navigate to advanced settings tab
  And disable practice questions setup
    And click on save button
     And close the browser
    
    @actac1
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "CPYEQ6" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a014.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
    
    @actac1
    Scenario: verify allow copy paste functionality
  And candidate opens assessment link
  #Then verify assessment end time "14th Apr 2023 23:59hrs." being displayed to candidate or not 
  #Then verify candidate able to see banner uploaded while creating assessment
  When candidate enters assessment otp "XD1T0A6WYUI9"
  And candidate clicks on check box which means accepting xopa terms and conditions
  And click on start button to take assessment
  And click on next button 
 # And candidate answers "answer answer answer answer answer answer answer answer aaa bbb ccc ddd eee ffff " to the eassy type question
  And copy some text and paste in answer field 
  And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And verify candidate response contains "The answer will be auto submitted once the time to answer this question ends." or not
   And close the browser
  
  