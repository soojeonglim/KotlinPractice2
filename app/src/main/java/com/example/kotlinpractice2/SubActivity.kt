package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if(intent.hasExtra("msg")) {    // .hasExtra : intent안에 있던 객체에서 "msg"라는 객체를 찾아라 그리고 있으면 to do를 실행
            tv_getMsg.text = intent.getStringExtra("msg")    // SubActivity의 존재하는 tv_getMsg에 Hello World가 넘겨져 옴
            // MainActivity에서 intent.putExtra("msg",tv_sendMsg.text.toString()) 해줬으므로 getExtra()가 아닌 getStringExtra()로 해줌
        }
    }
}