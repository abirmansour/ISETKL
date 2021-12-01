package com.abir.isetkl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class mapsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {

        return inflater.inflate(R.layout.fragment_maps,container )
    }
    companion object{
        @JvmStatic
        fun newInstance() =
            mapsFragment().apply {
                arguments = Bundle().apply {  }
            }
    }
}