package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation2.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private val args: SecondFragmentArgs by navArgs() //Previamente he creado en el nav_graph.xml un argumento para este fragment
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contador = args.myContador
        binding.tvFrag2.text=contador.toString()//Recepcion de argumentos con safe args

        val name = args.myName
        binding.tvFrag2Name.text = name


        binding.btnFrag2Atras.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_initFragment,null)
        }

        binding.btnFrag2Siguiente.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment,null)
        }
    }
}