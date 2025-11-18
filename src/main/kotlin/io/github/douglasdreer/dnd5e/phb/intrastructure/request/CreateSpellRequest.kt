package io.github.douglasdreer.dnd5e.phb.intrastructure.request

import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellDuration
import io.github.douglasdreer.dnd5e.phb.domain.enums.School
import io.github.douglasdreer.dnd5e.phb.domain.enums.SourceBook
import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellComponent
import java.awt.Component

data class CreateSpellRequest(
    val slug: String,
    val name: String,
    val level: Int,
    val school: School,
    val castingTime: String,
    val range: String,
    val components: List<SpellComponent>,
    val spellDuration: SpellDuration,
    val isRitual: Boolean,
    val description: String,
    val sourceBook: SourceBook
)
