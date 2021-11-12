package com.peacecodes.kotlintutor.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.model.KotlinFundamentals

class RecyclerAdapter(private val context: RecyclerView, private val data: List<KotlinFundamentals>) :
RecyclerView.Adapter<RecyclerAdapter.MyViewholder>(){

//    private val clickHandler: ClickEventHandler = context as ClickEventHandler

    class MyViewholder(view: View) : RecyclerView.ViewHolder(view){
        val topicText = view.findViewById<TextView>(R.id.topic_text)
//        val detailsText = view.findViewById<TextView>(R.id.details_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
//        adapterLayout.setOnClickListener{
//            navController(context).navigate(R.id.fragment_details)
//        }
        return MyViewholder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val item = data[position]
        holder.topicText.text = context.resources.getString(item.Topic)
//        holder.detailsText.text = context.resources.getString(item.Details)
    }

    override fun getItemCount() = data.size

    interface ClickEventHandler {
        fun viewDetails(holder: View)
    }
}