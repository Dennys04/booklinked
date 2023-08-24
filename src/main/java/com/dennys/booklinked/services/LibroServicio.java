package com.dennys.booklinked.services;

import com.dennys.booklinked.domains.Libro;
import com.dennys.booklinked.models.LibroDTO;
import com.dennys.booklinked.repositories.LibroRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LibroServicio {

    private final LibroRepositorio libroRepositorio;

    //GET: GET ALL BOOKS
    public List<LibroDTO> getAllLibros(){
        List<Libro> libroEntities = libroRepositorio.findAll();
        return libroEntities.stream().map(Libro::toDTO).collect(Collectors.toList());
    }
}
