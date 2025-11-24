package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UtilisateurDAO : JpaRepository<Utilisateur, Long> {

    /* ?1 → correspond au premier paramètre de la méthode
    le u est un alias pour Utilisateur*/

    @Query("select u from Utilisateur u where u.email = ?1")
    fun findByEmail(email : String): Utilisateur
}
