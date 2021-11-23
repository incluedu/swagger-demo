package net.lustenauer.swaggerdemo.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY
)
@JsonSubTypes(
    JsonSubTypes.Type(value = BoolElement::class, name = "BoolElement"),
    JsonSubTypes.Type(value = IntElement::class, name = "IntElement"),
)
interface Element<T> {
    var value :T
}

data class BoolElement(
    override var value: Boolean = false
) : Element<Boolean>


data class IntElement(
    override var value: Int = 0
) : Element<Int>
