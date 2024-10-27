package br.com.fabiopereira.authSecurity6.controller.dto;

public record LoginRequest(
        String username,
        String password
) {
}
