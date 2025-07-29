package br.com.dio.BoardDio.repository;

import br.com.dio.BoardDio.model.Task;
import br.com.dio.BoardDio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}


