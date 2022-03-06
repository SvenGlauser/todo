package ch.sven.application.common;

import ch.sven.domain.common.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Dto<E extends Model> {

    private Long id;

    public Dto(E e) {
        this.id = e.getId();
    }


    /**
     * Transformer un objet DTO en objet domaine
     * @return L'objet domaine
     */
    public E toDomaine() {
        E e = this.toDomaineEntity();

        e.setId(this.id);

        return e;
    }

    /**
     * Methode à ne pas utiliser
     * Transformer un objet DTO en objet domaine
     * @return L'objet domaine
     */
    public abstract E toDomaineEntity();
}
