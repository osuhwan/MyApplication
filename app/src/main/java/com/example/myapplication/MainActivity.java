package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //에디트텍스트 editTextText
    //에디트패스워드 editTextNumberPassword
    //에디트전화번호 editTextPhone
    //버튼         button
    //텍스트뷰     textView
    //텍스트뷰2    textView2
    //텍스트뷰3    textView3

    private EditText eText;
    private EditText eTextNP;
    private EditText eTextP;
    private Button eButton;
    private TextView eTextView;
    private TextView eTextView2;
    private TextView eTextView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        eText = (EditText) findViewById(R.id.editTextText);
        eTextNP = (EditText) findViewById(R.id.editTextNumberPassword);
        eTextP = (EditText) findViewById(R.id.editTextPhone);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);
    }

    public void onClicked(View view) {
        String str = eText.getText().toString();
        eTextView.setText("아이디:"+str);
        String str2 = eTextNP.getText().toString();
        eTextView2.setText("비밀번호:"+str2);
        String str3 = eTextP.getText().toString();
        eTextView3.setText("전화번호:"+str3);
    }
}