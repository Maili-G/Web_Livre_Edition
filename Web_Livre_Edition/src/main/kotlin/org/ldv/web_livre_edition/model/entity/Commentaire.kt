package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

import jakarta.persistence.*

@Entity
class Commentaire(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    val id : Int?,
    var commentaire : String,
    val datePublication : LocalDate,
    var dateModification : LocalDate,

    //Association avec Utilisateur (Commentaire est le maitre de l'association)

    @ManyToOne
    @JoinColumn(name = "utilisateur_fkid")
    var utilisateur: Utilisateur? = null,

    //Association avec Livre (Commentaire est le maitre de l'association)

    @ManyToOne
    @JoinColumn(name = "livre_fkid")
    var livre: Livre? = null
) {
}