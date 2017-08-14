import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by rapha on 14.08.2017.
 */

public class EditItems {




}
//stack overflow; wenn Enter gedrückt wird wird input zu ArrayListe hinzugefügt

    private void setupEnterKey(){


    private void pressedEnter(){
        EditText input = (EditText) findViewById(R.id.editText);
        String newInput = input.getText().toString();
        if(input != null && !TextUtils.isEmpty(newInput.trim())) {
            shops.add(input);
            newInput.setText("");

        }
    }

}