package com.dennys.booklinked.domains;


import com.dennys.booklinked.models.LibroDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_libro;

    private String titulo;

    private boolean tapa_dura;

    private boolean original;

    private long id_autor;

    private long id_editorial;

    private long id_genero;

    private String descripcion;

    private int paginas;

    private String foto_portada;

    private long id_idioma;

    public LibroDTO toDTO() {
        return LibroDTO.builder()
                .id_libro(id_libro)
                .titulo(titulo)
                .tapa_dura(tapa_dura)
                .original(original)
                .id_autor(id_autor)
                .id_editorial(id_editorial)
                .id_genero(id_genero)
                .descripcion(descripcion)
                .paginas(paginas)
                .foto_portada(foto_portada)
                .id_idioma(id_idioma)
                .build();
    }


}
