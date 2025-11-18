package io.github.douglasdreer.dnd5e.phb.intrastructure.mapper

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.entity.SpellEntity

fun SpellEntity.toDomain(): Spell {
    return Spell(
        id = this.id,
        slug = this.slug,
        name = this.name,
        level = this.level,
        school = this.school,
        castingTime = this.castingTime,
        range = this.range,
        components = this.components,
        spellDuration = this.spellDuration,
        isRitual = this.isRitual,
        description = this.description,
        sourceBook = this.sourceBook,
    )
}

fun List<SpellEntity>.toDomain(): List<Spell> {
    return map { it.toDomain() }
}