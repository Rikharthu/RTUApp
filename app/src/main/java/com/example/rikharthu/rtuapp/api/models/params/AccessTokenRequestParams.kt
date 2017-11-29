package com.example.rikharthu.rtuapp.api.models.params

data class AccessTokenRequestParams(
        val client_id: String,
        val client_secret: String,
        val grant_type: String,
        val redirect_uri: String
)