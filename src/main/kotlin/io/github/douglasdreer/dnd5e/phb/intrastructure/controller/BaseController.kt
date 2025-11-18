package io.github.douglasdreer.dnd5e.phb.intrastructure.controller

import java.net.URI

abstract class BaseController {
    fun createURI(id: Long?, path: String): URI {
        return URI("$path/$id")
    }
}