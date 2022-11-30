package com.tk.firstapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tk.firstapp.databinding.Tab3fragmentBinding

class Tab3Fragment : Fragment() {
    private lateinit var binding: Tab3fragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Tab3fragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}