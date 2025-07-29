package br.com.dio.BoardDio;

import br.com.dio.BoardDio.model.Task;
import br.com.dio.BoardDio.model.User;
import br.com.dio.BoardDio.repository.TaskRepository;
import br.com.dio.BoardDio.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BoardDioApplication {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(BoardDioApplication.class, args);
    }

    @PostConstruct
    public void init() {
        User user = new User();
        user.setName("João");
        userRepository.save(user);

        Task task = new Task();
        task.setTitle("Tarefa 1");
        task.setDescription("Descrição da tarefa 1");
        task.setUser(user);
        taskRepository.save(task);
    }
}


