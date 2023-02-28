package bj.limited.stalkerjokesgenerator.service;

import bj.limited.stalkerjokesgenerator.api.dto.JokeResponse;
import bj.limited.stalkerjokesgenerator.dao.JokeDao;
import bj.limited.stalkerjokesgenerator.dao.entity.Joke;
import bj.limited.stalkerjokesgenerator.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class StalkerJokesGeneratorServiceImpl implements StalkerJokesGeneratorService {

    private final JokeDao jokeDao;

    @Override
    public JokeResponse generateRandomJoke() {
        long count = jokeDao.count();

        Random random = new Random();
        Integer randomId = random.ints(1, (int) count).findFirst().orElseThrow(() -> new NotFoundException("Rnd id is not found"));

        Joke joke = jokeDao.findById(randomId).orElseThrow(() -> new NotFoundException("Joke is not found"));
        return new JokeResponse(joke.getTitle(), joke.getText());
    }
}
