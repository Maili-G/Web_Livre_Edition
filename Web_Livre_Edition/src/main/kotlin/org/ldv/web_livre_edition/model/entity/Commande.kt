package org.ldv.web_livre_edition.model.entity

import ch.qos.logback.core.net.server.Client
import java.time.LocalDate

class Commande(
    id : Int?,
    numero : Int,
    dateCommande : LocalDate,
    statut : String,
    //client: Utilisateur
) {
}