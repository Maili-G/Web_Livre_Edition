package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate
import jakarta.persistence.*


@Entity
class Commande(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    val id : Int?,
    val numero : Int,
    val dateCommande : LocalDate,
    var statut : String,
    //client: Utilisateur
) {
}