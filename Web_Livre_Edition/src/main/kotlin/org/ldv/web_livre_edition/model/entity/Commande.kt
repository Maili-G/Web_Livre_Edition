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

    //Association avec Utilisateur (Commande est le maitre de l'association)
    @ManyToOne
    @JoinColumn(name = "utlisateur_fkid")
    var utilisateur: Utilisateur? = null
) {
}