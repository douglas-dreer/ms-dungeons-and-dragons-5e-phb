package io.github.douglasdreer.dnd5e.phb.application.ports.input

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.request.CreateSpellRequest

fun interface SaveSpellUseCase {
    fun execute(spell: CreateSpellRequest): Spell
}