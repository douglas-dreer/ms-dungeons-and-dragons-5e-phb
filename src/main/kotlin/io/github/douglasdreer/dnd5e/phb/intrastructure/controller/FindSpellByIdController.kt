package io.github.douglasdreer.dnd5e.phb.intrastructure.controller

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindSpellByIdUseCase
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toResponse
import io.github.douglasdreer.dnd5e.phb.intrastructure.response.SpellResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/5th-edition/players-handlebook/spells")
class FindSpellByIdController(
    private val findSpellByIdUseCase: FindSpellByIdUseCase,
) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<SpellResponse> {
        val spellFound = findSpellByIdUseCase.execute(id)
        return ResponseEntity.ok(spellFound?.toResponse())
    }
}