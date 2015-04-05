package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Momo on 4/4/15.
 */
public class CarlHacksCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carlhacksteamoptions);
    }

    public void buttonOnClick36(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick37(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick38(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick39(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
}
