package com.ramadhanrp.androidstarterkotlin.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("alamat")
    var alamat: String,
    @SerializedName("created_at")
    var createdAt: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("foto")
    var foto: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("id_mitra")
    var idMitra: String,
    @SerializedName("jenis_kelamin")
    var jenisKelamin: String,
    @SerializedName("jenis_mitra")
    var jenisMitra: String,
    @SerializedName("jenis_user")
    var jenisUser: String,
    @SerializedName("kadaluarsa")
    var kadaluarsa: String,
    @SerializedName("kode_referral")
    var kodeReferral: String,
    @SerializedName("komisi")
    var komisi: String,
    @SerializedName("nama_bank")
    var namaBank: String,
    @SerializedName("nama_rekening")
    var namaRekening: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("nomor_hp")
    var nomorHp: String,
    @SerializedName("nomor_ktp")
    var nomorKtp: String,
    @SerializedName("nomor_rekening")
    var nomorRekening: String,
    @SerializedName("nomor_telepon")
    var nomorTelepon: String,
    @SerializedName("referrer")
    var referrer: String,
    @SerializedName("referrer_name")
    var referrerName: String,
    @SerializedName("tanggal_lahir")
    var tanggalLahir: String,
    @SerializedName("tempat_lahir")
    var tempatLahir: String,
    @SerializedName("token")
    var token: String
)