package com.example.kotlinpractice2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// ArrayList<Profiles> : Profiles클래스를 불러와서 리스트화 시킴, RecyclerView.Adapter : RecyclerView에서 Adapter 속성 불러옴
class ProfileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {
        // .context : 액티비티에서 담고 있는 모든 정보, parent.context : 어댑터랑 연경될 액티비의 context를 가져옴
        // .inflate : 붙이다, parent : 두번째 속성
        // view는 list_item에 대한것을 끌고와서 어댑터에 붙여주는 역할을 함
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        // 결과적으로 CustomViewHolder(view)가 실행되면 아래있는 itemView가 view가 됨
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition // 클릭한 것의 혐재 위치
                val profile: Profiles = profileList.get(curPos) // 프로필을 클릭할떄 위치 값에 있는 텍스트 데이터들을 객체 형태로 가져옴
                Toast.makeText(parent.context,"이름: ${profile.name}\n나이 : ${profile.age}\n직업 : ${profile.job}", Toast.LENGTH_SHORT).show()

            }
        }
    }

    // onCreateViewHolder로 만들어진 view를 가져다가 Bind(연결해줌)
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.gender.setImageResource(profileList.get(position).gender)
        //holder.name.text = profileList.get(position).name
    }

    // 리스트들에 대한 총 개수
    override fun getItemCount(): Int {
        return profileList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {    // View에 대해서 꽉 잡아주는 역할
        val gender = itemView.findViewById<ImageView>(R.id.iv_prifile_rv)  // 성별, .findViewById : 특정 xml에서 id값들을 찾아올 수 있음
        val name = itemView.findViewById<ImageView>(R.id.tv_name)   // 이름
        val age = itemView.findViewById<ImageView>(R.id.tv_age)   // 나이
        val job = itemView.findViewById<ImageView>(R.id.tv_job)   // 직업
    }

}