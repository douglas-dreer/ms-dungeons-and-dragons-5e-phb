package io.github.douglasdreer.dnd5e.phb.application.usecase

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindSpellBySlugUseCase
import io.github.douglasdreer.dnd5e.phb.application.ports.output.SpellRepositoryPort
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import org.springframework.stereotype.Service

@Service
class FindSpellBySlugUseCaseImpl(
    private val spellPort: SpellRepositoryPort
): FindSpellBySlugUseCase {
    override fun execute(slug: String): Spell? {
        return spellPort.findBySlug(slug)
    }
}