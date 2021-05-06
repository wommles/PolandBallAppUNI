package com.example.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import android.widget.TextView
import java.util.Random


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class qScreenA : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.qScreenA, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    private fun displayChoices(view: View){
        var countries = arrayOf(R.drawable.Belgium, R.drawable.Burundi, R.drawable.France, R.drawable.Ireland, R.drawable.Poland )
        val rand = Random()
        var n = rand.nextInt(countries.size)
        var img = view.findViewById<ImageView>(R.id.mainCB)
        img.setImageResource(countries[n])

    }
}