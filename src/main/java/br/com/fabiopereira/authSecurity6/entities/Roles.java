package br.com.fabiopereira.authSecurity6.entities;

public enum Roles {
    BASIC(1L),
    ADMIN(2L);

    Long id;

    Roles(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
