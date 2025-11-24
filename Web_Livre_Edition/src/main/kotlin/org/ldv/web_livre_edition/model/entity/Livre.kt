package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.*
import java.awt.Image

@Entity
class Livre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    val id: Int?,
    val titre: String,
    val auteur: String,
    val datePublication: String,
    @Column(length = 1500)
    val synopsis: String,
    val image: String?,
    var prix: Double,
    //listeGenre: MutableList<Genre>

    //Association avec Utilisateur (Livre est le maitre de l'association)
    @ManyToOne
    @JoinColumn(name = "utlisateur_fkid")
    var utilisateur: Utilisateur? = null,

    // Association avec Commentaire
    @OneToMany(mappedBy = "livre", cascade = [CascadeType.ALL], orphanRemoval = true)
    var commentaires: MutableList<Commentaire> = mutableListOf(),

    //Association Many to Many avec Genre
    @ManyToMany
    @JoinTable(
        name = "livre_genre",
        joinColumns = [JoinColumn(name = "livre_id")],
        inverseJoinColumns = [JoinColumn(name = "genre_id")]
    )
    var genres: MutableList<Genre> = mutableListOf(),

    //Association One to Many avec LigneCommande
    @OneToMany(mappedBy = "livre", orphanRemoval = true)
    var ligneCommandes: MutableList<LigneCommande> = mutableListOf()

) {

}