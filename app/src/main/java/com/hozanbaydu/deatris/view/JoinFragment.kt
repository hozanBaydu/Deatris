package com.hozanbaydu.deatris.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.hozanbaydu.deatris.R
import com.hozanbaydu.deatris.databinding.FragmentJoinBinding
import com.hozanbaydu.deatris.viewmodel.DeatrisViewmodel

class JoinFragment:Fragment(R.layout.fragment_join) {

    private var fragmentBinding : FragmentJoinBinding? = null
    lateinit var viewModel: DeatrisViewmodel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(DeatrisViewmodel::class.java)

        val binding = FragmentJoinBinding.bind(view)
        fragmentBinding = binding




        binding.sendButton.setOnClickListener {
            viewModel.joinBeta(binding.nameText,binding.mailText,binding.cityText,binding.phoneText,findNavController(),requireContext())


        }






    }
}