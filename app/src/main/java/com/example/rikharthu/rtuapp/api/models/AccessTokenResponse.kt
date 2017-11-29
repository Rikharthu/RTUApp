package com.example.rikharthu.rtuapp.api.models

data class AccessTokenResponse(
        val scope: String = "",
        val expires_in: Long = -1,
        val token_type: String = "",
        val refresh_token: String = "",
        val access_token: String = ""
)