package com.example.webview

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

      private lateinit var toolbar: Toolbar
      private lateinit var gridview: GridView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        init()

        val list = Base().database
        val adapter = GridViewAdapter(list, this)
        gridview.adapter = adapter



              gridview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

                  val intent = Intent(this, Activity2::class.java)
                  intent.putExtra("key1", list[position].name)

                  startActivity(intent)
              }

    }


      fun init(){

          toolbar = findViewById(R.id.toolbar)
          setSupportActionBar(toolbar)
          toolbar.setTitleMarginStart(120)
          title = "Мобильный браузер"
          toolbar.setTitleTextColor(Color.WHITE)
          toolbar.setLogo(R.drawable.baseline_alternate_email_24)
          gridview = findViewById(R.id.gridview)


      }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_exit,menu)
        return super.onCreateOptionsMenu(menu) }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finishAffinity()
        return super.onOptionsItemSelected(item) }

}




