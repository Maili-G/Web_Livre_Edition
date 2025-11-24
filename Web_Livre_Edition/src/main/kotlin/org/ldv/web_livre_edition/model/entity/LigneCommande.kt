package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.*
@Entity

class LigneCommande(
    @EmbeddedId
    var ligneCommandeId: LigneCommandeId? = null,

    @MapsId("commandeId")
    @ManyToOne
    @JoinColumn(name = "commande_id")
    var commande : Commande? = null,

    @MapsId("livreId")
    @ManyToOne
    @JoinColumn(name = "livre_id")
    var livre: Livre? = null
) {
}