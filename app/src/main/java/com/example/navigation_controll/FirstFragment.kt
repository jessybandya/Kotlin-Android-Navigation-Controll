package com.example.navigation_controll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.CollapsingToolbarLayout


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
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment2, bundle)
        }


        view.findViewById<Button>(R.id.thirdButton).setOnClickListener{
            view.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment2)
        }
        val toolbar = view.findViewById<Toolbar>(R.id.toolBar)
        toolbar.setTitle("My title")
        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)


        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = view.findViewById<Toolbar>(R.id.toolBar)
        val layout = view.findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbarLayout)
        layout.setupWithNavController(toolbar, navController, appBarConfiguration)
        super.onViewCreated(view, savedInstanceState)
    }


}