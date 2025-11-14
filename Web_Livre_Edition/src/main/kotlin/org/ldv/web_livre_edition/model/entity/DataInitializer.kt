package org.ldv.web_livre_edition.model.entity

import org.ldv.web_livre_edition.model.dao.CommentaireDAO
import org.ldv.web_livre_edition.model.dao.GenreDAO
import org.ldv.web_livre_edition.model.dao.LivreDAO
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component

class DataInitializer (
    private val genreDAO: GenreDAO,
    private  val livreDAO: LivreDAO,
    private val commentaireDAO: CommentaireDAO
) : CommandLineRunner{
    override fun run (varang args : String?){
        // Vérifie si la base contient déjà des données
        if (genreDAO.count() > 0 || livreDAO.count() > 0 || commentaireDAO.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }

        println("🚀 Initialisation des données...")

        // === Genre ===
        val genreRomance = Categorie(nom = "Romance")
        val genrePolicier = Categorie(nom = "Policier")
        val genreThriller = Categorie(nom = "Thriller")
        val genreFantastique = Categorie(nom = "Fantastique")
        val genreSciFic = Categorie(nom = "Science-Fiction")
        val genrePoesie = Categorie(nom = "Poésie")



    }
}