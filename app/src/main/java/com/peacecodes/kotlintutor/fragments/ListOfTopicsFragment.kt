package com.peacecodes.kotlintutor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.kotlintutor.adapter.RecyclerAdapter
import com.peacecodes.kotlintutor.databinding.FragmentListOfTopicsBinding

class ListOfTopicsFragment : Fragment() {

    private lateinit var binding: FragmentListOfTopicsBinding
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentListOfTopicsBinding.inflate(inflater, container, false)
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layoutManager = LinearLayoutManager(activity)
        adapter = RecyclerAdapter()

        binding?.recyclerView?.layoutManager = layoutManager
        binding?.recyclerView?.adapter = adapter


    }
}