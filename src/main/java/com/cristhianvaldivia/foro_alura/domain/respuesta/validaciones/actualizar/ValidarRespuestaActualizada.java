package com.cristhianvaldivia.foro_alura.domain.respuesta.validaciones.actualizar;

import com.cristhianvaldivia.foro_alura.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
