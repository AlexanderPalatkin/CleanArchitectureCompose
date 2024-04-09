package com.example.cleanarchitecturecompose.store.data.repository

import arrow.core.Either
import com.example.cleanarchitecturecompose.store.data.mapper.toNetworkError
import com.example.cleanarchitecturecompose.store.data.remote.ProductsApi
import com.example.cleanarchitecturecompose.store.domain.model.NetworkError
import com.example.cleanarchitecturecompose.store.domain.model.Product
import com.example.cleanarchitecturecompose.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProduct(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft {
            it.toNetworkError()
        }
    }
}