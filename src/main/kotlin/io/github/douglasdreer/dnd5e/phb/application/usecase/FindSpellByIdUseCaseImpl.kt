package io.github.douglasdreer.dnd5e.phb.application.usecase

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindSpellByIdUseCase
import io.github.douglasdreer.dnd5e.phb.application.ports.output.SpellRepositoryPort
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import org.springframework.stereotype.Service

@Service
class FindSpellByIdUseCaseImpl (
    private val spellPort: SpellRepositoryPort
): FindSpellByIdUseCase {
    override fun execute(spellId: Long): Spell? {
        return spellPort.findById(spellId)
    }
}