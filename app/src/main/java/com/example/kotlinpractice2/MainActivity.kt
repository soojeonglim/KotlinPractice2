package com.example.kotlinpractice2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    // 앱이 최소 실행되었을때 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결

        // TextView
        tv_title.setText("Hello World..!")  // .setText : 텍스트의 값을 변경해줌

        // EditText&Button
        btn_getText.setOnClickListener {    // et_id에 입력되어있는 값을 가지고와서 텍스트뷰에 뿌림
            var resultText = et_id.text.toString()  // et_id에 입력되어있는값을 string 형태로 가져옴
            tv_result.setText(resultText)   // 입력된 값을 tv_result에 set 해줌
        }

        // Intent 화면이동 및 데이터 전달
        btn_a.setOnClickListener {
            // var : 변수, 값이 언제든기 변경 될 수 있음
            // val : 자바에서는 final, 값이 변경되지 목하는 변수

            val intent = Intent(this, SubActivity::class.java)  // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg",tv_sendMsg.text.toString())   // Hello World 라는 텍스트 값을 담은 뒤 msg라는 키로 잠굼
            startActivity(intent)   // intent에 저장되어있는 액티비티 쪽으로 이동한다.
            //finish()    // 자기 자신 액티비티를 파괴한다.
        }
    }
}