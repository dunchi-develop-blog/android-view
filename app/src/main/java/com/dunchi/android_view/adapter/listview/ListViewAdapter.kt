package com.dunchi.android_view.adapter.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.dunchi.android_view.R

public class ListViewAdapter(var context: Context, var datas: List<ListViewData>) : BaseAdapter(){

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var layoutInflater = LayoutInflater.from(context)
        var view = layoutInflater.inflate(R.layout.listview_data,null)
        var imgView = view.findViewById(R.id.img) as ImageView
        var textView = view.findViewById(R.id.text) as TextView

        imgView.setImageResource(datas.get(p0).res)
        textView.text = datas.get(p0).text

        return view
    }

    override fun getItem(p0: Int): Any {
        return datas.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return datas.size
    }

}