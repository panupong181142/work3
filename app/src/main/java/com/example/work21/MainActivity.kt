package com.example.work21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val n = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val o = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        buA.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                text01.setText("$count")
            }else{
                m.show()
            }
        }


        buB.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                text01.setText("$count")
            }else{
                n.show()
            }
        }


        buC.setOnClickListener(){
            count = 0
            text01.setText("$count")
            o.show()

        }
    }
}