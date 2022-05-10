package com.example.qrdemo.model

data class Phone(
    var id: Int,
    var date: Long,
    var type: TypeQR,
    var value: String,
    var numberPhone : String
    ) :
    QR(id, date, type, value) {
}