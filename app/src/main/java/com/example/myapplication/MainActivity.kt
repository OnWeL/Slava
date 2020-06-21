package com.example.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    var wick=0
    var ifer = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Air("Expert")
    }

    fun Air(Bund:String){
        Toast.makeText(this,Bund,Toast.LENGTH_LONG)
        wick=5
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun ClickClack(Madara: View){
       var a90=ObjectAnimator.ofFloat(Madara,View.ROTATION_Y,0f,90f)
        Madara.scaleY=1f
        a90.setDuration(500)

        a90.addListener(object: Animator.AnimatorListener
        {
            override fun onAnimationRepeat(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?) {
                if(!ifer) {
                    var local = GradientDrawable()
                    local.shape = GradientDrawable.OVAL
                    local.setColor(Color.WHITE)
                    var Hadara = findViewById<ImageView>(R.id.image_Madara)
                    Hadara.setBackgroundDrawable(local)
                    var text = findViewById<TextView>(R.id.text)
                    text.alpha = 1f
                    var a90 = ObjectAnimator.ofFloat(Madara, View.ROTATION_Y, 90f, 180f)
                    Madara.scaleY = 1f
                    a90.setDuration(500)
                    a90.start()
                    ifer = true
                }
                else{
                    var Hadara = findViewById<ImageView>(R.id.image_Madara)
                    Hadara.setBackgroundResource(R.drawable.a6)
                    var text = findViewById<TextView>(R.id.text)
                    text.alpha = 0f
                    var a90 = ObjectAnimator.ofFloat(Madara, View.ROTATION_Y, 90f, 180f)
                    Madara.scaleY = 1f
                    a90.setDuration(500)
                    a90.start()
                    ifer = false
                }
            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationStart(p0: Animator?) {

            }

        })
        a90.repeatMode = ValueAnimator.REVERSE
        a90.start()
    }
}