package by.innowise.demo.controllers;



import by.innowise.demo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DogController {

    @Autowired
    private DogService service;

    @GetMapping(value = "/", produces = "image/jpeg")
    public byte[] getAll() throws IOException {
        return service.getDog();
    }
}
