package com.anncode.randomimages

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private var urlImage: String? = null

    fun callUrlImage(): String? {
        if (urlImage == null){
            urlImage = randomNumbersUrl()
        }

        return urlImage
    }

    fun randomNumbersUrl() : String {
        return "https://picsum.photos/${(3..5).random()}00/${(3..5).random()}00"
    }

}