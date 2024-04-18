package com.example.swelab;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick_R() {
        // Click the button
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());

        // Check if the text view displays "Tonmoy odd!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Tonmoy odd!")));
    }

    @Test
    public void testButtonClick_G() {
        // Click the button twice
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view displays "Tonmoy odd!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Tonmoy odd!")));
    }

    @Test
    public void testButtonClick_Alternate() {
        // Click the button three times
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view alternates between "Tonmoy even!" and "Tonmoy odd!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Tonmoy even!")));

    }
}
