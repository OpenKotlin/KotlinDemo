package com.openkotlin.tanck.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.toast
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv)
        tv.setOnClickListener { toast("Go") }
        async {
            val url = "https://www.baidu.com"
            val readText = URL(url).readText()
            Log.d("Tanck", "readText:" + readText)
        }
        Thread {
            Log.d("Tanck", "1text")
        }.start()



        var output : String?

        output = null
    }


}
