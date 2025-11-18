package io.github.douglasdreer.dnd5e.phb.domain.model

data class Pagination<T>(
    val totalPages: Int,
    val totalElements: Long,
    val page: Int,
    val size: Int,
    val content: List<T>
)