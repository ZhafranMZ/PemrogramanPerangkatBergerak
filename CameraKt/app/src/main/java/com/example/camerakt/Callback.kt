package com.example.camerakt

import android.graphics.Bitmap

interface MainActivityCallback {
    fun updateImageView(imageBitmap : Bitmap)
    fun showUploadButton()
}