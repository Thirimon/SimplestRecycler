package com.example.simplestrecycler.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simplestrecycler.R
import com.example.simplestrecycler.model.Affirmation

class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) :RecyclerView.ViewHolder(view){
        val textView:TextView=view.findViewById(R.id.item_title)
        val imageView:ImageView=view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=dataset[position]
        holder.textView.text=context.resources.getString(item.stringResourseId)
        holder.imageView.setImageResource(item.imageResourseId)
    }

}