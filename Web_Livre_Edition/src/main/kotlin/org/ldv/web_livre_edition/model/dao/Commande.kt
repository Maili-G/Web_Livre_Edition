package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Commande
import org.springframework.data.jpa.repository.JpaRepository

interface CommandeeDAO : JpaRepository<Commande, Long> {
}
