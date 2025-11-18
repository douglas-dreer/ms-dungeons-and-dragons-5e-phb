package io.github.douglasdreer.dnd5e.phb.intrastructure.persistence.entity

import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellComponent
import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellDuration
import io.github.douglasdreer.dnd5e.phb.domain.enums.School
import io.github.douglasdreer.dnd5e.phb.domain.enums.SourceBook
import jakarta.persistence.*

@Entity
@Table(name = "spells")
data class SpellEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false, unique = true)
    val slug: String,
    @Column(nullable = false, unique = true)
    val name: String,
    val level: Int,

    @Enumerated(EnumType.STRING)
    val school: School,

    val castingTime: String,
    val range: String,

    @ElementCollection
    @Enumerated(EnumType.STRING)
    val components: List<SpellComponent>,

    @Enumerated(EnumType.STRING)
    val spellDuration: SpellDuration,
    val isRitual: Boolean,

    @Column(columnDefinition = "TEXT")
    val description: String,

    @Enumerated(EnumType.STRING)
    val sourceBook: SourceBook
)
