package com.example.databinding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    TextView personEmail, personName;

    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandlers mainActivityClickHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        personEmail = findViewById(R.id.personEmail);
//        personName = findViewById(R.id.personName);

        // TextView
        Person person1 = new Person("Salman Hadli", "skh174211@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(person1);

        // Binding the Handler
        mainActivityClickHandlers = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandler(mainActivityClickHandlers);


//        personName.setText(person1.getName().toString());
//        personEmail.setText(person1.getEmail().toString());

//        Button b1 = findViewById(R.id.btn1);
//        Button b2 = findViewById(R.id.btn2);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }


    public class MainActivityClickHandlers {
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        // First button click handling
        public void onBtn1Click(View view) {
            Toast.makeText(context, "Hello My Friends", Toast.LENGTH_SHORT).show();
        }


        // Second button click handling
        public void onBtn2Click(View view) {
            Toast.makeText(context, "Bye Bye My Friends", Toast.LENGTH_SHORT).show();
        }
    }
}