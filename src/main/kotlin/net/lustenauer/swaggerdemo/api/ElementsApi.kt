package net.lustenauer.swaggerdemo.api

import io.swagger.v3.oas.annotations.tags.Tag
import net.lustenauer.swaggerdemo.dto.Element
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Tag(name = "elements", description = "handle elements")
@RequestMapping("/api/le")
interface ElementsApi {
    @GetMapping("/get")
    fun getElements(): List<Element<*>>
}
