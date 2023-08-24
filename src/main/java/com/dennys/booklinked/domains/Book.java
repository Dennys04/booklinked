package com.dennys.booklinked.domains;


import com.dennys.booklinked.models.BookDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_book;

    private String title;
    private long id_author;
    private long id_editorial;
    private long id_genre;
    private String description;
    private String photo;


    public BookDTO toDTO() {
        return BookDTO.builder()
                .id_book(id_book)
                .title(title)
                .id_author(id_author)
                .id_editorial(id_editorial)
                .id_genre(id_genre)
                .description(description)
                .photo(photo)
                .build();
    }


}
