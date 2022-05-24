package com.example.mainhome

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class A(private val c: Context) : PagerAdapter() {
    //LayoutInflater에 대한 정보를 담음
    private lateinit var li: LayoutInflater

    //이미지 정보를 배열 형식으로 담음
    val i = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
    )

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    //사용 가능한 뷰의 개수를 반환함
    override fun getCount(): Int {
        return i.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //context에서 LayoutInflater를 가져옴
        li = c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        //image.xml 파일의 정의된 내용을 가지고 LayoutInflater를 이용하여 새로운 뷰를 생성
        val v = li!!.inflate(R.layout.image, null)
        //새로운 뷰의 iv라는 아이디 값을 가진 ImageView 참조
        val iv = v.findViewById<View>(R.id.iv) as ImageView
        //배열에 담긴 이미지 중 position 값에 해당되는 이미지로 설정
        iv.setImageResource(i[position])
        //ViewPager에 만들어낸 view를 더함
        container.addView(v, 0)
        //이미지가 설정된 view의 정보를 반환함
        return v
    }
    // 1.5 초 간격으로 배너 페이지 넘어감
    private val intervalTime = 1500.toLong()

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.invalidate()
    }
}