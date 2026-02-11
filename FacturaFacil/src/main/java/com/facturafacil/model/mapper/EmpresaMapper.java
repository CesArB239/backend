package com.facturafacil.model.mapper;


import com.facturafacil.model.dto.ArticuloResponseDTO;
import com.facturafacil.model.dto.EmpresaRequestDTO;
import com.facturafacil.model.dto.EmpresaResponseDTO;
import com.facturafacil.model.model.Empresa;

public class EmpresaMapper {

    // Constructor privado para evitar instancias (solo métodos estáticos)
    private EmpresaMapper() {
    }

    /**
     * Convierte un ArticuloRequestDTO a una entidad Articulo.
     * Se usa normalmente en CREATE (POST).
     */

    public static Empresa toEntity(EmpresaRequestDTO dto) {

        // Creamos un objeto Empresa vacío
        Empresa empresa = new Empresa();

        // Copiamos el ID de la empresa desde el DTO
        // Esto sirve cuando estamos editando una empresa existente
        empresa.setIdEmpresa(dto.getIdEmpresa());

        // Copiamos los datos básicos de la empresa
        empresa.setNombre(dto.getNombre());
        empresa.setCif(dto.getCif());
        empresa.setDireccion(dto.getDireccion());
        empresa.setCp(dto.getCp());
        empresa.setProvincia(dto.getProvincia());
        empresa.setTelefono(dto.getTelefono());
        empresa.setEmail(dto.getEmail());

        //  Copiamos la serie de facturación
        empresa.setSerieFacturacion(dto.getSerieFacturacion());

        // Copiamos la fecha de alta
        empresa.setFechaAlta(dto.getFechaAlta());

        // 6Devolvemos la entidad lista para guardarse en base de datos
        return empresa;
    }

    /**
     * Actualiza una entidad Articulo existente usando los datos del RequestDTO.
     * Se usa normalmente en UPDATE (PUT/PATCH).
     *
     * OJO: aquí NO tocamos idArticulo, porque eso es la PK y no se modifica.
     */
    public static void updateEntity(Empresa empresaExistente, EmpresaRequestDTO dto) {

        // IMPORTANTE:
        // Normalmente NO se actualiza el ID, porque ya identifica a la empresa en BD.
        // Solo lo pondrías si estás creando la entidad desde cero.
        // empresaExistente.setIdEmpresa(dto.getIdEmpresa());

        // 1️ Actualizamos los datos básicos de la empresa
        empresaExistente.setNombre(dto.getNombre());
        empresaExistente.setCif(dto.getCif());
        empresaExistente.setDireccion(dto.getDireccion());
        empresaExistente.setCp(dto.getCp());
        empresaExistente.setProvincia(dto.getProvincia());
        empresaExistente.setTelefono(dto.getTelefono());
        empresaExistente.setEmail(dto.getEmail());

        // 2️Actualizamos la serie de facturación
        empresaExistente.setSerieFacturacion(dto.getSerieFacturacion());

        // Actualizamos la fecha de alta
        // Si tu lógica dice que la fecha de alta NO debe cambiar nunca,
        // entonces NO la actualices aquí.
        empresaExistente.setFechaAlta(dto.getFechaAlta());
    }


    /**
     * Convierte una entidad Articulo en un ArticuloResponseDTO.
     * Se usa en GET / respuestas de POST/PUT.
     */
    public static EmpresaResponseDTO toResponseDTO(Empresa empresa) {

        //  Validamos que la empresa no sea null para evitar NullPointerException
        if (empresa == null) {
            return null;
        }

        // Creamos el DTO de salida
        EmpresaResponseDTO dto = new EmpresaResponseDTO();

        //  Copiamos la clave primaria (ID)
        dto.setIdEmpresa(empresa.getIdEmpresa());

        // Copiamos los datos básicos
        dto.setNombre(empresa.getNombre());
        dto.setCif(empresa.getCif());
        dto.setDireccion(empresa.getDireccion());
        dto.setCp(empresa.getCp());
        dto.setProvincia(empresa.getProvincia());
        dto.setTelefono(empresa.getTelefono());
        dto.setEmail(empresa.getEmail());

        //  Copiamos la serie de facturación
        dto.setSerieFacturacion(empresa.getSerieFacturacion());

        //  Copiamos la fecha de alta
        dto.setFechaAlta(empresa.getFechaAlta());

        //  Devolvemos el DTO listo para devolverlo en la API
        return dto;
    }


}

