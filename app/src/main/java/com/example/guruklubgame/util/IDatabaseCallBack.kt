package com.example.guruklubgame.util

interface IDatabaseCallBack {
    fun onSuccessDB(result : Any, optName : String)
    fun onFailedDB(result : Any, optName : String)
}