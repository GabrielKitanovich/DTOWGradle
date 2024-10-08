package com.example.demo.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonaFullDto {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaDeNacimiento;
    private DomicilioDto domicilio;
}
