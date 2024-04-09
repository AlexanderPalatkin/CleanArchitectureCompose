package com.example.cleanarchitecturecompose.store.domain.repository

import arrow.core.Either
import com.example.cleanarchitecturecompose.store.domain.model.NetworkError
import com.example.cleanarchitecturecompose.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProduct(): Either<NetworkError, List<Product>>
}