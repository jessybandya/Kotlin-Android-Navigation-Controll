package com.example.navigation_controll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val tvName = view.findViewById<TextView>(R.id.name)
        val tvAge = view.findViewById<TextView>(R.id.age)
        val tvSchool = view.findViewById<TextView>(R.id.school)
        tvName.text = arguments?.getString("name")
        tvAge.text = arguments?.getInt("age").toString()
        tvSchool.text = arguments?.getString("school")
        return view
    }


}