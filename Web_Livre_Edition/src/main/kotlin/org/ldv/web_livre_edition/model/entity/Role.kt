package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.*

@Entity
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id : Int?,
    val nom : String
) {
}