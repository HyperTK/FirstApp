package com.tk.firstapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tk.firstapp.R
import com.tk.firstapp.databinding.FragmentContents3Binding


/**
 * A simple [Fragment] subclass.
 * Use the [ContentsFragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentsFragment3 : Fragment() {
    private lateinit var binding: FragmentContents3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContents3Binding.inflate(inflater, container, false)
        return binding.root
    }

}