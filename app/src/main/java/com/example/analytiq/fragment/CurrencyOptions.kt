package com.example.analytiq.fragment


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout

import com.example.analytiq.R
import com.example.analytiq.activity.CurrencyConversion

/**
 * A simple [Fragment] subclass.
 */
class CurrencyOptions : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_currency_options, container, false)

        view.findViewById<RelativeLayout>(R.id.currency_card).setOnClickListener {
            startActivity(Intent(activity as Context,CurrencyConversion::class.java))
        }

        return view
    }


}
