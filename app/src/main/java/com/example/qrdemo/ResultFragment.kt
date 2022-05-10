package com.example.qrdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.qrdemo.databinding.FragmentResultBinding
import com.example.qrdemo.model.Phone
import com.example.qrdemo.model.QR

class ResultFragment(private var qr: QR) : Fragment() {

    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(inflater, container, false)

        if (qr is Phone) {
            val qrPHone = qr as Phone
            val result: ResultView = ResultView(requireContext(), qrPHone)
            binding.llResult.addView(result)
            Log.d("iamquan1705","PhoneFr = ${qrPHone.numberPhone}")
        }



        return binding.root
    }
}