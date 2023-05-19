package com.example.onlineshop.network

import okhttp3.OkHttpClient

class BaseClient {

    fun getClient(): OkHttpClient {
        return OkHttpClient()
    }

}