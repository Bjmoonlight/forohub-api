package com.aluracursos.forohub.domain.usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String clave;

    public Usuario() {}

    public Usuario(String login, String clave) {
        this.login = login;
        this.clave = clave;
    }

    public Long getId() { return id; }
    public String getLogin() { return login; }
    public String getClave() { return clave; }
}