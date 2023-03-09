package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartWithActivity extends AppCompatActivity {
    EditText editoneTxt;
    EditText edittwoTxt;
    Button sumbitBtn;
    TextView answerTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_with);
        handleInitviews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        sumbitBtn.setOnClickListener(v -> {
            handleStartWithMethod();
        });
    }

    private void handleStartWithMethod() {
        String word = editoneTxt.getText().toString();
        String prefix = edittwoTxt.getText().toString();
        boolean result = prefixTxt(word,prefix);
        answerTxt.setText(result + "");
    }

    private boolean prefixTxt(String word , String prefix) {
         boolean result = false;
         result = word.startsWith(prefix);
         return result;
    }

    private void handleInitviews() {
        editoneTxt = findViewById(R.id.editone_txt);
        edittwoTxt = findViewById(R.id.edittwo_txt);
        sumbitBtn = findViewById(R.id.sumbit_btn);
        answerTxt = findViewById(R.id.answer_txt);
    }

}
//    Take word and prefix as input Strings
//        Declare result as boolean and assign to false
//        if(word.startsWith(prefix)then
//        a.Result = true
//        Retrun result
