package bj.limited.stalkerjokesgenerator.api.http;

import bj.limited.stalkerjokesgenerator.service.StalkerJokesGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/joke")
public class StalkerJokesGeneratorRestController {

    private final StalkerJokesGeneratorService stalkerJokesGeneratorService;

    @GetMapping("/random")
    public String getJoke() {
        return stalkerJokesGeneratorService.generateRandomJoke();
    }


}
