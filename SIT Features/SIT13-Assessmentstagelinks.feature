Feature: links redirecting to candidates at different stages of assessment

  @links
   Scenario: verify links redirecting to candidates at various stages
  Given Launch Application using "chrome"Browser and valid URL "http://staging.x0pa.ai/app/roboroy"
  When accept xopaterms
  And choose login type
  And enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  And verify captcha and click on Login button
  And navigate to interview menu
  And navigate to X0PA ROOM
  And click on assessment to navigate to assessment setup page
  And click on total link
  Then verify all candidates available as per count
  When click on draft link
  Then verify candidates having the status "Draft" are being filtered or not
   When click on awaiting response link
   Then verify candidates having the status "Awaiting Response" are being filtered or not
   When click on in progress link
  Then verify candidates having the status "In Progress" are being filtered or not
   When click on completed link
   Then verify candidates having the status "Completed" are being filtered or not
     And close the browser
