Feature: assessment creation , reordering questions 

  @addcand
  Scenario: verify assessment creation and questions setup functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "AssessmentTC51"
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
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And disable rating criteria
  And click on submit button
 And search for assessment "AssessmentTC51" 
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
  
   And drag this mcq practice question to the place of first practice question
 Then verify the practice question "MULTIPLE CHOICE QUESTION (MCQ)" being reordered or not
  
  And expand essay type practice question
  And enter instructions to candidates regarding mcq type question "choose the correct answer"
  And enter mcq question "what is Java ?"
  And select preparation time to answer the question "1" minute "30" seconds
  And select maximum time to answer question "1" minute "30" seconds
  And create options "German Language" "Basic Language" "pragramming Language" and  "all of the above"
  #And attach vedio "UploadFiles//videox0pa.mp4" which will be displayed to the candidate along with the mcq question
  #And attach document "UploadFiles//videodoc.docx" which will be displayed to the candidate along with mcq the question
  And collapse essay type practice question
  And select vedio type question which will be displayed as practice question to candidates
  
  When drag this vedio type practice question to the place of first practice question
  Then verify the practice question "VIDEO" being reordered or not
  
  And expand essay type practice question
  And enter instructions to candidates regarding vedio type question "video should be clear.please reatake vedio if it's not clear.Vedio answer will be rejected automatically if fake person attempts answers"
  And enter vedio question "introduce yourself."
  And select preparation time to answer the question "1" minute "30" seconds
  And select maximum time to answer question "1" minute "30" seconds
  And choose number of retakes can candidate take "2"
  And choose retake decision time "1" minute "30" seconds
  #And attach vedio "UploadFiles//videox0pa.mp4" which will be displayed to the candidate along with the vedio question
  #And attach document "UploadFiles//videodoc.docx" which will be displayed to the candidate along with the vedio question
  And collapse essay type practice question
   # Then verify the practice question "VIDEO" being reordered or not 
  When disable showing number of retakes left to the candidate
  When disable toggle to restrict candidates to navigate to previous questions 
  And disable save as draft by enabling toggle
  When disable assessment summary table 
  And enter assessment end text "Congratulations ! You've successfully completed the assessment , results will be announced soon . "
  #And upload introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
  #And click on checkbox below to play introduction vedio automatically once otp entered correctly
  #And upload exit vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which  will be shown to the candidate after completion of the assessment
  And click on save button
  
  When navigate to assessment setup page
  And click on edit button to edit assessment start date
  And choose date "07/03/2023, 7:00 PM"
  #And edit assessment start date "14/03/2023, 7:00 PM" by clicking on edit button
  And click on the submit button
    And click on edit button to edit assessment end date
  And choose date "14/04/2023, 07:00 PM"
  #And edit assessment end date "14/04/2023, 07:00 PM" by clicking on edit button
  And click on the submit button
  And click on add custom question button
  And enter the question "what is manual testing ?"
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
  And click on the submit button
  #And filter questions by eassy type
  #Then verify added question "what is manual testing ?" filtered or not
  #And verify cateogory of question added is "hr" or not
  #And verify mode of answer is eassy type "Eassy" or not
  And click on add custom question button
  And enter the question "what is Automation testing ?"
  And click on next button
  And choose question type as vedio
  And click on checkbox which will allows candidates to retake vedio
  And enter number of times candidate can retake vedio "3"
  And click on checkbox to decide how much time candidates can take between retakes
  And select retake decision time "1" minute and "30" seconds
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And click on the submit button
  
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
  And click on the submit button
  
  And click on add custom question button
  And enter the question "selenium"
  And click on next button
  And choose question type rating
  And rating option a "Excellent" and score for the option "25"
  And click on add message to add next option and score
  And rating option b "Very Good" and score for the option "20"
   And click on add message to add next option and score
  And rating option c "Good" and score for the option "15"
   And click on add message to add next option and score
  And rating option d "Average" and score for the option "10"
  And click on next button
  And select preparation time required to question "1" min and "30" seconds
  And choose maximum time to answer the question "1" min and "10" seconds
  #And enable save as draft mode to avoid preparation time and max time to answer question
  And click on next button
  And Create or choose a category "HR" this question belongs to
  And click on the submit button
   And close the browser
  
  
  
 # And navigate to candidates tab
 # And click on add candidate button to enter candidates information
 # And enter first name of the candidate "tArun"
 # And enter last name of the candidate "A"
 # And enter email address of the candidate "tarun@a01.com"
 # And click on the submit button
  #And click on send invite button to send assessment link to the candidate
  #And click on candidate and copy assessment url
  
  
  
  


  
  
