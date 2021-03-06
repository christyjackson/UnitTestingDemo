package com.example.unit_testing_demo;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule

    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;


    @Before
    public void setUp() throws Exception {
        mActivity = activityTestRule.getActivity();

    }

    @Test
    public void activitylaunchtest(){

        View view = mActivity.findViewById(R.id.hello_tv);
        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}