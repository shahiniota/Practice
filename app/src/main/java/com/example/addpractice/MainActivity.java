package com.example.addpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button first,second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FirstFragment firstFragment=new FirstFragment();
        transaction.add(R.id.mainframe,firstFragment);
        transaction.commit();
        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (id)
        {

            case R.id.first:
            {

                FirstFragment firstFragment=new FirstFragment();
                transaction.replace(R.id.mainframe,firstFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
            case R.id.second:
            {
                SecondFragment secondFragment=new SecondFragment();

                transaction.replace(R.id.mainframe,secondFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
            case R.id.third:
            {
                ThirstFragment thirstFragment=new ThirstFragment();
                transaction.replace(R.id.mainframe,thirstFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }

        }
    }
}
