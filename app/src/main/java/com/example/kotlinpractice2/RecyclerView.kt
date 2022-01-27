package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class recyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val profileList = arrayListOf(
            // arrayListOf : () 안에 리스트 형태의 객체들을 계속 넣어줌
            Profiles(R.drawable.man, "홍드로이드", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "임수정", 24, "안드로이드 앱 초보 개발자"),
            Profiles(R.drawable.woman, "양유경", 24, "안드로이드 앱 초보 개발자")
        )

        rv_proflie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)  // this : 현재 자기 자신의 context를 가져옴, context : 액티비티가 담고 있는 모든 정보를 가리킴
        rv_proflie.setHasFixedSize(true)    // 리사이클뷰에 대한 성능 개선 방안

        rv_proflie.adapter = ProfileAdapter(profileList)
    }

}