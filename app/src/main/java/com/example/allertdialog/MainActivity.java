package com.example.allertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnshowdialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshowdialog = findViewById(R.id.buttonshowdialog);

       Order order = new Order.Builder().
               setOdertype(OrderType.ON_SITE)
               .buil();


        Log.d("BBBBB",order.getOrderType()+"");




    }
}
