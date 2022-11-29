package telran.java2022.book.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "name")
@Entity
public class Author implements Serializable {
    private static final long serialVersionUID = 7224662755462564108L;

    @Id
    String name;
    LocalDate birthDate;

}
