package org.ldv.web_livre_edition.model.dao

import org.ldv.web_livre_edition.model.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleDAO : JpaRepository<Role, Long> {
}
