package com.dratius.gads

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.loader.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loader)
        val screenFilter = PorterDuffColorFilter(
            Color.rgb(34, 34, 34),
            PorterDuff.Mode.SCREEN
        )
        supporters.colorFilter = screenFilter
        banner.colorFilter = screenFilter
        logo.colorFilter = screenFilter
        loader.colorFilter = screenFilter

        loader.setBackgroundResource(R.drawable.loader_animation)
        val load = loader.background as AnimationDrawable
        load.start()

    }
}