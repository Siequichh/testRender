package com.siequichh.demorender.request;

import lombok.Data;

@Data
public class PersonaRequest {
        private String DNI;
        private String Nombre;
        private String Apellido;
        private String Direccion;
        private String Telefono;
        private String Email;
        private Integer Edad;
        private String Sexo;
        private String Pais;
}
