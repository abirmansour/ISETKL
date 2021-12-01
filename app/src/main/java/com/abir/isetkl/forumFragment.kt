package com.abir.isetkl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class forumFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_forum, container)

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            forumFragment().apply {
                arguments = Bundle().apply { }
            }
    }
}