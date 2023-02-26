package bj.limited.stalkerjokesgenerator.service;

import bj.limited.stalkerjokesgenerator.dao.JokeDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StalkerJokesGeneratorServiceImpl implements StalkerJokesGeneratorService {

    private final JokeDao jokeDao;

    @Override
    public String generateRandomJoke() {
        return jokeDao.findById(1).get().getText();
    }
}
