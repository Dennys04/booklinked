package com.dennys.booklinked.repositories;

import com.dennys.booklinked.domains.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
