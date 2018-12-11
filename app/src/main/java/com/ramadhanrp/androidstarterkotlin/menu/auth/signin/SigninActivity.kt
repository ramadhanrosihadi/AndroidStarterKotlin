package com.ramadhanrp.androidstarterkotlin.menu.auth.signin

import android.content.Intent
import android.os.Bundle
import com.ramadhanrp.androidstarterkotlin.R
import com.ramadhanrp.androidstarterkotlin.core.base.BaseActivity
import com.ramadhanrp.androidstarterkotlin.data.api.AuthApi
import com.ramadhanrp.androidstarterkotlin.menu.MainActivity
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SigninActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        setupView()
    }

    fun setupView(){
        buttonLogin.setOnClickListener{
            startActivity(Intent(this@SigninActivity, MainActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            })

            val authApi = AuthApi()

            GlobalScope.launch(Dispatchers.Main) {
                val user = authApi.signin(fieldEmail.text.toString(),
                    fieldPassword.text.toString()).await()
                tvContent.text = user.toString()
            }
        }
    }
}
