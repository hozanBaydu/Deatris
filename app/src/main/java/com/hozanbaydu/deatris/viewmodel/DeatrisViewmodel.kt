package com.hozanbaydu.deatris.viewmodel

import android.content.Context
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.hozanbaydu.deatris.view.JoinFragmentDirections

class DeatrisViewmodel: ViewModel() {


    fun joinBeta(nameText: EditText,mailText: EditText,cityText: EditText,phoneText: EditText
                 ,nacController: NavController,context: Context){

        if (nameText.text.isNotEmpty() && mailText.text.isNotEmpty() && cityText.text.isNotEmpty()&& phoneText.text.isNotEmpty()) {

            nacController.navigate(JoinFragmentDirections.actionJoinFragmentToMainFragment())
            Toast.makeText(context,"Kaydolduğunuz için teşekkür ederiz",Toast.LENGTH_SHORT).show()

        }else{

            Toast.makeText(context,"Lütfen tüm alanları doldurun",Toast.LENGTH_SHORT).show()

        }

    }


}