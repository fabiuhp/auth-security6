package br.com.fabiopereira.authSecurity6.repositories;

import br.com.fabiopereira.authSecurity6.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
