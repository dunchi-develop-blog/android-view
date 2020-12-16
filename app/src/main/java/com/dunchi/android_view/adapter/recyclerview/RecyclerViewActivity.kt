package com.dunchi.android_view.adapter.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dunchi.android_view.R

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerViewAdapter = RecyclerViewAdapter(initData())
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = recyclerViewAdapter
    }

    fun initData(): List<RecyclerViewData>{
        var datas = listOf<RecyclerViewData>(RecyclerViewData("아이즈원",R.drawable.izone),
            RecyclerViewData("아이즈원",R.drawable.izone),RecyclerViewData("아이즈원",R.drawable.izone),
            RecyclerViewData("아이즈원",R.drawable.izone),RecyclerViewData("아이즈원",R.drawable.izone))
        return datas
    }
}
