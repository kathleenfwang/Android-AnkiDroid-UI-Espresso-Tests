package com.sxmp.apprentice;

import com.ichi2.anki.DeckPicker;
import com.ichi2.anki.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import androidx.test.core.app.ActivityScenario;
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
import static org.hamcrest.Matchers.not;

public class SampleDeckPickerTest {
    private boolean cardsInDeck = true;
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
    public void test_isDeckItemInView() {
        if (cardsInDeck){
            onView(withId(R.id.DeckPickerHoriz)).check(matches(isDisplayed()));
        }
        else {
            onView(withId(R.id.DeckPickerHoriz)).check(matches(not(isDisplayed())));
        }
    }

    @Test
    public void test_isTextCorrectWhenCardsInDeck() {
        if (cardsInDeck) {
            onView(withText(R.string.no_cards_placeholder_title)).check(matches(not(isDisplayed())));
        } else {
            onView(withText(R.string.no_cards_placeholder_title)).check(matches(isDisplayed()));
        }
    }
    @Test
    public void test_isCardClickable() {
       onView(withId(R.id.DeckPickerHoriz)).check(matches(isClickable()));
    }

    @Test
    public void test_isAddButtonVisibleAndClickable() {
        onView(withId(R.id.add_content_menu)).check(matches(isDisplayed()));
        onView(withId(R.id.add_content_menu)).perform(click());
    }

}
