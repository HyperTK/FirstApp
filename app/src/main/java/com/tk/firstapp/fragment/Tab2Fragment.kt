package com.tk.firstapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tk.firstapp.databinding.Tab2fragmentBinding

class Tab2Fragment : Fragment() {
    private lateinit var binding: Tab2fragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Tab2fragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}