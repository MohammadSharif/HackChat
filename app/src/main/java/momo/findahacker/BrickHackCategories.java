package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Momo on 4/4/15.
 */
public class BrickHackCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brickhackteamoptions);
    }

    public void buttonOnClick28(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick29(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick30(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick31(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
}
