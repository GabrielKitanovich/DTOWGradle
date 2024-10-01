package com.example.demo.business.facade;

import com.example.demo.domain.dtos.PersonaFullDto;
import com.example.demo.domain.dtos.PersonaShortDto;

public interface IPersonaFacade {
    PersonaFullDto crear(PersonaFullDto nuevaPersonaDto);
    PersonaFullDto getAllDataById(Long id);

    PersonaShortDto getShortDataById(Long id);

}
