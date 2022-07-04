package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navigation2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var cont = 0
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvCont1.setText(arguments?.getString("Contador"))

        binding.btnfrag1Atras.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstFragment_to_initFragment, null)
        }
    }
}