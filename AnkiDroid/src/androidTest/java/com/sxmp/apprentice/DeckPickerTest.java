package com.sxmp.apprentice;

import com.ichi2.anki.DeckPicker;
import com.ichi2.anki.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class DeckPickerTest {

    private ActivityTestRule<DeckPicker> activityRule =
            new ActivityTestRule<>(DeckPicker.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_isTextCorrectWhenCardsInDeck() {
        //get current deck size
        int cards = activityRule.getActivity().getDeckCount();
        boolean cardsInDeck = cards > 0;

        if (cardsInDeck) {
            onView(withText(R.string.no_cards_placeholder_title)).check(matches(not(isDisplayed())));
        } else {
            onView(withText(R.string.no_cards_placeholder_title)).check(matches(isDisplayed()));
        }
    }
    @Test
    public void test_isCardClickableAndShowAnswerButtonDisplays() {
        //select the deck card and perform click
       onView(withId(R.id.DeckPickerHoriz)).perform(click());
       // show answer button should then be displayed
        onView(withId(R.id.flip_card))
                .check(matches(withText(containsString("SHOW ANSWER"))));

    }

    @Test
    public void test_isAddButtonClickableAfterMenuClick() {
        // click "add content menu" button
        onView(withId(R.id.add_content_menu)).check(matches(isDisplayed())).perform(click());
        // check if there is an option "Add" that pops out
        onView(withText("Add"))
                .check(matches(isDisplayed()));
        // check if the button to "Add" is also visible
        onView(withId(R.id.add_note_action)).check(matches(isClickable()));
    }

}
