package com.example.navigation_controll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.secondButton).setOnClickListener{
            var name = "Jaby Boy"
            var age = 22
            var school = "University Of Nairobi"
            val bundle = bundleOf("name" to name,"age" to age, "school" to school)
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }


        view.findViewById<Button>(R.id.thirdButton).setOnClickListener{
            view.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }


        return view
    }


}