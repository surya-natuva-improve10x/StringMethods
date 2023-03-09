package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LastIndexOfActivity extends AppCompatActivity {
    EditText lastindexTxt;
    EditText lastindex2Txt;
    Button submit5Btn;
    TextView answer5Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_index_of);
        inItViews();
        handleSumbitBtn();
    }

    private void handleSumbitBtn() {
        submit5Btn.setOnClickListener(v -> {
            verifyCorrectAnswer();
        });
    }

    private void inItViews() {
        lastindexTxt = findViewById(R.id.lastindex_txt);
        lastindex2Txt = findViewById(R.id.lastindex2_txt);
        submit5Btn = findViewById(R.id.submit5_btn);
        answer5Txt = findViewById(R.id.answer5_txt);
    }
    public void verifyCorrectAnswer(){
        String oringalText = lastindexTxt.getText().toString();
        String key = lastindex2Txt.getText().toString();
        String result = lastIndexOf(oringalText,key);
        answer5Txt.setText(result);
    }

    private String lastIndexOf(String oringalText, String key) {
      int  result = -1;
        result = oringalText.lastIndexOf(key);
        return result + "";
    }
}