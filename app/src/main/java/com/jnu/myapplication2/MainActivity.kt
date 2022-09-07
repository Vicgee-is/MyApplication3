package com.jnu.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TextView text_view_hello_world = (TextView)findViewById(R.id.text_view_hello_world)
        val text_view_hello_world = findViewById(R.id.text_view_hello_world) as TextView
        text_view_hello_world.setText("你好Android")
        // text_view_hello_world.setText(R.string.hello_world)
        text_view_hello_world.setText(this.resources.getText(R.string.hello_world).toString())
    }
}