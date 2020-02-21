package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rand;
    public void generaterand(){
        Random r=new Random();
        rand=r.nextInt(20)+1;
    }
    public void clickLog(View view){
        EditText number=findViewById(R.id.num);
        String str=number.getText().toString();
        int x=Integer.parseInt(str);
        Log.i("Number is",""+x+"  ");
        if (rand>x){
        Toast.makeText(this,"Higher than"+str,Toast.LENGTH_SHORT).show();}
        else if(rand<x){
            Toast.makeText(this,"Lower than"+str,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,str+" yes i guessed "+rand+" play again or exit",Toast.LENGTH_LONG).show();
            generaterand();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random=new Random();
        rand=random.nextInt(20)+1;


    }
}
