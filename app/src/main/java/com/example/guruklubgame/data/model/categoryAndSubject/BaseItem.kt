package com.gmpire.guruklub.data.model.categoryAndSubject

open class BaseItem(var id: String? = null, var name: String? = null) {
    var parentPos : Int? = 0
    var isSelected : Boolean = false
}
