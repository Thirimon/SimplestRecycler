package com.example.simplestrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(val data:List<Int>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(val row: View):RecyclerView.ViewHolder(row){
       val txtView=row.findViewById<TextView>(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
     val layout=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MyViewHolder(layout)
    }

    override fun getItemCount(): Int =data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    holder.txtView.text=data.get(position).toString()
    }
}