package io.github.douglasdreer.dnd5e.phb.application.ports.input

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell

fun interface FindSpellByIdUseCase {
    fun execute(spellId: Long): Spell?
}