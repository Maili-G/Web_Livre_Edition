package org.ldv.web_livre_edition.controller.admincontrollers

import org.ldv.web_livre_edition.model.dao.LivreDAO
import org.ldv.web_livre_edition.model.entity.Livre
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class AdminLivreController(val livreDAO: LivreDAO) {
    @GetMapping("/web_livre_edition/admin/livres")
    fun index(model : Model): String{
        var livresList = livreDAO.findAll()
        model.addAttribute("livres",livresList)
        return "pageAdmin/livre/indexLivre"
    }
    @GetMapping("web_livre_edition/admin/livres/{id}")
    fun show(@PathVariable id: Long, model: Model): String{
        val unLivre = livreDAO.findById(id).orElseThrow()
    model.addAttribute("livre", unLivre)
    return "pageAdmin/livre/showLivre"
    }

    @GetMapping("web_livre_edition/admin/livres/create")
    fun create(model: Model){
        var nouveauLivre = Livre(id = null, titre = "Lakestone", auteur = "", datePublication = "", synopsis = "",
            image = "", prix = 10.0, genres = mutableListOf(genreRomance))
    }
}