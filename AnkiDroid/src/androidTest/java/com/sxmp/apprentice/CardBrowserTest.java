package com.sxmp.apprentice;

import com.ichi2.anki.CardBrowser;
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
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasFocus;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class CardBrowserTest {
    private ActivityTestRule<CardBrowser> activityRule =
            new ActivityTestRule<>(CardBrowser.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_isSearchBoxFocused() {
        // check search button is displayed
        onView(withId(R.id.action_search)).check(matches(isDisplayed()))
                // click search button
                .perform(click());
        // check if search text is now focused
    onView(withId(R.id.search_src_text)).check(matches(hasFocus()));
    }
    @Test
    public void test_isSpinnerDisplayingQuestion() {
        // check if the spinner for column1 is displayed
        onView(withId(R.id.browser_column1_spinner)).check(matches(isDisplayed()))
                // click the spinner to get dropdown
                .perform(click());
        // check if all of the spinner dropdown data contains strings
        onData(allOf(is(instanceOf(String.class)),
                // check if there is a "Question" tab in spinner dropdown
                is("Question")))
                // click the "Question" tab
                .perform(click());
        // check the spinner text now displaying "Question"
        onView(withId(R.id.browser_column1_spinner)).check(matches(withSpinnerText(containsString("Question"))));
    }
}