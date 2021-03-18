package com.sxmp.apprentice;

import com.ichi2.anki.CardBrowser;
import com.ichi2.anki.Preferences;

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
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class PreferencesTest {
    private ActivityTestRule<Preferences> activityRule =
            new ActivityTestRule<>(Preferences.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_doesGeneralSettingsOpenNewPage(){
        onView(withText("General settings")).check(matches(isDisplayed())).perform(click());
        // check if general settings view is now displayed with text "Sync"
        onView(withText("Sync")).check(matches(isDisplayed()));
    }
    @Test
    public void test_doesAppearanceThemeOpenOptions(){
        onView(withText("Appearance")).check(matches(isDisplayed())).perform(click());
        // check if theme options are available
        onView(withText("Day theme")).check(matches(isDisplayed())).perform(click());
        // a dropdown menu with "Plain" option should display
        onView(withText("Plain")).check(matches(isDisplayed()));
    }
    @Test
    public void test_doesAppearanceFontOpenOptions(){
        onView(withText("Appearance")).check(matches(isDisplayed())).perform(click());
        // check if font options are available
        onView(withText("Default font")).check(matches(isDisplayed())).perform(click());
        // Font option with "OpenSans-Bold" should display
        onView(withText("OpenSans-Bold")).check(matches(isDisplayed()));
    }
}