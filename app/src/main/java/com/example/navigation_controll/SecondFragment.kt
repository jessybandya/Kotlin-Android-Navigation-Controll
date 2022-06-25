

package com.example.navigation_controll

import android.app.ActionBar
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.SupportActionModeWrapper
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController


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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = view.findViewById<Toolbar>(R.id.toolBar)
        toolbar.setTitle("Title two!")
        toolbar.setSubtitle("subtitle");

        view.findViewById<Toolbar>(R.id.toolBar)
            .setupWithNavController(navController, appBarConfiguration)
        super.onViewCreated(view, savedInstanceState)
    }



}