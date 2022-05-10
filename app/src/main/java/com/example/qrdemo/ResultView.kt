package com.example.qrdemo

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.qrdemo.databinding.ViewPhoneBinding
import com.example.qrdemo.model.Phone

class ResultView(context: Context, private var phone: Phone) : ConstraintLayout(context) {
    private var binding: ViewPhoneBinding =
        ViewPhoneBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        initView()
    }

    private fun initView() {
        binding.apply {
            tvDate.text = phone.date.toString()
            tvNumber.text = phone.numberPhone
            tvID.text = phone.id.toString()
            tvType.text = phone.type.toString()
            tvValue.text = phone.value
            Log.d("iamquan1705", "PhoneView = ${phone.numberPhone}")
        }

    }


}