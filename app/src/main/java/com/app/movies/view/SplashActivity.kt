package com.app.movies.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.app.movies.R
import com.app.movies.repository.PreferenceRepository

/**
 * Initial screen, handles the result of persistent data
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
//            if(PreferenceRepository(applicationContext).getIsViewingDetails()) {
//                startActivity(Intent(this, DetailsActivity::class.java))
//            } else {
                startActivity(Intent(this, SearchActivity::class.java))
//            }

            finish()
        }, 1000)
    }
}