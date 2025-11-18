package io.github.douglasdreer.dnd5e.phb.intrastructure.mapper

import io.github.douglasdreer.dnd5e.phb.domain.model.Pagination
import org.springframework.data.domain.Page

fun <T> Page<T>.toDomain(): Pagination<T> {
    return Pagination(
        totalPages = this.totalPages,
        totalElements = this.totalElements,
        content = this.content,
        page = this.number,
        size = this.size,
    )
}

fun <T, R> Pagination<T>.toResponse(mapper: (T) -> R): Pagination<R> {
    val contentResponse = this.content.map { mapper(it) }

    return Pagination(
        totalPages = this.totalPages,
        totalElements = this.totalElements,
        page = this.page,
        size = this.size,
        content = contentResponse
    )
}