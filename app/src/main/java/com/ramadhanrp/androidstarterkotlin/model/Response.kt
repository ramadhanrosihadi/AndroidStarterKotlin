package com.ramadhanrp.androidstarterkotlin.model
import org.json.JSONObject

data class Response(val response_code: Int = 0,
                    val message: String = "",
                    val data: Any)