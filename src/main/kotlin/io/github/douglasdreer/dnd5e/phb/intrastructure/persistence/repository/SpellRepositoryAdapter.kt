package io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.repository

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.application.ports.output.SpellRepositoryPort
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toDomain
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class SpellRepositoryAdapter(
    private val repository: SpringDataSpellRepository
): SpellRepositoryPort {
    override fun save(spell: Spell): Spell {
        return repository
            .save(spell.toEntity())
            .toDomain()
    }

    override fun findAll(page: Int, size: Int): Page<Spell> {
        val pageable = PageRequest.of(page, size)
        return repository.findAll(pageable).map { it.toDomain() }
    }

    override fun findById(spellId: Long): Spell? {
        return repository.findByIdOrNull(spellId)?.toDomain()
    }

    override fun findBySlug(slug: String): Spell? {
        return repository.findBySlug(slug)?.toDomain()
    }
}


