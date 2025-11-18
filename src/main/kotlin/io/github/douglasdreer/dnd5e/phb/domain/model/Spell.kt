package io.github.douglasdreer.dnd5e.phb.domain.model

import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellComponent
import io.github.douglasdreer.dnd5e.phb.domain.enums.SpellDuration
import io.github.douglasdreer.dnd5e.phb.domain.enums.School
import io.github.douglasdreer.dnd5e.phb.domain.enums.SourceBook

/**
 * Represetação do Spell
 *
 * @property id [Long]                  Código interno do sistema
 * @property slug [String]
 * @property name [String]              Nome da magia
 * @property level [Int]                Nível da magia
 * @property school [School]            Escola da magia
 * @property castingTime [String]       Tempo para a magia ser executado
 * @property range [String]             Distancia que a magia pode alcançar
 * @property components [SpellComponent]    Os componentes que a magia precisa para ser realizada
 * @property spellDuration [String]          Duranção de efeito da magia
 * @property isRitual [Boolean]         Se a magia é um ritual
 * @property description [String]       Descrição e detalhes da magía
 * @property sourceBook [SourceBook]        Qual é a origem desta magia
 */
data class Spell(
    val id: Long? = null,
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