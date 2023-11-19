Feature: LimeRoad page E2E testing

@SmokeTest
Scenario: To test the Login functionality
Given We can able to launch the "chrome" browser
And we can able to launch the application url "https://www.limeroad.com/feed?feed_kyc=true&top_level=Men"
When We can able to click the Men product
And We can able to click the T-shirt product
And We can able to select the branb bee
And We can able to choose the product
And We can able to choose the size
Then We can able to Add the product in our cart
