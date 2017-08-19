package com.example.rapha.shoppingapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rapha on 19.08.2017.
 */

public class CreateYourOwnShoppingList extends MainActivity{
    private ArrayList<String> shops = new ArrayList<String>();
    private ArrayAdapter<String> shops_adapter;
    private static final String toastText = "ungültige Eingabe";

    @Override
    protected void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.listenlayoutsowiekathaesgenannthat);
        onKeyListener();
    }


    private void onKeyListener(){
        EditText userInput = (EditText) findViewById(R.id.userInput);
        userInput.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    pressedKey();
                }
                Toast toast = Toast.makeText(this, toastText, Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }

        });

    }
}

    private void pressedKey(){
        EditText userInput = (EditText) findViewById(R.id.userInput);
        String newUserInput = userInput.getText().toString();
        if(userInput != null && TextUtils.isEmpty(newUserInput.trim())){
            shops.add(newUserInput);
            userInput.setText("");
        }
    }

    //Methodennamen ändern; Mit Adapter wird ListView mit Activity verbunden (ka warum man des machen muss :D)
    private void setUpListView(){
        android.widget.ListView chosenShops = (android.widget.ListView) findViewById(R.id.chosenShops);
        shops_adapter = new ArrayAdapter<String>(this, R.layout.activity_main, shops);
        chosenShops.setAdapter(shops_adapter);
    }

    private void onShopClicked(){
        //löschen, Infos holen, Lage von Shop anzeigen

    }

    private void showShopDetails(){
        // Intent zu Informationenklasse

    }

    private void deleteShop(){

    }


}
