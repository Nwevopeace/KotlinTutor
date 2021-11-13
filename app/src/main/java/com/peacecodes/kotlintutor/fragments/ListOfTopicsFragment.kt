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
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = RecyclerAdapter(DataSource().loadKotlinFundamentals())
        }

    }
}