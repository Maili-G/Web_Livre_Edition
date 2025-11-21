package org.ldv.web_livre_edition.controller
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MainController (){

    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template
     * a partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/web_livre_edition")
    fun home():String{
        return "index"
    }

    @GetMapping("/web_livre_edition/a-propos")
    fun a_propos():String{
        return "pagesVisiteur/a_propos"
    }

    @GetMapping("/web_livre_edition/contact")
    fun contact():String{
        return "pagesVisiteur/contact"
    }

    @GetMapping("/web_livre_edition/inscription")
    fun inscription():String{
        return "pagesVisiteur/inscription"
    }

    @GetMapping("/web_livre_edition/produits")
    fun produits():String{
        return "pagesVisiteur/produits"
    }

    @GetMapping("/web_livre_edition/rgpd")
    fun rgpd():String{
        return "pagesVisiteur/rgpd"
    }

    @GetMapping("/web_livre_edition/login")
    fun login(@RequestParam error: Boolean?, model: Model): String {
        // Ajoute un attribut "error" au modèle si la requête contient une erreur
        model.addAttribute("error", error == true)
        return "login"
    }


}
