package com.ansari.b21activity

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.ansari.b21activity.R.id.button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {

            var myIntent = Intent("chi")
            startActivity(myIntent)

           /* var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:998855555"))
            startActivity(myIntent)*/

          /*  var myIntent = Intent(Intent.ACTION_VIEW,Uri.parse("http:google.com"))
            startActivity(myIntent)*/

        })

        Log.i("mytag","MainActivity Oncreate ")
    }

    override fun onStart() {
        super.onStart()
        Log.i("mytag","MainActivity OnStart ")

    }

    override fun onResume() {
        super.onResume()
        Log.w("mytag","MainActivity OnResume ")

    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag","MainActivity OnPause ")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag","MainActivity OnStop ")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","MainActivity Destroy ")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag","MainActivity Restart ")

    }
}
