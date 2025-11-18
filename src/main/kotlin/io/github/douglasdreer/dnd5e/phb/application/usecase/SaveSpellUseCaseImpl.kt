package io.github.douglasdreer.dnd5e.phb.application.usecase

import io.github.douglasdreer.dnd5e.phb.application.ports.input.SaveSpellUseCase
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.application.ports.output.SpellRepositoryPort
import io.github.douglasdreer.dnd5e.phb.intrastructure.request.CreateSpellRequest
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toDomain
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class SaveSpellUseCaseImpl(
    private val spellPort: SpellRepositoryPort
): SaveSpellUseCase {
    @Transactional(rollbackOn = [Exception::class])
    override fun execute(spell: CreateSpellRequest): Spell {
        val domain = spell.toDomain()
        return spellPort.save(domain)
    }
}