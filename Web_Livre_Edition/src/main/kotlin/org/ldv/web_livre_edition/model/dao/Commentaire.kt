package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Commentaire
import org.springframework.data.jpa.repository.JpaRepository

interface CommentaireDAO : JpaRepository<Commentaire, Long> {
}
