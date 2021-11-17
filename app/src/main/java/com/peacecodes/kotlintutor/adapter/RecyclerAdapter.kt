package com.peacecodes.kotlintutor.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.fragments.ListOfTopicsFragmentDirections
import com.peacecodes.kotlintutor.model.KotlinFundamentals

class RecyclerAdapter(private val data: List<KotlinFundamentals>) :
RecyclerView.Adapter<RecyclerAdapter.MyViewholder>(){

    class MyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView){

            val topicText = itemView.findViewById<TextView>(R.id.topic_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewholder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
       holder.topicText.text = data[position].Topic
        holder.itemView.setOnClickListener { view ->
            val action = ListOfTopicsFragmentDirections.actionListOfTopicsFragmentToDetailsFragment(data[position])
            view.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = data.size

}