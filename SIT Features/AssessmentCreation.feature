  Feature: Assessment Creation feature
  
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
  And enter assessment name "Assessmentxopa0sit006"
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
  And close the browser
  
  @edtassmnt
    Scenario: verify edit assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on edit button beside any assessment
  And enter assessment name "Assessmentxopa0sit006"
  And enter information to test takers "welcome to the Assessment !"
  And keep interview type fixed
  #And enable remainders
  And choose remainder interval "5" days and choose maximum remainders "5" times
  #And enable toggle which allows candidates to cut copy paste for essay type questions
  #And enable toggle which allows candidates to retake the assessment
  And choose assessment start date and time "03/28/2023, 11:00 AM"
  #And enable toggle which allows candidates to see responses after submission of assessment

  #And enable company branding
 # And enable masked hiring
   #And enable password toggle which allows users to access url securely and review responses 
  And enter security password "XPAStag0"
    And choose assessment end date "05/03/2023"
  #And enable rating criteria which will enable rating criteria section while creating assessment questions
  And click on change banner button to upload assessment banner "UploadFiles//xopabanner.png"
  And click on submit button
    And close the browser
  
  #Given close Browser
   @setup
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
  And choose date "27/03/2023, 7:00 PM"
  #And edit assessment start date "27/03/2023, 7:00 PM" by clicking on edit button
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
  And enter number of times candidate can retake vedio "2"
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
  
  @create1
    Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "Assessment xopa0sit00qb4"
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
    And close the browser
  
   @addfromquestionbank
  Scenario: verify assessment setup functionality (add from questionbank)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on add from question bank button
  And filter question bank by eassy type questions
  Then verify all questions filtered are of type "Essay" or not
  When select a question from filtered questions and click on add button
  Then verify question added to assessment or not 
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
  When click on add from question bank button
  And filter question bank by rating type questions
  Then verify all questions filtered are of type "Rating" or not
  When select a question from filtered questions and click on add button
  And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
    And close the browser
  
     #@addfromquestionbankA
  #Scenario: verify assessment setup functionality (add from questionbank)
  #Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  #When accept xopaterms
  #And choose login type
  #And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  #And verify captcha and click on Login button
  #And navigate to interview menu
  #And navigate to X0PA ROOM
  #And click on assessment to navigate to assessment setup page
  #And click on add from question bank button
  #And filter question bank by eassy type questions
  #Then verify all questions filtered are of type "Essay" or not
  #When select a question from filtered questions and click on add button
  #Then verify question added to assessment or not 
  #When click on add from question bank button
  #And filter question bank by video type questions
  #Then verify all questions filtered are of type "Video" or not
  #When select a question from filtered questions and click on add button
  #And drag added question to first question and drop to reorder questions
  #Then verify question added to assessment or not 
  #When click on add from question bank button
  #And filter question bank by mcq type questions
  #Then verify all questions filtered are of type "Multiple Choice Question (MCQ)" or not
  #When select a question from filtered questions and click on add button
  #And drag added question to first question and drop to reorder questions
  #Then verify question added to assessment or not 
  #When click on add from question bank button
  #And filter question bank by rating type questions
  #Then verify all questions filtered are of type "Rating" or not
  #When select a question from filtered questions and click on add button
  #And drag added question to first question and drop to reorder questions
  #Then verify question added to assessment or not
    #And close the browser 
  

  
    @create2
    Scenario: verify assessment creation functionality
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on create new assessment button
  And enter assessment name "Assessment xopa0sit00qb5"
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
    And close the browser
  
    @addfromquestionbankglobal
  Scenario: verify assessment setup functionality (add from global questionbank)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on add from question bank button
  And navigate to global question bank
  And filter question bank by eassy type questions
  Then verify all questions filtered are of type "Essay" or not
  When select a question from filtered questions and click on add button
  Then verify question added to assessment or not 
  When click on add from question bank button
  And navigate to global question bank
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
  When click on add from question bank button
  And filter question bank by rating type questions
  Then verify all questions filtered are of type "Rating" or not
  When select a question from filtered questions and click on add button
  And drag added question to first question and drop to reorder questions
  Then verify question added to assessment or not 
    And close the browser
  
  

  
 
  
 
  
  
  
  
    @setupABC
  Scenario: verify assessment setup functionality (add custom questions)
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  #And click on edit button to edit assessment start date
  #And choose date "27/03/2023, 7:00 PM"
  #And edit assessment start date "27/03/2023, 7:00 PM" by clicking on edit button
  #And click on the submit button
    #And click on edit button to edit assessment end date
  #And choose date "14/04/2023, 07:00 PM"
  #And edit assessment end date "14/04/2023, 07:00 PM" by clicking on edit button
  #And click on the submit button
  And click on the add custom question button
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
  And click on the add custom question button
  And enter the question "what is manual testing ?"
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
  
    And click on the add custom question button
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
  
  
    And click on the add custom question button
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
  
  
  
  
  
  
  
  
  
  
  
  

  
  
  
  
  
  
  