package io.github.douglasdreer.dnd5e.phb.intrastructure.controller

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindAllSpellUseCase
import io.github.douglasdreer.dnd5e.phb.domain.model.Pagination
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toResponse
import io.github.douglasdreer.dnd5e.phb.intrastructure.response.SpellResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/5th-edition/players-handlebook/spells")
class FindAllSpellController(
    private val findAllSpellUseCase: FindAllSpellUseCase
) {
    @GetMapping(params = ["page", "size"])
    fun execute(
        @RequestParam("page", defaultValue = "0") page: Int,
        @RequestParam("size", defaultValue = "50") size: Int
    ): ResponseEntity<Pagination<SpellResponse>> {
        val spellList = findAllSpellUseCase.execute(page, size)
        return ResponseEntity.ok(spellList.toResponse(Spell::toResponse))
    }
}