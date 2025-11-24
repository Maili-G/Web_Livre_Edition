package org.ldv.web_livre_edition.controller.admincontrollers

import org.ldv.web_livre_edition.model.dao.GenreDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class AdminGenreController(
    val genreDAO: GenreDAO
) {
    @GetMapping("/web_livre_edition/admin/genre")
    fun index(model: Model): String{
        val genres = genreDAO.findAll()
        model.addAttribute("genres", genres)
        return "pageAdmin/genre/indexGenre"
    }

    @GetMapping("web_livre_edition/admin/genre/{id}")
    fun show(@PathVariable id: Long, model: Model): String {
        val unGenre = genreDAO.findById(id).orElseThrow()
        model.addAttribute("genre", unGenre)
        return "pageAdmin/genre/showGenre"
    }
}