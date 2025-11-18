package io.github.douglasdreer.dnd5e.phb.domain.exceptions

class SpellNotFoundException(slug: String): RuntimeException(slug) {
}