package com.dunchi.android_view.adapter.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dunchi.android_view.R
import kotlinx.android.synthetic.main.listview_data.view.*

class RecyclerViewAdapter(private val datas: List<RecyclerViewData>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>(){

    class RecyclerViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val imageView = item.findViewById<ImageView>(R.id.img)
        val textView = item.findViewById<TextView>(R.id.text)

        fun bind(data: RecyclerViewData){
            imageView.setImageResource(data.res)
            textView.text = data.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_data, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}