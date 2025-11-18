package io.github.douglasdreer.dnd5e.phb.domain.enums

enum class School(
    private val label: String,
    private val description: String
) {
    ABJURATION("Abjuration", "Prevents or reverses harmful effects"),
    CONJURATION("Conjuration", "Transports creatures or objects"),
    DIVINATION("Divination", "Reveals information"),
    ENCHANTMENT("Enchantment", "Influences minds"),
    EVOCATION("Evocation", "Channels energy to create effects that are often destructive"),
    ILLUSION("Illusion", "Deceives the mind or senses"),
    NECROMANCY("Necromancy", "Manipulates life and death"),
    TRANSMUTATION("Transmutation", "Transforms creatures or objects")

}