package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.moxtra.sdk.MXAccountManager;
import com.moxtra.sdk.MXChatManager;
import com.moxtra.sdk.MXException;
import com.moxtra.sdk.MXSDKException;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.OnClickListener;

/**
 * Created by Momo on 4/4/15.
 */
public class LACategories extends Activity {

    private static final String TAG = "inviteToChat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lateamoptions);

    }


        public void buttonOnClick20(View v) throws MXException.AccountManagerIsNotValid {
//            ImageButton button = (ImageButton) v;
            buttonOnClick20Chat();
        }

    public void buttonOnClick20Chat()
    {
        List<String> uniqueIds = new ArrayList<String>();
//        uniqueIds.add("abc");
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



        public void buttonOnClick21(View v) {
            ImageButton button = (ImageButton) v;
            startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
        }

        public void buttonOnClick22(View v) {
            ImageButton button = (ImageButton) v;
            startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
        }

        public void buttonOnClick23(View v) {
            ImageButton button = (ImageButton) v;
            startActivity(new Intent(getApplicationContext(), HackRUCategories.class));
        }
    };






