package ch.sven.application.common;

import ch.sven.domain.common.Model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dto<E extends Model> {

    private Long id;

    public Dto() {
        // Reste vide
    }

    public Dto(E e) {
        this.id = e.getId();
    }

    public E toDomaine() {
        E e = this.toDomaineEntity();

        e.setId(this.id);

        return e;
    }

    public abstract E toDomaineEntity();
}
