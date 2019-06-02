package com.anwesh.uiprojects.linkedballbitriangleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.ballbitriangleview.BallBiTriangleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BallBiTriangleView.create(this)
    }
}
