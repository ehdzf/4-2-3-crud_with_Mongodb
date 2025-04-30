package cat.itacademy.s04.t02.n01;

import cat.itacademy.s04.t02.n01.fruits.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

    @Autowired
    private FruitsRepository fruitsRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
