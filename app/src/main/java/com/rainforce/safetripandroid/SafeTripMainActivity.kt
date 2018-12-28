package com.rainforce.safetripandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rainforce.safetripandroid.ui.safetripmain.SafeTripMainFragment

class SafeTripMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.safe_trip_main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SafeTripMainFragment.newInstance())
                    .commitNow()
        }
    }

}
