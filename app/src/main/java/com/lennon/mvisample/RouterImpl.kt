package com.lennon.mvisample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class RouterImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : Router {
    override fun openActivity(
        route: String,
        @IntegerRes flags: Int,
        args: Map<String, Bundle>?,
    ) {
        val activityName = getActivityName(route)
        val intent = Intent(context, activityName).apply {
            setFlags(flags)
            args?.apply {
                map {
                    putExtra(it.key, it.value)
                }
            }
        }
        context.startActivity(intent)
    }

    override fun getActivityName(route: String): Class<out AppCompatActivity> {
        if (route == "/main2") {
            return MainActivity2::class.java
        }

        return MainActivity::class.java
    }
}