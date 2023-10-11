Feature: pass threshold feature
  
  @cre @actac
  Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "Assessmentpass21"
  And enter information to test takers "welcome to the Assessment !"
  And keep interview type fixed
  And enable remainders
  And choose remainder interval "4" days and choose maximum remainders "2" times
  And enable toggle which allows candidates to cut copy paste for essay type questions
  And enable toggle which allows candidates to retake the assessment
  
  And choose assessment start date and time "03/15/2023, 11:00 AM"
  And enable toggle which allows candidates to see responses after submission of assessment
  And choose assessment end date "05/03/2023"
  And enable company branding
  And enable masked hiring
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
  And close the browser
  
   @setup @actac
  Scenario: verify assessment setup functionality (add custom questions)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
   And search for assessment "Assessmentpass21" 
  And click on assessment to navigate to assessment setup page
  And click on edit button to edit assessment start date
  And choose date "14/03/2023, 7:00 PM"
  #And edit assessment start date "27/03/2023, 7:00 PM" by clicking on edit button
  And click on the submit button
    And click on edit button to edit assessment end date
  And choose date "14/04/2023, 07:00 PM"
  #And edit assessment end date "14/04/2023, 07:00 PM" by clicking on edit button
  And click on the submit button
  And click on add custom question button
  And enter the question "who will do manual testing ?"
  And click on next button
  And choose question type multiple choice
  And give options to the question option a "humans" option b "Manual Testers" option c "computers" option d "robots" 
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
  And click on the submit button
  
    And click on add custom question button
  And enter the question "select related option to manual testing ?"
  And click on next button
  And choose question type multiple choice
  And give options to the question option a "humans" option b "Manual Testers" option c "computers" option d "robots" 
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
  And click on the submit button
  
    And click on add custom question button
  And enter the question "manual testing performed by ?"
  And click on next button
  And choose question type multiple choice
  And give options to the question option a "humans" option b "Manual Testers" option c "computers" option d "robots" 
  And pick right options from the given options "humans" or "Manual Testers"
  And pick red flag options from the given options "computers" or "robots"
  And click on checkbox which takes answer as correct if candidate chooses any of the right option
  And click on checkbox which allows candidates to choose only one option
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
 # And enable save as draft mode to avoid preparation time and max time to answer question
  And give score "5" to the question
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And click on the submit button
  
    And click on add custom question button
  And enter the question "who are manual testers ?"
  And click on next button
  And choose question type multiple choice
  And give options to the question option a "humans" option b "Manual Testers" option c "computers" option d "robots" 
  And pick right options from the given options "humans" or "Manual Testers"
  And pick red flag options from the given options "computers" or "robots"
  And click on checkbox which takes answer as correct if candidate chooses any of the right option
  And click on checkbox which allows candidates to choose only one option
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
 # And enable save as draft mode to avoid preparation time and max time to answer question
  And give score "5" to the question
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And click on the submit button
  And set up pass threshold value "15"
  And click on yes button to update passthreshold
  #
  When navigate to advanced settings tab
  And disable practice questions setup
  And click on save button
 # 
  
  
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
 And search for assessment "Assessmentpass21" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a27.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
   
     
    @actac
    Scenario: candidate takes assessment and meets pass threshold
  And candidate opens assessment link
  #Then verify assessment end time "14th Apr 2023 23:59hrs." being displayed to candidate or not 
  #Then verify candidate able to see banner uploaded while creating assessment
  When candidate enters assessment otp "XD1T0A6WYUI9"
  And candidate clicks on check box which means accepting xopa terms and conditions
  And click on start button to take assessment
   And click on next button
 #MCQ
 Then verify xopa logo "public/Screenshot" displayed at top left corner or not
 And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And candidate chooses wrong option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  
    And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 # And close the browser
  
  
  @actac
  Scenario: review candidates results(list view-mini view)
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify assessment status "Completed" or not
  And verify assessment result of the candidate "Pass" or not
  When scroll down to review candidates response
  Then verify candidates response is correct or not
  And verify candidates score is "5 out of 5"
  When click on next button to review candidates response to next question
  Then verify candidates response is correct or not
  And verify candidates score is "5 out of 5"
   When click on next button to review candidates response to next question
    Then verify candidates response is incorrect or not
   
  And verify candidates score for incorrect answer "0 out of 5"
  When click on next button to review candidates response to next question
    Then verify candidates response is correct or not
 # And verify candidates score is "5 out of 5"
     And verify candidates score is "5 out of 5"
    And click on shorlist button to shortlist the candidate
    And verify candidate decision text "Shortlisted" or not
    When select candidate responses in list view "List View"
    
     And reviwer reviews first question answered by candidate is correct or not
    Then verify score generated correctly to the first answer "5 out of 5" or not 
     And reviwer reviews sencond question answered by candidate is correct or not
    Then verify score generated correctly to the second answer "5 out of 5" or not 
     And reviwer reviews third question answered by candidate is wrong or not
    Then verify score generated correctly to the third answer "0 out of 5" or not 
     And reviwer reviews fourth question answered by the candidate is correct or not
    Then verify score generated correctly to the fourth answer "5 out of 5" or not
     And close the browser
    
    
 @rej
Scenario: add new candidate to assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "Assessmentpass21" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albertrej@a08.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
   
     
    @rej
    Scenario:  candidate takes assessment and doesn't meets pass threshold
  And candidate opens assessment link
  #Then verify assessment end time "14th Apr 2023 23:59hrs." being displayed to candidate or not 
  #Then verify candidate able to see banner uploaded while creating assessment
  When candidate enters assessment otp "XD1T0A6WYUI9"
  And candidate clicks on check box which means accepting xopa terms and conditions
  And click on start button to take assessment
   And click on next button
 #MCQ
 And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
  And candidate chooses wrong option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
   And candidate chooses wrong option to actual assessment mcq type question
    #And candidate chooses right option to actual assessment mcq type question
    And click on next button
 And candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question
 # And close the browser
  
  
  @rej
  Scenario: review candidates responses
  Given after candidate completed the assessment recruiter navigates back to candidates details page 
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  Then verify assessment status "Completed" or not
  And verify assessment result of the candidate "Fail" or not
  When scroll down to review candidates response
  Then verify candidates response is correct or not
  And verify candidates score is "5 out of 5"
  When click on next button to review candidates response to next question
  Then verify candidates response is correct or not
  And verify candidates score is "5 out of 5"
   When click on next button to review candidates response to next question
    Then verify candidates response is incorrect or not
   And verify candidates score for incorrect answer "0 out of 5"
  When click on next button to review candidates response to next question
    Then verify candidates response is incorrect or not
 # And verify candidates score is "5 out of 5"
    And verify candidates score for incorrect answer "0 out of 5"
    And click on reject button to reject the candidate
    And verify candidate decision text "Rejected" or not
     And close the browser
     
    @genlink
    Scenario: reviewers reviews candidate responses using shared url
    Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
 And search for assessment "Assessmentpass21" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
   And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albertsharerej@a08.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
    Then click on generate link button and copy url to share link with reviewers
    And reviewer clicks on generated link
    And verify logo source contains "public/Screenshot" or not
    And enter shared password "XPAStag0"
    And reviwer reviews first question answered by candidate is correct or not
    Then verify score generated correctly to the first answer "5 out of 5" or not 
     And reviwer reviews sencond question answered by candidate is correct or not
    Then verify score generated correctly to the second answer "5 out of 5" or not 
     And reviwer reviews third question answered by candidate is wrong or not
    Then verify score generated correctly to the third answer "0 out of 5" or not 
     And reviwer reviews fourth question answered by candidate is correct or not
    Then verify score generated correctly to the fourth answer "0 out of 5" or not
     And close the browser
    
      
  @Decision
   Scenario: verify filter candidates by status
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albertnd@a08.com"
  And click on the submit button
  When filter shortlisted candidates by clicking on checkbox beside shortlisted
  Then verify shortlisted candidates "Shortlisted" are filtered or not
  When uncheck shortlisted filter checkbox
  When filter rejected candidates by clicking on checkbox beside rejected
  Then verify shortlisted candidates "Rejected" are filtered or not
  When uncheck rejected filter checkbox
  When filter non shortlisted or non rejected candidates by clicking on no decision checkbox
  Then verify all filtered candidates are not shortlisted "Shortlisted" or not rejected "Rejected"
  When uncheck no decision filter checkbox
   And close the browser   
    
    
    
    
    
  
  
