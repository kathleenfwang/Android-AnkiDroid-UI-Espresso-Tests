package com.sxmp.apprentice;

import com.ichi2.anki.MyAccount;
import com.ichi2.anki.NavigationDrawerActivity;
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
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class MyAccountTest {
    private ActivityTestRule<MyAccount> activityRule =
            new ActivityTestRule<>(MyAccount.class, false, false);

    private GrantPermissionRule grantRule =
            GrantPermissionRule.grant(WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(grantRule).around(activityRule);

    @Before
    public void setup() {
        activityRule.launchActivity(null);
    }

    @Test
    public void test_isLoginButtonDisplayed() {
        onView(withId(R.id.login_button)).check(matches(isDisplayed()));
    }
    @Test
    public void test_loginButtonDoesNotRedirectWhenNoUser() {
        // first clear the password and username forms
        onView(withId(R.id.password)).perform(clearText());
        onView(withId(R.id.username)).perform(clearText());
        // click login button
        onView(withId(R.id.login_button)).perform(click());
        // can also check if the root layout(Login Activity) is still being displayed
//        onView(withId(R.id.root_layout)).check(matches(isDisplayed()));
        // username logged in form should not exist
        onView(withId(R.id.username_logged_in)).check(doesNotExist());
    }
}