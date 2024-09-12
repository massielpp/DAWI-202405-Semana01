package com.prestamo.controller;

import com.prestamo.entity.Pais;
import com.prestamo.service.PaisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/url/pais")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping("/lista")
    public List<Pais> getAllPaises() {
        return paisService.findAll();
    }
}
