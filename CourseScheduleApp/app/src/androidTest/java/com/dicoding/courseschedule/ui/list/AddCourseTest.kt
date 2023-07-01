package com.dicoding.courseschedule.ui.list

import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry
import androidx.test.runner.lifecycle.Stage
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.add.AddCourseActivity
import com.dicoding.courseschedule.ui.home.HomeActivity
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class AddCourseTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadAddCourse(){

        onView(withId(R.id.action_add)).apply {
            check(matches(isDisplayed()))
            perform(click())
        }

        val addCourse = getAddCourseActivity()
        assertTrue(addCourse?.javaClass == AddCourseActivity::class.java)

        onView(withId(R.id.ib_start_time)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_start_time)).check(matches(isDisplayed()))
        onView(withId(R.id.add_ed_course_name)).check(matches(isDisplayed()))
        onView(withId(R.id.spinner_day)).check(matches(isDisplayed()))
        onView(withId(R.id.ib_end_time)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_end_time)).check(matches(isDisplayed()))
        onView(withId(R.id.ed_lecturer)).check(matches(isDisplayed()))
        onView(withId(R.id.ed_note)).check(matches(isDisplayed()))

    }

    private fun getAddCourseActivity(): Activity? {
        var activity: Activity? = null
        getInstrumentation().runOnMainSync {
            run {
                activity = ActivityLifecycleMonitorRegistry.getInstance()
                    .getActivitiesInStage(Stage.RESUMED).elementAtOrNull(0)
            }
        }
        return activity
    }
}