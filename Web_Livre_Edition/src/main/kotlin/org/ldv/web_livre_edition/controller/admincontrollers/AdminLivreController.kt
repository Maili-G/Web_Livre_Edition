package org.ldv.web_livre_edition.controller.admincontrollers

import org.ldv.web_livre_edition.model.dao.LivreDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminLivreController(val livreDAO: LivreDAO) {
    @GetMapping("/web_livre-edition/admin/livres")
    fun index(model : Model): String{
        var livresList = livreDAO.findAll()
        model.addAttribute("livres",livresList)
        return "pageAdmin/livre/indexLivre"
    }
}