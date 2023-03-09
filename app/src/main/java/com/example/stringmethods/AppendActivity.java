package com.example.stringmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppendActivity extends AppCompatActivity {
    EditText appendTxt;
    EditText append2TXT;
    Button submit6Btn;
    TextView answer6Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_append);
        inItViews();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        submit6Btn.setOnClickListener(v -> {
            correctAnswer();
        });
    }

    private void inItViews() {
        appendTxt = findViewById(R.id.append_txt);
        append2TXT = findViewById(R.id.append2_txt);
        submit6Btn = findViewById(R.id.submit6_btn);
        answer6Txt = findViewById(R.id.answer6_txt);
    }
    public String appendingText(String prefix , String suffix){
//        Take prefix , suffix as input Strings
//        Declare result of String and assign as “”
        String result = "";
//        Create a new StringBuilder Object pass the prefix ->StringBuilder name = new StringBuilder (prefix)
        StringBuilder name = new StringBuilder(prefix);
//        Adding suffix to name ->name.append(suffix)
        name.append(suffix);
//        Convert the name into String and assign to result ->result = name.toString()
        result = name.toString();
//        Return result;
        return result;

    }
    public void correctAnswer(){
        String prefix = appendTxt.getText().toString();
        String suffix = append2TXT.getText().toString();
        String result = appendingText(prefix,suffix);
        answer6Txt.setText(result);
    }
}
