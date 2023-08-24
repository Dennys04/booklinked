package com.dennys.booklinked.repositories;

import com.dennys.booklinked.domains.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
