package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Momo on 4/4/15.
 */
public class HackRUCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hackruteamoptions);
    }

    public void buttonOnClick32(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick33(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
    public void buttonOnClick34(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
    public void buttonOnClick35(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
}
