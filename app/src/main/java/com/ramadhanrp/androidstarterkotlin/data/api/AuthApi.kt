package com.ramadhanrp.androidstarterkotlin.data.api

import com.ramadhanrp.androidstarterkotlin.model.Response
import com.ramadhanrp.androidstarterkotlin.model.User
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApi {

    @POST("login")
    @FormUrlEncoded
    fun signin(@Field("nomor_hp") email: String,
               @Field("password") password: String): Deferred<Response>

    companion object {
        operator fun invoke(): AuthApi{
            val okHttpClient = OkHttpClient.Builder().build()
            val retrofit = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://103.20.91.229")
            return AuthApi()
        }
    }
}