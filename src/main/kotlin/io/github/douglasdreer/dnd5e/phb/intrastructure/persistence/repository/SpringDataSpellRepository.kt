package io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.repository

import io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.entity.SpellEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SpringDataSpellRepository: JpaRepository<SpellEntity, Long> {
    fun findBySlug(slug: String): SpellEntity?
}