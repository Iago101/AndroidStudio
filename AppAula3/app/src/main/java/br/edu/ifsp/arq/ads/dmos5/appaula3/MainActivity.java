package br.edu.ifsp.arq.ads.dmos5.appaula3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration configuration = getResources().getConfiguration();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        int orientation = configuration.orientation;
        float density = displayMetrics.density;
        float height = displayMetrics.heightPixels;
        float width = displayMetrics.widthPixels;
        int mcc = configuration.mcc;
        int mnc = configuration.mnc;
        Locale locale = configuration.locale;

        Log.d("configuration1", "Density: " + density);
        Log.d("configuration1", "Orientation: " + orientation);
        Log.d("configuration1", "Height:" + height);
        Log.d("configuration1", "Width: " + width);
        Log.d("configuration1", "Operadora: mcc=" + mcc + " mnc=" + mnc);
        Log.d("configuration1", "Language: " + locale.getLanguage() +
                " - " + locale.getCountry());
    }
}