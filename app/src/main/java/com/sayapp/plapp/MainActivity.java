package com.sayapp.plapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment start_frag = fragmentManager.findFragmentById(R.id.fragment_container);
        if(start_frag == null) {
            start_frag = new CM_youtubePlaylist();
            fragmentManager.beginTransaction().add(R.id.fragment_container, start_frag).commit();
        }

        // Load an ad into the AdMob banner view.
        // AdView adView = (AdView) findViewById(R.id.adView);
        // AdRequest adRequest = new AdRequest.Builder()
        //        .setRequestAgent("android_studio:ad_template").build();
        // adView.loadAd(adRequest);

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        // Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();

        Toast.makeText(this, "Çocuk Şarkıları Uygulamasına Hoşgeldiniz...", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // shows the about message
            Toast toast=Toast.makeText(this, "Bu uygulama çocukların başka videoları açmasına engel olacak seçilde, sadece seçilmiş çocuk şarkılarını dinleyebilmeleri için ücretsiz olarak hizmete sunulmuştur.",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 300);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
            // Toast.makeText(this, "Bu uygulama çocukların başka videoları açmasına engel olacak seçilde, sadece seçilmiş çocuk şarkılarını dinleyebilmeleri için ücretsiz olarak hizmete sunulmuştur.", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
