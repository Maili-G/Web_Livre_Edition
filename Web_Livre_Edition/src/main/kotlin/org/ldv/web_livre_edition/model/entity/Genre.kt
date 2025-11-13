package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.*

@Entity
class Genre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    val id : Int,
    val nom : String,
    var nombreLivre : Int,
    //listeLivres : MutableList<Livre>
) {
}