package com.example.ms_equipoTEST.controller;

import com.example.ms_equipoTEST.dto.EquipoRequestDTO;
import com.example.ms_equipoTEST.dto.EquipoResponseDTO;
import com.example.ms_equipoTEST.repository.EquipoRepository;
import com.example.ms_equipoTEST.service.EquipoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/equipo")
public class EquipoController {
    private final EquipoService equipoService;

    @PostMapping
    public ResponseEntity<EquipoResponseDTO> crearEquipo(@Valid @RequestBody EquipoRequestDTO request){
        return ResponseEntity.status(CREATED).body(equipoService.crearEquipo(request));
    }
    @GetMapping
    public ResponseEntity<List<EquipoResponseDTO>> listarEquipos(){
        return ResponseEntity.ok(equipoService.listarEquipos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<EquipoResponseDTO> listarPorId (@PathVariable Long id){
        return ResponseEntity.ok(equipoService.listarPorId(id));
    }

}
