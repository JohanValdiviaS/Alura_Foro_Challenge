package com.cristhianvaldivia.foro_alura.domain.respuesta.validaciones.crear;

import com.cristhianvaldivia.foro_alura.domain.topico.Estado;
import com.cristhianvaldivia.foro_alura.domain.topico.TopicoRepository;
import com.cristhianvaldivia.foro_alura.domain.respuesta.CrearRespuestaDTO;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopicoValida implements ValidarRespuestaCreada {

    @Autowired
    private TopicoRepository repository;

    @Override
    public void validate(CrearRespuestaDTO data) {
        var topicoExiste = repository.existsById(data.topicoId());

        if (!topicoExiste){
            throw new ValidationException("Este topico no existe.");
        }

        var topicoAbierto = repository.findById(data.topicoId()).get().getEstado();

        if(topicoAbierto != Estado.OPEN){
            throw new ValidationException("Este topico no esta abierto.");
        }

    }
}

