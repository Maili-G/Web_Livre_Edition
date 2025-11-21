package org.ldv.web_livre_edition.controller.admincontrollers

import org.ldv.web_livre_edition.model.dao.GenreDAO
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

class AdminGenreController(
    val genreDAO: GenreDAO
) {
    @GetMapping("/web_livre_edition/admin/genre")
    fun index(model: Model): String{
        val genres = genreDAO.findAll()
        model.addAttribute("genre", genres)
        return "pageAdmin/genre/indexGenre"
    }
}