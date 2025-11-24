package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.LigneCommande
import org.springframework.data.jpa.repository.JpaRepository

interface LigneCommandeDAO : JpaRepository<LigneCommande, Long> {
}
