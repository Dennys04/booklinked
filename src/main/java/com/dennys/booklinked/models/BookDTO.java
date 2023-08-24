package com.dennys.booklinked.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookDTO {

    private long id_book;
    private String title;
    private long id_author;
    private long id_editorial;
    private long id_genre;
    private String description;
    private String photo;

}
