package com.tk.firstapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tk.firstapp.databinding.FragmentContents2Binding


/**
 * A simple [Fragment] subclass.
 * Use the [contentsFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentsFragment2 : Fragment() {
    private lateinit var binding: FragmentContents2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContents2Binding.inflate(inflater, container, false)
        return binding.root
    }

}