package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Utilisateur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id : Int?,
    val nom : String,
    val prenom : String,
    var email : String,
    var adressePostal : String, // peut servir comme identifiant
    var mdp : String, // mot de passe de l'Utilisateur (/!\ à stocker obligatoirement hashé (BCrypt))
    //commande: MutableList<Commande>

    /**
     * Date de création de l’enregistrement.
     * - initialisée automatiquement lors de la création
     * - non modifiable après insertion (updatable = false)
     */
    @Column(nullable = false, updatable = false)
    var dateCreation: LocalDateTime = LocalDateTime.now(),
    /**
     * Date de dernière modification de l'enregistrement.
     * Mise à jour automatiquement avant chaque mise à jour en base (@PreUpdate).
     */
    @Column(nullable = false)
    var dateModification: LocalDateTime = LocalDateTime.now(),


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

    /**
     * Méthode exécutée automatiquement avant chaque update JPA.
     * Elle met à jour la date de modification.
     */
    @PreUpdate
    fun preUpdate() {
        dateModification = LocalDateTime.now()
    }


}