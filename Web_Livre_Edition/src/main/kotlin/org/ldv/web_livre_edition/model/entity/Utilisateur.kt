package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

class Utilisateur (
    id : Int?,
    nom : String,
    prenom : String,
    mail : String,
    adressePostal : String,
    dateCreation : LocalDate,
    //commande: MutableList<Commande>
){

}