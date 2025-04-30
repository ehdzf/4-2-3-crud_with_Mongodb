package cat.itacademy.s04.t02.n01.fruits;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FruitsRepository extends MongoRepository<Fruit, String> {
}
