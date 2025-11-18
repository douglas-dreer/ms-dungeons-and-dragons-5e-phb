package io.github.douglasdreer.dnd5e.phb.application.usecase

import io.github.douglasdreer.dnd5e.phb.application.ports.input.FindAllSpellUseCase
import io.github.douglasdreer.dnd5e.phb.application.ports.output.SpellRepositoryPort
import io.github.douglasdreer.dnd5e.phb.domain.model.Pagination
import io.github.douglasdreer.dnd5e.phb.domain.model.Spell
import io.github.douglasdreer.dnd5e.phb.intrastructure.mapper.toDomain
import org.springframework.stereotype.Service

@Service
class FindAllSpellUseCase(
    private val spellPort: SpellRepositoryPort
): FindAllSpellUseCase {
    override fun execute(page: Int, size: Int): Pagination<Spell> {
        val resultPage = spellPort.findAll(page, size)
        return resultPage.toDomain()
    }
}