package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(nome = 'generos' )
public class Genero {
    @id
    @GeneroValue
    private int id;
}
