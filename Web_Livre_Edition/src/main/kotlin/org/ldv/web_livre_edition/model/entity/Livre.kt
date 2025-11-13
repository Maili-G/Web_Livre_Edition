package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

import jakarta.persistence.*

@Entity
class Livre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    val id : Int?,
    val titre : String,
    val auteur : String,
    val datePublication : LocalDate,
    val synopsis : String,
    val image : String,
    var prix : Float,
    //listeGenre: MutableList<Genre>
) {
}