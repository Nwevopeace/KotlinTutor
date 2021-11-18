package com.peacecodes.kotlintutor.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.databinding.ListItemBinding

class RecyclerAdapter() :
RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){

   inner class MyViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

       fun bindItem(position: Int) {
           binding.topicText.text = Topic[position]

           binding.cardView.setOnClickListener {
               val topic = Topic[position]
               val detail = Details[position]
               val image = Images[position]
               val bundle = Bundle()
               bundle.putString("TOPIC", topic)
               bundle.putInt("DETAILS", detail)
               bundle.putInt("IMAGES", image)
               Navigation.findNavController(binding.root)
                   .navigate(R.id.action_listOfTopicsFragment_to_detailsFragment, bundle)
           }

       }
   }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bindItem(position)

    }

    override fun getItemCount() = Topic.size

    companion object{
        var Topic = arrayListOf("Kotlin Introduction", "Kotlin Variables", "Kotlin Comments", "Kotlin Data Types", "Kotlin Operators", "Kotlin Arrays", "Kotlin Ranges",
            "Kotlin Strings", "Kotlin Booleans", "Kotlin Functions", "Kotlin Classes and Objects", "Kotlin Syntax", "Kotlin Constructors", "Kotlin Loops", "Kotlin OOP")

        var Details = arrayListOf(R.string.Details1, R.string.Details2, R.string.Details3, R.string.Details4, R.string.Details5,
            R.string.Details6, R.string.Details7, R.string.Details8, R.string.Details9, R.string.Details10, R.string.Details11,
            R.string.Details12, R.string.Details13, R.string.Details14, R.string.Details15)

        var Images = arrayListOf(R.drawable.intro, R.drawable.variables, R.drawable.comments, R.drawable.data_types, R.drawable.operators,
            R.drawable.arrays, R.drawable.ranges, R.drawable.strings, R.drawable.boolan, R.drawable.functions, R.drawable.class_object, R.drawable.syntax,
            R.drawable.constructors, R.drawable.loops, R.drawable.oop)
    }

}