package telran.java2022.book.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "isbn")
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 7934730430500833561L;


    @Id
    String isbn;
    String title;
    @ManyToMany
    Set<Author> author;
    @ManyToOne
    Publisher publisher;
}
