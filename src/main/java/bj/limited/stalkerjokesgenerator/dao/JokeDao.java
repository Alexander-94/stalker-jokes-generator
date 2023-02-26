package bj.limited.stalkerjokesgenerator.dao;

import bj.limited.stalkerjokesgenerator.dao.entity.Joke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeDao extends CrudRepository<Joke, Integer> {

}
