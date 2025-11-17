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

    override fun run (vararg args : String?){

        // Vérifie si la base contient déjà des données
        if (genreDAO.count() > 0 || livreDAO.count() > 0 || commentaireDAO.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }

        println("🚀 Initialisation des données...")

        // === Genre ===
        val genreRomance = Genre(nom = "Romance")
        val genrePolicier = Genre(nom = "Policier")
        val genreThriller = Genre(nom = "Thriller")
        val genreFantastique = Genre(nom = "Fantastique")
        val genreSciFic = Genre(nom = "Science-Fiction")
        val genrePoesie = Genre(nom = "Poésie")

        genreDAO.saveAll(listOf(genreRomance, genreThriller, genreFantastique, genrePoesie,genrePolicier,genreSciFic, genrePoesie))

        // === Livres ===

        val MaskedMan = Livre(
            id = null,
            titre = "Masked Man",
            auteur = "Marie RND",
            datePublication = "29 Octobre 2025",
            synopsis = "Les apparences sont parfois trompeuses…\n" +
                    "\n" +
                    "Ivy Miller hérite du plus vaste empire de drogue des États-Unis lorsque son père disparaît sans laisser de trace. Elle, qui le détestait, aurait dû se sentir libre et puissante. Mais on ne se libère pas aussi facilement de l’influence de cet homme cruel.\n" +
                    "\n" +
                    "Alors que la jeune femme lutte pour garder la tête hors de l’eau, elle est kidnappée par une mystérieuse organisation. Tous ses membres portent des masques, et leur chef, Silas, dissimulé derrière le plus effrayant d’entre eux, n’a qu’une motivation : tuer le père d’Ivy.\n" +
                    "\n" +
                    "Et sa seule exigence ? Qu’elle l’aide à l’anéantir.\n" +
                    "\n" +
                    "Une fragile alliance naît alors dans le sang, la haine et… l’espoir ? Car derrière le masque terrifiant de Silas, Ivy devine autre chose. Une faille. Une histoire. Un homme façonné par la douleur, qui lui ressemble plus qu’elle ne voudrait l’admettre.",
            image = "Images/Masked-man.jpg",
            prix = 20.90,
            genres = mutableListOf(genreRomance)
            )

        val TaraDuncan1 = Livre(
            id = null,
            titre = "Tara Duncan - Les sortceliers",
            auteur = "Sophie Audouin-Mamikonian",
            datePublication = "2 mai 2003",
            synopsis = "Tara Duncan, douze ans, vit avec sa grand-mère qui lui a soigneusement caché qu'elles étaient des sortcelières, (\"celles qui savent lier les sorts\"). Mais, quand Tara joue avec ses amis, d'étranges phénomènes se produisent parfois, et l'adolescente comprend qu'elle a un don, au demeurant plutôt encombrant, puisque, malgré elle, elle fait s'envoler les gens ! Quand sa mère, qu'elle croit morte, lui apparaît en songe pour lui annoncer qu'elle est prisonnière de Magister, Tara est assez perplexe. La suite n'est plus un songe : Magister lui-même surgit, animé des pires intentions, et tente de kidnapper Tara... Après cette attaque, Tara est envoyée, pour sa sécurité, sur AutreMonde (une planète ou règne la magie, et où vivent différents peuples, humains, nains, géants, elfes, licornes ou encore dragons), mais ses aventures ne font que commencer...",
            image = "Images/Tara-Duncan.jpg",
            prix = 19.90,
            genres = mutableListOf(genreFantastique)
        )

        val TheMortalInstruments1 = Livre(
            id = null,
            titre = "The Mortal Instruments - La cité des ténèbres",
            auteur = "Cassandra Clare",
            datePublication = "27 mars 2007",
            synopsis = "New York, de nos jours. Au cours d’une soirée, Clary, 15 ans, est témoin d’un meurtre. Elle est terrifiée lorsque le corps de la victime disparaît mystérieusement devant ses yeux… Elle découvre alors l’existence d’une guerre invisible entre des forces démoniaques et la société secrète des Chasseurs d’Ombres. Le mystérieux Jace est l’un d’entre eux. À ses côtés, Clary va jouer dans cette aventure un rôle qu’elle n’aurait jamais imaginé.",
            image = "Images/The-Mortal-Instruments-tome-1-La-Cite-des-Tenebres.jpg",
            prix = 18.15,
            genres = mutableListOf(genreFantastique, genreRomance)
        )

        val LeCercleDes17_1 = Livre(
            id = null,
            titre = "Le cercle des 17",
            auteur = "Richard Paul Evans",
            datePublication = "16 novembre 2017",
            synopsis = "Michael Vey possède des super pouvoirs. D'un seul geste, il peut envoyer des décharges électriques de plusieurs milliers de volts. Pratique, quand on est harcelé par les caïds du lycée et atteint de tics embarrassants.\n" +
                    "\n" +
                    "Michael se croit seul... avant de découvrir que Taylor, ravissante pom-pom girl, est elle aussi \"électrique\". A peine commencent-ils à comprendre leur secret qu'une mystérieuse organisation, convoitant les pouvoirs des deux adolescents, les prend en chasse...",
            image = "Images/Le-cercle-des-17-tome-1.jpg",
            prix = 18.90,
            genres = mutableListOf(genreFantastique, genreSciFic)
        )

        val LesFleurDuMal = Livre(
            id = null,
            titre = "Les Fleurs du Mal",
            auteur = "Charles Baudelaire",
            datePublication = "21 juin 1857",
            synopsis = "\"Plonger au fond du gouffre, Enfer ou Ciel, qu'importe? / Au fond de l'inconnu, pour trouver du nouveau!\"\n" +
                    "\n" +
                    "Ces vers du \"Voyage\" éclairent à eux seul l'entreprise du poète. Esprit vagabond, toujours mobile, Baudelaire explore les dédales de la conscience. Il atteint tantôt à l'extase, tantôt se perd dans les abîmes du péché. A travers ses poèmes, il nous fait partager le drame qui se joue en lui et qui n'est autre que la tragédie humaine. Baudelaire, premier poète moderne, donne à la poésie sa véritable dimension: exprimer, par-delà les mots, ce vertige absolu qui s'empare de l'âme. Tout chez lui affirme la nécessité de la souffrance, la fatalité du péché. Tout traduit une âme profondément troublée mais charitable. Baudelaire fait des Fleurs du Mal un immense poème de la vie et du monde.",
            image = "Images/Les-Fleurs-Du-Mal.jpg",
            prix = 12.90,
            genres = mutableListOf(genrePoesie)
        )

        // === Sauvegarde des articles ===

        livreDAO.saveAll(
            listOf(
                MaskedMan,
                TaraDuncan1,
                TheMortalInstruments1,
                LeCercleDes17_1,
                LesFleurDuMal
            )
        )

        println("✅ Données initiales insérées : ${genreDAO.count()} genres, ${livreDAO.count()} livres.")

    }
}