package com.example.qrdemo.model

open class QR(
    private var id: Int,
    private var date: Long,
    private var type: TypeQR,
    private var value : String
)

enum class TypeQR {
    WIFI,
    TEXT,
    PHONE

}
