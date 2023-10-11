   Feature: Advanced Settings Feature
   
   @advanced_settings
   Scenario: verify advanced settings practice questions
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
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
 
  And disable save as draft by enabling toggle
  And enter assessment end text "Congratulations ! You've successfully completed the assessment , results will be announced soon . "
  And upload introduction vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which will be shown to the candidate before beginning of the assessment
  And click on checkbox below to play introduction vedio automatically once otp entered correctly
  And upload exit vedio "UploadFiles//videox0pa.mp4" by clicking on add vedio button which  will be shown to the candidate after completion of the assessment
  And click on save button
    And close the browser

  
  



  
  
 

