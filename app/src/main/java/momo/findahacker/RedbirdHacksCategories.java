package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Momo on 4/4/15.
 */
public class RedbirdHacksCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redbirdhacksteamoptions);
    }

    public void buttonOnClick40(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick41(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick42(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }

    public void buttonOnClick43(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
    }
}
