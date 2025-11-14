package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

import jakarta.persistence.*

@Entity
class Utilisateur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id : Int?,
    val nom : String,
    val prenom : String,
    var mail : String,
    var adressePostal : String,
    val dateCreation : LocalDate,
    //commande: MutableList<Commande>

    //Association avec Role (Utilisateur est le maitre de l'association)

    @ManyToOne
    @JoinColumn(name = "role_fkid")
    var role: Role? = null,

    // Association avec Commande
    @OneToMany(mappedBy = "utilisateur", cascade = [CascadeType.ALL], orphanRemoval = true)
    var commandes : MutableList<Commande> = mutableListOf(),

    // Association avec Commentaire
    @OneToMany(mappedBy = "utilisateur", cascade = [CascadeType.ALL], orphanRemoval = true)
    var commentaires : MutableList<Commentaire> = mutableListOf(),

    // Association avec Livre
    @OneToMany(mappedBy = "utilisateur", cascade = [CascadeType.ALL], orphanRemoval = true)
    var livres : MutableList<Livre> = mutableListOf()
){

}