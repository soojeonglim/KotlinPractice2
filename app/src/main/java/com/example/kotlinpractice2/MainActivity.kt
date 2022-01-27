package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    // 앱이 최소 실행되었을때 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결

        tv_title.setText("Hello World..!")  // .setText : 텍스트의 값을 변경해줌

    }
}