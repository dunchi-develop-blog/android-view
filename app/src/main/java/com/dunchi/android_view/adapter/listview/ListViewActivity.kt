package com.dunchi.android_view.adapter.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.dunchi.android_view.R
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var datas = initData()
        var adapter = ListViewAdapter(this,datas)
        listView.adapter = adapter
        listView.setOnClickListener(listViewOnClickListener)
    }

    val listViewOnClickListener: View.OnClickListener = View.OnClickListener {
        Toast.makeText(this,"Click!",Toast.LENGTH_SHORT).show()
    }

    fun initData(): List<ListViewData>{
        var datas = listOf<ListViewData>(ListViewData("아이즈원",R.drawable.izone),
            ListViewData("아이즈원",R.drawable.izone),ListViewData("아이즈원",R.drawable.izone),
            ListViewData("아이즈원",R.drawable.izone),ListViewData("아이즈원",R.drawable.izone))
        return datas
    }
}
