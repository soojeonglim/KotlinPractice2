package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    // 앱이 최소 실행되었을때 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결

        tv_title.setText("Hello World..!")  // .setText : 텍스트의 값을 변경해줌

        btn_getText.setOnClickListener {    // et_id에 입력되어있는 값을 가지고와서 텍스트뷰에 뿌림
            var resultText = et_id.text.toString()  // et_id에 입력되어있는값을 string 형태로 가져옴
            tv_result.setText(resultText)   // 입력된 값을 tv_result에 set 해줌
        }
    }
}