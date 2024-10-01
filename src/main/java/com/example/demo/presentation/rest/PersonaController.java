package com.example.demo.presentation.rest;

import com.example.demo.business.facade.IPersonaFacade;
import com.example.demo.domain.dtos.PersonaFullDto;
import com.example.demo.domain.dtos.PersonaShortDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private IPersonaFacade personaFacade;

    @GetMapping("/all/{id}")
    public ResponseEntity<PersonaFullDto> getAllDataById(@PathVariable Long id) {
        return ResponseEntity.ok().body(personaFacade.getAllDataById(id));
    }
    @GetMapping("/short/{id}")
    public ResponseEntity<PersonaShortDto> getShortDataById(@PathVariable Long id){
        return ResponseEntity.ok().body(personaFacade.getShortDataById(id));
    }

    @PostMapping()
    public ResponseEntity<PersonaFullDto> crear(@RequestBody PersonaFullDto personaFullDto){
        return ResponseEntity.ok().body(personaFacade.crear(personaFullDto));
    }
}
