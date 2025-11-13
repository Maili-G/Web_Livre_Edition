package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Livre
import org.springframework.data.jpa.repository.JpaRepository

interface LivreDAO : JpaRepository<Livre, Long> {
}
