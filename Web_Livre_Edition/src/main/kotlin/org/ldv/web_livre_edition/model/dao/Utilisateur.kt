package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

interface UtilisateurDAO : JpaRepository<Utilisateur, Long> {
}
