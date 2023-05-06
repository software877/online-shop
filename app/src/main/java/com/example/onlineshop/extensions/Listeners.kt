package com.example.onlineshop.extensions

import android.view.View

class Listeners {
}

fun View.onClick(listener: View.OnClickListener) {
    this.setOnClickListener(listener)
}