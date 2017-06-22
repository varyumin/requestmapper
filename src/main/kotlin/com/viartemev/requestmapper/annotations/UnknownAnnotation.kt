package com.viartemev.requestmapper.annotations

import com.viartemev.requestmapper.RequestMappingItem

class UnknownAnnotation private constructor() : MappingAnnotation {

    override fun values(): List<RequestMappingItem> {
        return emptyList()
    }

    companion object {

        val instance = UnknownAnnotation()
    }

}