package com.quyt.iot_demo.data.response

import com.google.gson.annotations.SerializedName
import com.quyt.iot_demo.model.User

class LoginResponse : BaseResponse() {
    @SerializedName("data")
    var data: User? = null
}