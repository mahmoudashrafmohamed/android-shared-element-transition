package com.mahmoud_ashraf.sharedelementstransitiondemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun loadNext(v : View){
        val activityOptionsCompat =
            ActivityOptionsCompat.makeSceneTransitionAnimation(this, imageM, "imageMain")
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity (intent, activityOptionsCompat.toBundle())
    }
}