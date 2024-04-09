package com.example.cleanarchitecturecompose.store.domain.model

data class NetworkError(
    val error: ApiError,
    val t: Throwable? = null
)

enum class ApiError(val message: String) {
    NetworkError("NetworkError"),
    UnknownResponse("UnknownResponse"),
    UnknownError("UnknownError")
}