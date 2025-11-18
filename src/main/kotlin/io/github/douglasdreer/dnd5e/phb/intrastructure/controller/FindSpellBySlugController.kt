package io.github.douglasdreer.dnd5e.phb.intrastructure.controller

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindSpellBySlugUseCase
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toResponse
import io.github.douglasdreer.dnd5e.phb.intrastructure.response.SpellResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/5th-edition/players-handlebook/spells")
class FindSpellBySlugController(
    private val findSpellBySlugUseCase: FindSpellBySlugUseCase
) {

    @GetMapping(params = ["slug"])
    fun findById(@RequestParam(required = true) slug: String): ResponseEntity<SpellResponse> {
        val spellFound = findSpellBySlugUseCase.execute(slug)
        return ResponseEntity.ok(spellFound?.toResponse())
    }
}