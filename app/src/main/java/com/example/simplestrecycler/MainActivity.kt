package com.example.simplestrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplestrecycler.adapter.ItemAdapter
import com.example.simplestrecycler.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv=findViewById<RecyclerView>(R.id.iv)
        val myDataset=Datasource().loadaffirmations()
        //rv.layoutManager=LinearLayoutManager(this)
        //rv.adapter=MyAdapter((1..200).toList())
        rv.adapter=ItemAdapter(this,myDataset)
        rv.setHasFixedSize(true)
    }
}