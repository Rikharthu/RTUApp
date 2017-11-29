package com.example.rikharthu.rtuapp

import com.example.rikharthu.rtuapp.api.models.AccessTokenResponse
import com.example.rikharthu.rtuapp.api.models.params.AccessTokenRequestParams
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RTUApiService {

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST
    fun getAccessToken(@Body params: AccessTokenRequestParams): Call<AccessTokenResponse>

}