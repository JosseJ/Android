package com.desarrollo.mytarea.ui.home.utpl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.desarrollo.mytarea.databinding.FragmentUTPLBinding

class UTPLFragment : Fragment() {

    private var _binding: FragmentUTPLBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUTPLBinding.inflate(inflater, container, false)

        return binding.root
    }

}