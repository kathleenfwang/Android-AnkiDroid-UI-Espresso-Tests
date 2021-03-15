package com.sxmp.apprentice;

import com.ichi2.anki.MyAccount;
import com.ichi2.anki.R;
import com.ichi2.anki.Statistics;

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
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static kotlinx.coroutines.flow.FlowKt.withIndex;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.*;

public class StatisticsTest {
private ActivityTestRule<Statistics> activityRule =
        new ActivityTestRule<>(Statistics.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_isWebViewStatsDisplayed() {
        // checking if the anki web view stats fragments are displayed (should just be 1)
        onView(withId(R.id.web_view_stats)).check(matches(isDisplayed()));
    }
}