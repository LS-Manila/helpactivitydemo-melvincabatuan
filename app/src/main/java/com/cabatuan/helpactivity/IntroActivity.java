package com.cabatuan.helpactivity;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by cobalt on 9/3/15.
 */
public class IntroActivity extends Activity {

    public static final String PREFERENCES = "GamePrefs";
    public static final String PREFERENCES_NICKNAME = "Nickname"; // String
    public static final String PREFERENCES_EMAIL = "Email"; // String
    public static final String PREFERENCES_PASSWORD = "Password"; // String
    public static final String PREFERENCES_DOB = "DOB"; // Long
    public static final String PREFERENCES_GENDER = "Gender";
    public static final String PREFERENCES_CHEAT = "Cheat";
    public static final String PREFERENCES_QCOUNT = "QCount";
    public static final String PREFERENCES_HELPER = "Helper";
    public static final String PREFERENCES_AVATAR = "Avatar"; // String URL to image
    public static final String PREFERENCES_SOUND = "Sound";

    public static final int numberOfOptions = 4; // Main Menu Options


    /**
     * Center the action bar
     */
    protected void centerActionBarTitle()
    {
        int titleId;
        titleId = getResources().getIdentifier("action_bar_title", "id", "android");
        TextView titleTextView = (TextView) findViewById(titleId);
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        // Fetch layout parameters of titleTextView (LinearLayout.LayoutParams : Info from HierarchyViewer)
        LinearLayout.LayoutParams txvPars = (LinearLayout.LayoutParams) titleTextView.getLayoutParams();
        txvPars.gravity = Gravity.CENTER_HORIZONTAL;
        txvPars.width = metrics.widthPixels;
        titleTextView.setLayoutParams(txvPars);
        titleTextView.setGravity(Gravity.CENTER);
    }

}