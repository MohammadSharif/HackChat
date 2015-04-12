package momo.HackChat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.moxtra.sdk.MXChatManager;
import com.moxtra.sdk.MXException;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Momo on 4/4/15.
 */
public class CarlHacksCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carlhacksteamoptions);
    }

    public void buttonOnClick36(View v)throws MXException.AccountManagerIsNotValid {
        ImageButton button = (ImageButton) v;
        buttonOnClick36Chat();
    }

    public void buttonOnClick36Chat()
    {
        List<String> uniqueIds = new ArrayList<String>();
        uniqueIds.add("abc");
        try {
            MXChatManager.getInstance().createChat("topic", uniqueIds, new MXChatManager.OnCreateChatListener() {
                @Override
                public void onCreateChatSuccess(String binderID) {
                    Log.d("s", "onCreateChatSuccess(), binderID = " + binderID);
                }

                @Override
                public void onCreateChatFailed(int errorCode, String message) {
                    Log.d("asd", "onCreateChatFailed(), errorCode = " + errorCode + ", message = " + message);
                }
            });
        } catch (MXException.AccountManagerIsNotValid e) {
            e.printStackTrace();
            Log.e("assad","Asdasd");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void buttonOnClick37(View v)
    {
        ImageButton button = (ImageButton) v;
        buttonOnClick36Chat();
    }

    public void buttonOnClick38(View v)
    {
        ImageButton button = (ImageButton) v;
        buttonOnClick36Chat();
    }

    public void buttonOnClick39(View v)
    {
        ImageButton button = (ImageButton) v;
        buttonOnClick36Chat();
    }
}
