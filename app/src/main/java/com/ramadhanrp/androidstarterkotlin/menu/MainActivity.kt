package com.ramadhanrp.androidstarterkotlin.menu

import android.os.Bundle
import com.ramadhanrp.androidstarterkotlin.R
import com.ramadhanrp.androidstarterkotlin.core.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample_text.text = ""
    }
}
