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
){

}