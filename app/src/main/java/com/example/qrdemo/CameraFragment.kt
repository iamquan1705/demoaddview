package com.example.qrdemo

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.core.R
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.qrdemo.databinding.FragmentCameraBinding
import com.example.qrdemo.model.Phone
import com.example.qrdemo.model.TypeQR
import java.util.*

class CameraFragment : Fragment() {
    private lateinit var binding: FragmentCameraBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCameraBinding.inflate(inflater, container, false)

        binding.btnSAve.setOnClickListener {
            onClick()
        }

        return binding.root
    }

    private fun onClick() {
        var number  = binding.edtPhone.text.toString()
        var value = binding.edtValue.text.toString()
        var date = Calendar.getInstance().timeInMillis
        var phone = Phone(id =1,date = date,type = TypeQR.PHONE,value = value,numberPhone = number)
        (activity as MainActivity).addFragment(ResultFragment(phone))
    }


}