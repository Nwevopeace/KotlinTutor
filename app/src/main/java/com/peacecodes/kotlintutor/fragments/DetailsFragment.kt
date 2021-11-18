package com.peacecodes.kotlintutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.peacecodes.kotlintutor.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)

        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        val bundle = arguments
        binding.detailsTopic.text = bundle?.getString("TOPIC")
        binding.detailText.text = getString(bundle!!.getInt("DETAILS"))
        binding.image.setImageResource(bundle.getInt("IMAGES"))

        return binding.root
    }
}