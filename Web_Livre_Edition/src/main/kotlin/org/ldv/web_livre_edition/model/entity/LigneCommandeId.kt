package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable

class LigneCommandeId(
    var commandeId : Int,
    var livreId : Int
) : Serializable{
}