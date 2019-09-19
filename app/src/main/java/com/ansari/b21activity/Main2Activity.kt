package com.ansari.b21activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttonSecondAct.setOnClickListener(View.OnClickListener {

            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        })

        Log.i("mytag","Second Activity Oncreate ")

    }

    override fun onStart() {
        super.onStart()
        Log.i("mytag","Second Activity OnStart ")

    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag","Second Activity OnResume ")

    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag","Second Activity OnPause ")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag","Second Activity OnStop ")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","Second Activity Destroy ")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag","Second Activity Restart ")

    }
}
