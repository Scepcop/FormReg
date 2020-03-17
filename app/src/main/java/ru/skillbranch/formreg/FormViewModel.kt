package ru.skillbranch.formreg

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel: ViewModel()  {

    private val usernameL = MutableLiveData<String>()
    private val phoneL = MutableLiveData<String>()
    private val emailL = MutableLiveData<String>()


    var username = ""
        set(value) {
            field = value
        }

    var phone = ""
        set(value) {
            field = value
        }

    var email = ""
        set(value) {
            field = value
        }
}