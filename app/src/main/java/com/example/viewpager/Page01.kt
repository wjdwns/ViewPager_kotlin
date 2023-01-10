package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.FragmentPage01Binding

class Page01 : Fragment() {
    private lateinit var binding: FragmentPage01Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPage01Binding.inflate(inflater, container, false)

        return binding.root
    }

}