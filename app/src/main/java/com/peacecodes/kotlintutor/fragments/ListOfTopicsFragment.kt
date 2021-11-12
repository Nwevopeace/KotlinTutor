package com.peacecodes.kotlintutor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.kotlintutor.adapter.RecyclerAdapter
import com.peacecodes.kotlintutor.data.DataSource
import com.peacecodes.kotlintutor.databinding.FragmentListOfTopicsBinding
import com.peacecodes.kotlintutor.model.KotlinFundamentals

class ListOfTopicsFragment : Fragment() {

    private lateinit var binding: FragmentListOfTopicsBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var myData: List<KotlinFundamentals>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListOfTopicsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.apply {
            myData = DataSource().loadKotlinFundamentals()
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            adapter = RecyclerAdapter(this, myData)
        }

    }
}