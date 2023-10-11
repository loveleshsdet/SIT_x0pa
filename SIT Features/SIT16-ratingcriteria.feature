Feature: rating critera

  @rt
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
  And enter rating criteria name "RateCr002"
  And click on the submit button
  And search for rating criteria "RateCr002"
  Then verify created rating criteria "RateCr002" being fetched from list of rating criterias
  When click on edit button to rename rating criteria
  And enter rating criteria name "RateCrt02"
   And click on the submit button
   And search for rating criteria "RateCrt02"
  Then verify created rating criteria "RateCrt02" being fetched from list of rating criterias
 # When click on delete button of rating criteria
   #And search for rating criteria "RateCrt01"
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
  And click on create new assessment button
  And enter assessment name "RCA0015"
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
  And click on assessment to navigate to assessment setup page
  And navigate to collaborators tab
  And click on add collaborator button
  And select user "Sai Charan (saicharan@trainingqa.com)"
  And select users role "Administrator"
  And click on the submit button
  And click on add collaborator button
  And select user "Sai Kishore Nagunoori (saikishore@trainingqa.com)"
  And select users role "Reviewer"
  And click on the submit button
  And click on the submit button
  And close the browser
  
  @cret
  Scenario: verify assessment setup functionality (add custom questions)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on edit button to edit assessment start date
  And choose date "17/03/2023, 7:00 PM"
  #And edit assessment start date "27/03/2023, 7:00 PM" by clicking on edit button
  And click on the submit button
    And click on edit button to edit assessment end date
  And choose date "14/04/2023, 07:00 PM"
  #And edit assessment end date "14/04/2023, 07:00 PM" by clicking on edit button
  And click on the submit button
  And click on add custom question button
  And enter the question "What is JVM?"
  And click on next button
  And choose question type as essay
  And enter minimum words required to answer this question "5"
  And enter maximum words required to answer this question "15"
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
  #And enable save as draft mode to avoid preparation time and max time to answer question
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And create or add existing rating criteria "ratecrt01" and "crperformance01" to this question
  And click on the submit button
  
  And click on add custom question button
  And enter the question "What is the Difference between JDK and JRE?"
  And click on next button
  And choose question type as vedio
  And click on checkbox which will allows candidates to retake vedio
  And enter number of times candidate can retake vedio "2"
  And click on checkbox to decide how much time candidates can take between retakes
  And select retake decision time "1" minute and "30" seconds
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And add existing rating criteria "ratecrt01" to this question
  And click on the submit button
   And close the browser
  
  @av
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "RCA0015" 
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
  
  @av
  Scenario: fixed assessment attempt
  And candidate opens assessment link
  Then verify candidate able to see the message "welcome to the Assessment !" or not
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
  And candidate answers "answer answer answer answer answer answer answer answer aaa bbb ccc ddd eee ffff " to the eassy type question
  And click on next button
  And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And click on next button
    And candidate answers "answer answer answer answer answer answer answer answer aaa bbb ccc ddd eee ffff " to the eassy type question
  And click on next button
    And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And candidate clicks on start recording button to test auto and vedio
  And candidate clicks on stop recording button
  And candidate clicks on play vedio button to check audio and vedio
  And candidate clicks on stop vedio button 
  
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  #And close the browser
 
  @av
  Scenario: verify reviewer able to rate candidate based on his responses
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify assessment status "Completed" or not

  When scroll down to review candidates response
  And provide rating and feedback "good" to candidates response
  And provide another rating and feedback "good" to candidates response
  And click on Submit button
  When click on next button to review candidates response to next question
  And provide rating and feedback "good" to candidates response
  And click on Submit button
  And click on shorlist button to shortlist the candidate
    And verify candidate decision text "Shortlisted" or not
     And close the browser
    
    
      @av
  Scenario: verify Admin collaborator reviewer able to rate candidate based on his responses
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "saicharan@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify assessment status "Completed" or not

  When scroll down to review candidates response
  And provide rating and feedback "good" to candidates response
  And provide another rating and feedback "good" to candidates response
  And click on Submit button
  When click on next button to review candidates response to next question
  And provide rating and feedback "good" to candidates response
  And click on Submit button
 # And click on shorlist button to shortlist the candidate
   # And verify candidate decision text "Shortlisted" or not
    And close the browser
    
      @av
  Scenario: verify reviewer collaborator able to rate candidate based on his responses
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "saikishore@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify assessment status "Completed" or not

  When scroll down to review candidates response
  And provide rating and feedback "good" to candidates response
  And provide another rating and feedback "good" to candidates response
  And click on Submit button
  When click on next button to review candidates response to next question
  And provide rating and feedback "good" to candidates response
  And click on Submit button
   And close the browser
  
   @av
  Scenario: verify disabling and enabling rating criteria
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  Then verify overall score being displayed or not "2.75"
  When click on edit symbol of the assessment
  And enable rating criteria which will enable rating criteria section while creating assessment questions
  #And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
  And search for assessment "RCA0015" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  Then verify overall rating disabled or not
   And close the browser
  
  
  
  