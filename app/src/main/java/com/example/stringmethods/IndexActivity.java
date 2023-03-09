package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {
    EditText index1Txt;
    EditText index2Txt;
    Button sumbit4Btn;
    TextView answer4Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        initViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        sumbit4Btn.setOnClickListener(v -> {
            verfiyCorrectAnswer();
        });
    }

    private void initViews() {
        index1Txt = findViewById(R.id.index1_txt);
        index2Txt = findViewById(R.id.index2_txt);
        sumbit4Btn = findViewById(R.id.submit4_btn);
        answer4Txt = findViewById(R.id.answer4_txt);
    }
    public void verfiyCorrectAnswer (){
        String oringalText = index1Txt.getText().toString();
        String key = index2Txt.getText().toString();
        String result = indexOf(oringalText,key);
        answer4Txt.setText(result);
    }

    private String indexOf(String oringalText, String key) {
        int result = -1;
        result = oringalText.indexOf(key);
        return result + "";
    }
}