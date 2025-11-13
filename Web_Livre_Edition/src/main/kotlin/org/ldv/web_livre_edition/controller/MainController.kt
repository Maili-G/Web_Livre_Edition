package org.ldv.web_livre_edition.controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController (){

    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template
     * a partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/Web_Livre_Edition")
    fun home():String{
        return "index"
    }

    @GetMapping("/Web_Livre_Edition/a-propos")
    fun a_propos():String{
        return "pagesVisiteur/a_propos"
    }

    @GetMapping("/Web_Livre_Edition/contact")
    fun contact():String{
        return "pagesVisiteur/contact"
    }

    @GetMapping("/Web_Livre_Edition/inscription")
    fun inscription():String{
        return "pagesVisiteur/inscription"
    }

    @GetMapping("/Web_Livre_Edition/produits")
    fun produits():String{
        return "pagesVisiteur/produits"
    }

    @GetMapping("/Web_Livre_Edition/rgpd")
    fun rgpd():String{
        return "pagesVisiteur/rgpd"
    }

}
