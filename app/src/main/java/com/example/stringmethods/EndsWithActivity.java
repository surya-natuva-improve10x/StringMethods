package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EndsWithActivity extends AppCompatActivity {
    EditText edit1Txt;
    EditText edit2Txt;
    Button submit1Btn;
    TextView answer1Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ends_with);
        handleInitViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        submit1Btn.setOnClickListener(v -> {
            handleEndwithMethod();
        });
    }

    private void handleEndwithMethod() {
        String word = edit1Txt.getText().toString();
        String suffix = edit2Txt.getText().toString();
        boolean result = suffixText(word,suffix);
        answer1Txt.setText(result + "");
    }

    private boolean suffixText(String word, String suffix) {
        boolean result = false;
        result = word.endsWith(suffix);
        return result;
    }

    private void handleInitViews() {
        edit1Txt = findViewById(R.id.edit1_txt);
        edit2Txt = findViewById(R.id.edit2_txt);
        submit1Btn = findViewById(R.id.submit1_btn);
        answer1Txt = findViewById(R.id.answer1_txt);
    }
}
//    Take word and suffix as input Strings
//        Declare result as boolean and assign to false
//        if(word.endsWith(suffix)then
//        a.Result = true
//        Retrun result
