package br.com.fabiopereira.authSecurity6.controller.dto;

public record LoginResponse(
        String accessToken,
        Long expiresIn
) {
}
