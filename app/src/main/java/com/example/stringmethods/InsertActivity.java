package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertActivity extends AppCompatActivity {
    EditText insertTxt;
    EditText positionTxt;
    EditText insert2Txt;
    Button sumbit7Btn;
    TextView answer7Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        sumbit7Btn.setOnClickListener(v -> {
            correctAnswer();
        });
    }

    private void initViews() {
        insertTxt = findViewById(R.id.insert_txt);
        positionTxt = findViewById(R.id.position_txt);
        insert2Txt = findViewById(R.id.insert2_txt);
        sumbit7Btn = findViewById(R.id.sumbit7_btn);
        answer7Txt = findViewById(R.id.answer7_txt);
    }
    public   String insertingText(String originalText , String key ,int position){
//        Take originalText , key As Strings , position as int inputs
//        Decalre the result of String assign “”
        String result = "";
//        Create New StringBulider Object pass oringalText->StringBulider name = new StringBulider (oringalText)
        StringBuilder name = new StringBuilder(originalText);
//        Inserting key value in name by given Position ->name.insert(position,key)
        name.insert(position,key);
//        Convert the name into String and assign to result ->result = name.toString()
        result = name.toString();
//        Result = name.toString()
        return result ;
//        Return result;


    }
    public void correctAnswer(){
        String oringalText = insertTxt.getText().toString();
        String key = insert2Txt.getText().toString();
        int position = Integer.parseInt(positionTxt.getText().toString());
        String result = insertingText(oringalText,key,position);
        answer7Txt.setText(result);
    }
}