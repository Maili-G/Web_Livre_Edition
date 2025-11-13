package org.ldv.web_livre_edition.model.entity

import jakarta.persistence.*

@Entity
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id : Int?,
    val nom : String,

    //Association avec Utilisateur

    @OneToMany(mappedBy = "utilisateur", cascade = [CascadeType.ALL], orphanRemoval = true)

    var utilisateur : MutableList<Utilisateur> = mutableListOf()
) {
}