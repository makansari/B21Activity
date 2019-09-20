package com.ansari.b21activity

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.ansari.b21activity.R.id.button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(textViewMenu)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var myId = item!!.itemId

        when(myId){

            R.id.item_toast ->
            { Toast.makeText(this,"Options menu toast ",Toast.LENGTH_LONG).show()}

            R.id.item_search ->
            { Toast.makeText(this,"Options menu search ",Toast.LENGTH_LONG).show()

                var alertbox = AlertDialog.Builder(this)

                alertbox.setTitle("MY ALERT DIALOG !!")
                alertbox.setMessage("Do you want to Exit")
                alertbox.setCancelable(false)

                alertbox.setPositiveButton("YES", DialogInterface.OnClickListener { dialog, which ->
                    finish()

                })

                alertbox.setNegativeButton("NO", DialogInterface.OnClickListener { dialog, which ->

                })
                alertbox.show()
            }


        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {

        var myId = item!!.itemId

        when(myId){
            R.id.item_toast ->
            { Toast.makeText(this,"CONTEXT menu toast ",Toast.LENGTH_LONG).show()}



        }
        return super.onContextItemSelected(item)
    }

}
