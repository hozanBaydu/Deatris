package com.hozanbaydu.deatris.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hozanbaydu.deatris.R
import com.hozanbaydu.deatris.adapter.Adapter
import com.hozanbaydu.deatris.databinding.FragmentMainBinding
import com.hozanbaydu.deatris.model.Images

class MainFragment:Fragment(R.layout.fragment_main) {

    private var fragmentBinding : FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMainBinding.bind(view)
        fragmentBinding = binding

        var imageList=ArrayList<Images>()
        val image1= Images(R.drawable.image1)
        val image2= Images(R.drawable.image2)
        val image3= Images(R.drawable.image3)
        val image4= Images(R.drawable.image4)
        imageList.add(image1)
        imageList.add(image2)
        imageList.add(image3)
        imageList.add(image4)


        binding.recyclerView.layoutManager= LinearLayoutManager(requireContext())
        val Adapter= Adapter(imageList)
        binding.recyclerView.adapter=Adapter

        binding.imageButton.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToJoinFragment())
        }



    }


}