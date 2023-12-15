package com.arrowwould.wavesoffood.model

data class CartItems(
    var foodName: String? = null,
    var foodPrice: String? = null,
    var foodDescription: String? = null,
    var foodImage: String? = null,
    var foodQuantity: Int? = null,
    var foodIngredint:String?=null
)
