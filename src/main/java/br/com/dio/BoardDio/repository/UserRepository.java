package br.com.dio.BoardDio.repository;

import br.com.dio.BoardDio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
