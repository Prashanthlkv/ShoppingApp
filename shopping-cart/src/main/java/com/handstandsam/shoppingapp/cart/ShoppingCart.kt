package com.handstandsam.shoppingapp.cart

import com.handstandsam.shoppingapp.models.Item
import com.handstandsam.shoppingapp.models.ItemWithQuantity
import kotlinx.coroutines.channels.ReceiveChannel

interface ShoppingCart {
    fun addItem(item: Item)
    fun removeItem(item: Item)
    fun itemsInCartChannel(): ReceiveChannel<List<ItemWithQuantity>>
    fun itemsInCart(): List<ItemWithQuantity>
    fun empty()
}