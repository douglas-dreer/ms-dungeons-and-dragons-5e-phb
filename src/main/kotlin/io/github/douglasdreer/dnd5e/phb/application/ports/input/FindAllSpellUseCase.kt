package io.github.douglasdreer.dnd5e.phb.application.ports.input

import io.github.douglasdreer.dnd5e.phb.domain.model.Pagination
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell

fun interface FindAllSpellUseCase {
    fun execute(page: Int, size: Int): Pagination<Spell>
}