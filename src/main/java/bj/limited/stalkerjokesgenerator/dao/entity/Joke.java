package bj.limited.stalkerjokesgenerator.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Joke {

    @Id
    private Integer id;

    private String text;
}
