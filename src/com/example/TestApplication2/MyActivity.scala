package com.example.TestApplication2

import android.app.Activity
import android.os.Bundle

class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    override def onCreate( savedInstanceState:Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}
