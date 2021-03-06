package ch.sven.infrastructure.common;

import ch.sven.domain.common.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class Dao<E extends Model> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Dao(E e) {
        this.id = e.getId();
    }

    public E toDomaine() {
        E e = this.toDomaineEntity();

        e.setId(this.id);

        return e;
    }

    public abstract E toDomaineEntity();
}
