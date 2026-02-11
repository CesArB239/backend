package com.facturafacil.model.mapper;

import com.facturafacil.model.dto.ClienteRequestDTO;
import com.facturafacil.model.dto.ClienteResponseDTO;
import com.facturafacil.model.model.Cliente;

public class ClienteMapper {

    // Constructor privado → evita crear objetos de esta clase
    private ClienteMapper() {
    }

    /**
     * Convierte un ClienteRequestDTO a entidad Cliente.
     * Se usa en CREATE (POST).
     */
    public static Cliente toEntity(ClienteRequestDTO dto) {

        // Creamos la entidad vacía
        Cliente cliente = new Cliente();

        // Copiamos claves foráneas (IDs de relaciones)
        cliente.setIdEmpresa(dto.getIdEmpresa());
        cliente.setIdTipoCliente(dto.getIdTipoCliente());
        cliente.setIdAgente(dto.getIdAgente());
        cliente.setIdRuta(dto.getIdRuta());

        // Copiamos datos básicos
        cliente.setNombre(dto.getNombre());
        cliente.setNif(dto.getNif());
        cliente.setDireccion(dto.getDireccion());
        cliente.setTelefono(dto.getTelefono());
        cliente.setEmail(dto.getEmail());

        // Copiamos datos comerciales
        cliente.setLimiteCredito(dto.getLimiteCredito());
        cliente.setDescuentoGeneral(dto.getDescuentoGeneral());

        // Copiamos estado y fecha
        cliente.setActivo(dto.getActivo());
        cliente.setFechaAlta(dto.getFechaAlta());

        // Devolvemos la entidad lista para guardar
        return cliente;
    }

    /**
     * Actualiza un Cliente existente con datos del RequestDTO.
     * Se usa en UPDATE (PUT/PATCH).
     *
     * IMPORTANTE:
     * NO tocamos idCliente porque es la clave primaria.
     */
    public static void updateEntity(Cliente clienteExistente, ClienteRequestDTO dto) {

        // Actualizamos claves foráneas
        clienteExistente.setIdEmpresa(dto.getIdEmpresa());
        clienteExistente.setIdTipoCliente(dto.getIdTipoCliente());
        clienteExistente.setIdAgente(dto.getIdAgente());
        clienteExistente.setIdRuta(dto.getIdRuta());

        // Actualizamos datos básicos
        clienteExistente.setNombre(dto.getNombre());
        clienteExistente.setNif(dto.getNif());
        clienteExistente.setDireccion(dto.getDireccion());
        clienteExistente.setTelefono(dto.getTelefono());
        clienteExistente.setEmail(dto.getEmail());

        // Actualizamos datos comerciales
        clienteExistente.setLimiteCredito(dto.getLimiteCredito());
        clienteExistente.setDescuentoGeneral(dto.getDescuentoGeneral());

        // Actualizamos estado y fecha
        clienteExistente.setActivo(dto.getActivo());
        clienteExistente.setFechaAlta(dto.getFechaAlta());
    }

    /**
     * Convierte una entidad Cliente en ClienteResponseDTO.
     * Se usa en respuestas GET / POST / PUT.
     */
    public static ClienteResponseDTO toResponseDTO(Cliente cliente) {

        // Creamos DTO de salida
        ClienteResponseDTO dto = new ClienteResponseDTO();

        // Copiamos clave primaria
        dto.setIdCliente(cliente.getIdCliente());

        // Copiamos claves foráneas
        dto.setIdEmpresa(cliente.getIdEmpresa());
        dto.setIdTipoCliente(cliente.getIdTipoCliente());
        dto.setIdAgente(cliente.getIdAgente());
        dto.setIdRuta(cliente.getIdRuta());

        // Copiamos datos básicos
        dto.setNombre(cliente.getNombre());
        dto.setNif(cliente.getNif());
        dto.setDireccion(cliente.getDireccion());
        dto.setTelefono(cliente.getTelefono());
        dto.setEmail(cliente.getEmail());

        // Copiamos datos comerciales
        dto.setLimiteCredito(cliente.getLimiteCredito());
        dto.setDescuentoGeneral(cliente.getDescuentoGeneral());

        // Copiamos estado y fecha
        dto.setActivo(cliente.getActivo());
        dto.setFechaAlta(cliente.getFechaAlta());

        return dto;
    }
}