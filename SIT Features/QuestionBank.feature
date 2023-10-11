Feature: question bank feature
  
  Scenario: verify adding eassy ,vedio ,mcq type questions to question bank
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And navigate to question bank
  And click on add question button
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
  
   And click on add question button
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
  
  And click on add question button
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
  
  And click on add question button
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
  
