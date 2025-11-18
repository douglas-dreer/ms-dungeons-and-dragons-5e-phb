package io.github.douglasdreer.dnd5e.phb.intrastructure.controller

import io.github.douglasdreer.dnd5e.phb.application.ports.input.SaveSpellUseCase
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toResponse
import io.github.douglasdreer.dnd5e.phb.intrastructure.request.CreateSpellRequest
import io.github.douglasdreer.dnd5e.phb.intrastructure.response.SpellResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/5th-edition/players-handlebook/spells")
class SaveSpellController(
    private val SaveSpellUseCase: SaveSpellUseCase
): BaseController() {
    companion object {
        val PATH: String = "/5th-edition/players-handlebook/spells"
    }
    @PostMapping()
    fun execute(@RequestBody request: CreateSpellRequest): ResponseEntity<SpellResponse> {
        val spellCreated = SaveSpellUseCase.execute(request)
        val uri = createURI(spellCreated.id, PATH)
        return ResponseEntity.created(uri).body(spellCreated.toResponse())
    }

}