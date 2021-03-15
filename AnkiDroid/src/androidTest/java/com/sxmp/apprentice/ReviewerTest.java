package com.sxmp.apprentice;

import com.ichi2.anki.R;
import com.ichi2.anki.Reviewer;
import com.ichi2.anki.Statistics;

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
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class ReviewerTest {
    private ActivityTestRule<Reviewer> activityRule =
            new ActivityTestRule<>(Reviewer.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_isFlipCardButtonNotDisplayedAfterClick() {
        // checking if the flip card button is displayed
        onView(withId(R.id.flip_card)).check(matches(isDisplayed()))
                // click flip card button
                .perform(click())
                // flip card button should not be displayed after clicked
                .check(matches(not((isDisplayed()))));
    }

}