package com.example.cleanarchitecturecompose.store.presentation.products_screen

import com.example.cleanarchitecturecompose.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)
