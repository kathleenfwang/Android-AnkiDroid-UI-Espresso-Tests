
# Test Descriptions: 

## Use of at least four different ViewMatchers
  - isDisplayed()
  - isClickable()
  - hasFocus()
  - withSpinnerText()
## Use of at least three different ViewActions
  - clearText()
  - click()
  - typeTextIntoFocusedView()
  - pressKey()
## Use of at least two different ViewAssertions
  - matches()
  - doesNotExist()
## Test coverage for at least five different Views: 

### Card Browser Test: 
This test case is for the "Card Browswer" activity. The following tests are included: 
  - `isSearchBoxFocused()`
    - After user clicks the search button, the search edit text field should be focused 
  - `isSpinnerDisplayingQuestion()`
    - check if the spinner is displaying the "Question" tab and the spinner text is set to "Question" after it's clicked 
 
### Deck Picker Test: 
  - `isTextCorrectWhenCardsInDeck()`
    - If there is cards in deck, should not display "Collection is empty"
  - `isCardClickableAndShowAnswerButtonDisplays()`
    - Each item in the deck should be clickable and after it's clicked, the "Show Answer" button should display 
  - `isAddButtonClickableAfterMenuClick()`
    - Test if the "+" button is clickable and a menu with "add" option is displayed 

### My Account Test: 
  - `loginButtonDoesNotRedirectWhenNoUser()`
    - Clears the username and password text fields, and after pressing the "Log in" button, the page should remain on the Login Page, so the "Log in" button should still display 
 
### Preferences Test:
  - `doesGeneralSettingsOpenNewPage()`
    - Clicking the "General Settings" option should redirect to settings page 
  - `doesAppearanceThemeOpenOptions()`
    - Clicking "Appearance Theme" should open theme options, such as "Day" and "Plain"
  - `doesAppearanceFontOpenOptions()`
     - Clicking "Appearance Font" should open font options, such as "OpenSans-Bold"
     
### Reviewer Test: 
  - `isFlipCardButtonNotDisplayedAfterClick()`
   - After clicking the card, the "Flip Card" button should no longer be displayed 
  - `isFlagButtonDisplayingFlags()`
    - The flag button should display options for following flags: "Red flag", "Orange flag", "Green flag", etc 
