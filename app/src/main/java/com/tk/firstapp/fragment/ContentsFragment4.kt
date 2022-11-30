package com.tk.firstapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tk.firstapp.databinding.FragmentContents4Binding

/**
 * A simple [Fragment] subclass.
 * Use the [ContentsFragment4.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentsFragment4 : Fragment() {
    private lateinit var binding: FragmentContents4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContents4Binding.inflate(inflater, container, false)
        return binding.root
    }
}