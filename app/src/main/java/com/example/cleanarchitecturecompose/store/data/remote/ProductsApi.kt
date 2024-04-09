package com.example.cleanarchitecturecompose.store.data.remote

import com.example.cleanarchitecturecompose.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}