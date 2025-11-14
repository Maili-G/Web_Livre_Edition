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

    //Association avec Utilisateur (Livre est le maitre de l'association)
    @ManyToOne
    @JoinColumn(name = "utlisateur_fkid")
    var utilisateur: Utilisateur? = null,

    // Association avec Commentaire
    @OneToMany(mappedBy = "livre", cascade = [CascadeType.ALL], orphanRemoval = true)
    var commentaires : MutableList<Commentaire> = mutableListOf(),

    //Association Many to Many avec Genre
    @ManyToMany
    @JoinTable(
        name = "livre_genre",
        joinColumns = [JoinColumn(name = "livre_id")],
        inverseJoinColumns = [JoinColumn(name = "genre_id")]
    )
    var genres: MutableList<Genre> = mutableListOf()

) {
}