package org.ldv.web_livre_edition.controller.admincontrollers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {
    @GetMapping("/web_livre_edition/admin")
    fun home(): String{
        return "pageAdmin/dashboard"
    }

}