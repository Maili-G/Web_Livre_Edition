package org.ldv.web_livre_edition.model.entity

import java.time.LocalDate

class Livre(
    id : Int?,
    titre : String,
    auteur : String,
    datePublication : LocalDate,
    synopsis : String,
    image : String,
    prix : Float,
    //listeGenre: MutableList<Genre>
) {
}