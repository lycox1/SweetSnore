package com.example.sweetsnore;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static String TAG = "SweetSnore_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "display density " + getResources().getDisplayMetrics().density);
        Log.d(TAG, "display dpi " + getResources().getDisplayMetrics().densityDpi);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        // 해상도 구하는 방법
        float widthDp = dm.widthPixels / dm.density;

        String str_ScreenSize = "The Android Screen is: "
                + dm.widthPixels
                + " x "
                + dm.heightPixels + "\n"
                + "Width DP : " + widthDp;
        Log.d(TAG, str_ScreenSize);
    }
}
