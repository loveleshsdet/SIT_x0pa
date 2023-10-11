 Feature: non reordering practice questions
 
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
  And enter assessment name "test1w12"
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
  And enable masked hiring
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
  And close the browser
  
   @advanced_set
   Scenario: verify advanced settings practice questions (without re ordering)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And search for assessment "test1w12" 
  And click on assessment to navigate to assessment setup page
  And navigate to advanced settings tab
  And expand essay type practice question
  And enter instructions to candidates regarding essay type question "Bad punctuation, sentence structure, and poor grammar might lower an otherwise good grade on an essay question."
  And enter question "what is software ?"
  And select preparation time to answer the question "1" minute "30" seconds
  And select maximum time to answer question "1" minute "30" seconds
  And choose minimum words "10" and maximum words "15" required to answer the question
 # And attach vedio "UploadFiles//videox0pa.mp4" which will be displayed to the candidate along with the question
  #And attach document "UploadFiles//videodoc.docx" which will be displayed to the candidate along with the question
  And collapse essay type practice question
  And select multiple choice question which will be displayed as practice question to candidates
  
 #  And drag this mcq practice question to the place of first practice question
 #Then verify the practice question "MULTIPLE CHOICE QUESTION (MCQ)" being reordered or not
  
  And expand mcq type practice question
  And enter instructions to candidates to answer mcq type question "choose the correct answer"
  And enter the mcq question "what is Java ?"
  And select preparation time to answer the question "1" minute "30" seconds
  And select maximum time to answer question "1" minute "30" seconds
  And create options "German Language" "Basic Language" "pragramming Language" and  "all of the above"
  #And attach vedio "UploadFiles//videox0pa.mp4" which will be displayed to the candidate along with the mcq question
  #And attach document "UploadFiles//videodoc.docx" which will be displayed to the candidate along with mcq the question
  And collapse mcq type practice question
  And select vedio type question which will be displayed as practice question to candidates
  
  #When drag this vedio type practice question to the place of first practice question
  #Then verify the practice question "VIDEO" being reordered or not
  
  And expand vedio type practice question
  And enter the instructions to candidates regarding vedio type question "video should be clear.please reatake vedio if it's not clear.Vedio answer will be rejected automatically if fake person attempts answers"
  And enter the vedio question "introduce yourself."
  And select preparation time to answer the question "1" minute "30" seconds
  And select maximum time to answer question "1" minute "30" seconds
  And choose number of retakes can candidate take "2"
  And choose retake decision time "1" minute "30" seconds
  #And attach vedio "UploadFiles//videox0pa.mp4" which will be displayed to the candidate along with the vedio question
  #And attach document "UploadFiles//videodoc.docx" which will be displayed to the candidate along with the vedio question
  And collapse vedio type practice question
   # Then verify the practice question "VIDEO" being reordered or not 
 
  And disable save as draft by enabling toggle
  And enter assessment end text "Congratulations ! You've successfully completed the assessment , results will be announced soon . "
  And upload introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
  And click on checkbox below to play introduction vedio automatically once otp entered correctly
  And upload exit vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which  will be shown to the candidate after completion of the assessment
  And click on save button
    And close the browser
    
    
    @setup
    Scenario: add questions from question bank to the assessment
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
     And search for assessment "test1w12" 
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
  #And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
  When click on add from question bank button
  And filter question bank by mcq type questions
  Then verify all questions filtered are of type "Multiple Choice Question (MCQ)" or not
  When select a question from filtered questions and click on add button
  #And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
  #When navigate to advanced settings tab
 # And disable practice questions setup
   # And click on save button
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
 And search for assessment "test1w12" 
 And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "albert"
  And enter last name of the candidate "A"
  And enter email address of the candidate "albert@a15.com"
  And click on the submit button
  #And search for the candidate "karun"
    And click on send invite button to send assessment link to the candidate
  And click on candidate and copy assessment url
   And close the browser
     
    @actac
    Scenario: candidate takes assessment (without re ordering practice questions)
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
 And candidate clicks on retake assessment link
 And enters reason for requesting retake "not prepared well"
# And click on the submit button
 And close the browser
  
 
