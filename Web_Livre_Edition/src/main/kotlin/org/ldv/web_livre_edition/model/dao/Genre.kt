package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Genre
import org.springframework.data.jpa.repository.JpaRepository

interface GenreDAO : JpaRepository<Genre, Long> {
}
