package net.lustenauer.swaggerdemo.controller

import net.lustenauer.swaggerdemo.api.ElementsApi
import net.lustenauer.swaggerdemo.dto.BoolElement
import net.lustenauer.swaggerdemo.dto.Element
import net.lustenauer.swaggerdemo.dto.IntElement
import org.springframework.web.bind.annotation.RestController

@RestController
class ElementsController : ElementsApi {
    val testElements = listOf<Element<*>>(
        BoolElement(true),
        BoolElement(false),
        IntElement(22),
        IntElement(33)
    )
    override fun getElements(): List<Element<*>> = testElements
}
