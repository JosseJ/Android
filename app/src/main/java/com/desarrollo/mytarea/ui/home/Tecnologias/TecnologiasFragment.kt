package com.desarrollo.mytarea.ui.home.Tecnologias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.desarrollo.mytarea.R
import com.desarrollo.mytarea.databinding.FragmentTecnologiasBinding
import com.desarrollo.mytarea.databinding.FragmentUTPLBinding

class TecnologiasFragment : Fragment() {

    private var _binding: FragmentTecnologiasBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTecnologiasBinding.inflate(inflater, container, false)

        return binding.root
    }



}


