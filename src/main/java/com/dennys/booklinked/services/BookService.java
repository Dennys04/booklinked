package com.dennys.booklinked.services;

import com.dennys.booklinked.domains.Book;
import com.dennys.booklinked.models.BookDTO;
import com.dennys.booklinked.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    //GET: GET ALL BOOKS
    public List<BookDTO> getAllBooks(){
        List<Book> bookEntities = bookRepository.findAll();
        return bookEntities.stream().map(Book::toDTO).collect(Collectors.toList());
    }
}
