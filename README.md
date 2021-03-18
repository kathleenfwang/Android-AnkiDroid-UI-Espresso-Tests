
# Test Descriptions: 
Tests for the Onramp Android QE available [here](https://github.com/onramp-io/onramp-QE-android-project-take-home?utm_campaign=Sirius%20XM%20Pandora%20Cohort%204&utm_medium=email&_hsmi=115377358&_hsenc=p2ANqtz-89NdiCpQi4zbmlPfQ9l8CiR3G4cRzSB2SuC68cleBGViiMw3Buu11_JTqUxzVhLE3GVh1x6jCmkzz2Ets3kPZhPE8WCtbK6uOfZbXgGyaTuUpgysQ&utm_content=115377358&utm_source=hs_email)
## Use of at least four different ViewMatchers
  - `isDisplayed()` - all 
  - `isClickable()` - DeckPicker
  - `hasFocus()` - CardBrowser
  - `withSpinnerText()`- CardBrowser
## Use of at least three different ViewActions
  - `clearText()` - MyAccount 
  - `click()` - all 
  - `typeTextIntoFocusedView()` - CardBrowser
  - `pressKey()`- CardBrowser
## Use of at least two different ViewAssertions
  - `matches()` - all 
  - `doesNotExist()` - MyAccount
## Test coverage for at least five different Views: 

### My Account Test:
This test case is for the `MyAccount` activity. The following tests are included: 
  - `loginButtonDoesNotRedirectWhenNoUser()`
    - uses `clearText()`, `doesNotExist()`
    - Clears the username and password text fields, and after pressing the "Log in" button, the "Invalid email address or password" text and the "Log in" button should be displayed <br /> 
    
I wanted to make sure the log in flow would not advance if the username and password fields were blank, and should display an error message. <br />
![image](https://user-images.githubusercontent.com/33078129/111573555-fe22b200-8767-11eb-9db6-df3788b7382f.png)

### Deck Picker Test: 
This test case is for the `DeckPicker` activity. The following tests are included: 
  - `isTextCorrectWhenCardsInDeck()`
    - If there is cards in deck, should not display "Collection is empty"
  - `isCardClickableAndShowAnswerButtonDisplays()`
    - uses `isClickable()`
    - Each item in the deck should be clickable and after it's clicked, the "Show Answer" button should display 
  - `isAddButtonClickableAfterMenuClick()`
    - Test if the "+" button is clickable and a menu with "add" option is displayed <br />
 
I wanted to dynamically make tests based on if there were decks present and it should display the correct text, i.e. "Collection is empty" if there are no decks. I also wanted to test if the decks were clickable and the "Show Answer" button should not display after it is clicked. It was challenging getting the data from the DeckPicker class; I made a new getDeckCount() function and called it with the activityRule in the test function to obtain the current deck count. <br />
![image](https://user-images.githubusercontent.com/33078129/111573636-23172500-8768-11eb-9d4d-23a608fe1884.png)

### Reviewer Test: 
This test case is for the `Reviewer` activity. The following tests are included: 
  - `isFlipCardButtonNotDisplayedAfterClick()`
   - After clicking the card, the "Flip Card" button should no longer be displayed 
  - `isFlagButtonDisplayingFlags()`
    - The flag button should display options for following flags: "Red flag", "Orange flag", "Green flag", etc <br />
    
I wanted to make a loop to make sure all of the correct flag names were displayed correctly. It was interesting creating a Java array to store the flag names and then utilizing a loop through the flag array and check if each flag name was displayed correctly. <br />
![image](https://user-images.githubusercontent.com/33078129/111573865-9456d800-8768-11eb-8873-8c09614bfa4e.png)

### Card Browser Test: 
This test case is for the `CardBrowser` activity. The following tests are included: 
  - `isSearchBoxFocused()`
    - After user clicks the search button, the search edit text field should be focused 
    - uses `hasFocus()`, `typeTextIntoFocusedView()`, `hasFocus()`
  - `isSpinnerDisplayingQuestion()`
    - uses `withSpinnerText()`
    - check if the spinner is displaying the "Question" tab and the spinner text is set to "Question" after it's clicked <br /> 
    
I wanted to check if the spinner was displaying the text correctly and I wanted to make sure the "search" input field was focused after the search button was clicked. It was challenging using the spinner tests and having to use onData instead of onView. It was also challnging finding the card name to make a search test.<br /> 
![image](https://user-images.githubusercontent.com/33078129/111573661-2e6a5080-8768-11eb-9719-09b20166c3e9.png)
 
### Preferences Test:
This test case is for the `Preferences` activity. The following tests are included: 
  - `doesGeneralSettingsOpenNewPage()`
    - Clicking the "General Settings" option should redirect to settings page 
  - `doesAppearanceThemeOpenOptions()`
    - Clicking "Appearance Theme" should open theme options, such as "Day" and "Plain"
  - `doesAppearanceFontOpenOptions()`
     - Clicking "Appearance Font" should open font options, such as "OpenSans-Bold" <br />
     
I wanted to make sure the correct theme/font views would display after clicking.  <br /> 
![image](https://user-images.githubusercontent.com/33078129/111573682-388c4f00-8768-11eb-9448-53fadfe9c2cf.png)



