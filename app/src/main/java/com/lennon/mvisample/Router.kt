package com.lennon.mvisample

import android.os.Bundle
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity


interface Router {
    fun openActivity(
        route: String,
        @IntegerRes flags: Int,
        args: Map<String, Bundle>? = null
    )

    fun getActivityName(route: String): Class<out AppCompatActivity>
}
