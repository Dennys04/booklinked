package com.dennys.booklinked.controllers;

import com.dennys.booklinked.models.LibroDTO;
import com.dennys.booklinked.services.LibroServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/books")
public class LibroController {

    private final LibroServicio libroServicio;

    @GetMapping
    public ResponseEntity<List<LibroDTO>> getAllLibros(){
        List<LibroDTO> libros = libroServicio.getAllLibros();
        return new ResponseEntity<>(libros, HttpStatus.OK);
    }
}
