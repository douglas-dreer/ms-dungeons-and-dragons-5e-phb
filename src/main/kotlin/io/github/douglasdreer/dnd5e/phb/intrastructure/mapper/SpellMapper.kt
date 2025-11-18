package io.github.douglasdreer.dnd5e.phb.intrastructure.mapper

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.entity.SpellEntity
import io.github.douglasdreer.dnd5e.phb.intrastructure.response.SpellResponse

fun Spell.toEntity(): SpellEntity {
    return SpellEntity(
        id = id,
        slug = this.slug,
        name = this.name,
        description = this.description,
        sourceBook = this.sourceBook,
        isRitual = this.isRitual,
        level = this.level,
        school = this.school,
        castingTime = this.castingTime,
        range = this.range,
        components = this.components,
        spellDuration = this.spellDuration,
    )
}

fun Spell.toResponse(): SpellResponse {
    return SpellResponse(
        id = id,
        slug = this.slug,
        name = this.name,
        description = this.description,
        sourceBook = this.sourceBook,
        isRitual = this.isRitual,
        level = this.level,
        school = this.school,
        castingTime = this.castingTime,
        range = this.range,
        components = this.components,
        spellDuration = this.spellDuration,
    )
}

fun List<Spell>.toResponse(): List<SpellResponse> {
    return map { it.toResponse() }
}