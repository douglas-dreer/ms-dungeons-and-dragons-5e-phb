package io.github.douglasdreer.dnd5e.phb.application.ports.output

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import org.springframework.data.domain.Page

interface SpellRepositoryPort {
    fun save(spell: Spell): Spell
    fun findAll(page: Int, size: Int): Page<Spell>
    fun findById(spellId: Long): Spell?
    fun findBySlug(slug: String): Spell?
}