package com.dennys.booklinked.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class LibroDTO {

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

}
