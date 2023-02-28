package bj.limited.stalkerjokesgenerator.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class JokeResponse {
    private String title;
    private String value;
}
