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


}
