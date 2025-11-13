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
    var dateModification : LocalDate
) {
}