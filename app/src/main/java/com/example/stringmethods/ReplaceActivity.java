package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReplaceActivity extends AppCompatActivity {
    EditText replace1Txt;
    EditText oldtextTxt;
    EditText newtextTxt;
    Button submit3Btn;
    TextView result3Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        handleInItViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        submit3Btn.setOnClickListener(v -> {
            replaceText();
        });
    }

    private void handleInItViews() {
        replace1Txt = findViewById(R.id.replace1_txt);
        oldtextTxt = findViewById(R.id.oldtext_txt);
        newtextTxt = findViewById(R.id.newtext_txt);
        submit3Btn = findViewById(R.id.submit3_btn);
        result3Txt = findViewById(R.id.result3_txt);
    }

    public void replaceText(){
     String replacetext = replace1Txt.getText().toString();
     String oldtext = oldtextTxt.getText().toString();
     String newtext = newtextTxt.getText().toString();
     String result1 = replace(replacetext,oldtext,newtext);
     result3Txt.setText(result1);
    }

    private String replace(String replacetext, String oldtext, String newtext) {
        String result = "";
        result = replacetext.replace(oldtext,newtext);
        return result;
    }


}