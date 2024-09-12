package com.prestamo.service;

import com.prestamo.entity.Pais;
import com.prestamo.repository.PaisRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    private final PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }
}
