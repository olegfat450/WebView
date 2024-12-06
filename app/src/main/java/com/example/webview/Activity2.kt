package com.example.webview

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var webTv: WebView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

        toolbar = findViewById(R.id.toolbar)
        webTv = findViewById(R.id.webTv)

        setSupportActionBar(toolbar)
        toolbar.setTitleMarginStart(120)
        toolbar.setTitleTextColor(Color.WHITE)
        title = "Мобильный браузер"

        webTv.webViewClient = WebViewClient()

        val Uri = intent.getStringExtra("key1") as String




            webTv.loadUrl(Uri)






    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_exit,menu)
        return super.onCreateOptionsMenu(menu) }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finishAffinity()
        return super.onOptionsItemSelected(item) }

}