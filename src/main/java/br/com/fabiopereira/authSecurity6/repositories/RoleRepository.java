package br.com.fabiopereira.authSecurity6.repositories;

import br.com.fabiopereira.authSecurity6.entities.Role;
import br.com.fabiopereira.authSecurity6.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
