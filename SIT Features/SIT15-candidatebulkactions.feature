Feature: candidate bulk actions

  @blkact
  Scenario: verify bulk actions working for candidates or not
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "BulkSRD003"
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
  #And enable masked hiring
  And enable password and enter password "XPAStag0" which allows users to review responses securely
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
  And search for assessment "BulkSRD003" 
  And click on assessment to navigate to assessment setup page
  And navigate to candidates tab
  
  
  And click on add candidate button to enter candidates information
  And enter first name of the candidate "Arun"
  And enter last name of the candidate "A"
  And enter email address of the candidate "arun@a01.com"
  And click on the submit button
  
    #And click on bulk import candidates button
  #And upload file which contains bulk assessment candidates "UploadFiles//bulk_assessment_candidates.xlsx"
  #Then verify candidates "Ruther R" "Mahesh M" "Murali M" and "Karun K" added to assessment or not
  When select any candidate
  And shortlist the candidate using bulk action
  Then verify candidate is "Shortlisted" or not
  #When select any candidate
  And reject the candidate using bulk action
  Then verify candidate is "Rejected" or not
  #When select any candidate
  And delete the candidate using bulk action
  Then verify candidate deleted or not
   And close the browser