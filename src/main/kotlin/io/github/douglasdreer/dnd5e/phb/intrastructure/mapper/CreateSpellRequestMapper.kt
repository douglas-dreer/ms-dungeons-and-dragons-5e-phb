package io.github.douglasdreer.dnd5e.phb.intrastructure.mapper

import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.request.CreateSpellRequest

fun CreateSpellRequest.toDomain(): Spell {
    return Spell(
        id = null,
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