package com.facturafacil.model.mapper;

import com.facturafacil.model.dto.ArticuloRequestDTO;
import com.facturafacil.model.dto.ArticuloResponseDTO;
import com.facturafacil.model.model.Articulo;

public class ArticuloMapper {

        // Constructor privado para evitar instancias (solo métodos estáticos)
        private ArticuloMapper() {
        }

        /**
         * Convierte un ArticuloRequestDTO a una entidad Articulo.
         * Se usa normalmente en CREATE (POST).
         */
        public static Articulo toEntity(ArticuloRequestDTO dto) {

            // Creamos la entidad vacía
            Articulo articulo = new Articulo();

            // Copiamos las FK (relaciones por id)
            articulo.setIdEmpresa(dto.getIdEmpresa());
            articulo.setIdSeccion(dto.getIdSeccion());
            articulo.setIdFamilia(dto.getIdFamilia());
            articulo.setIdFabricante(dto.getIdFabricante());
            articulo.setIdUnidadMedida(dto.getIdUnidadMedida());
            articulo.setIdTarifa(dto.getIdTarifa());

            // Copiamos los datos del artículo
            articulo.setCodigo(dto.getCodigo());
            articulo.setNombre(dto.getNombre());
            articulo.setDescripcion(dto.getDescripcion());

            // Copiamos precios e impuestos
            articulo.setPrecioCoste(dto.getPrecioCoste());
            articulo.setPrecioVenta(dto.getPrecioVenta());
            articulo.setIvaPct(dto.getIvaPct());

            // Copiamos el estado
            articulo.setActivo(dto.getActivo());

            // Devolvemos la entidad lista para guardar en BD
            return articulo;
        }

        /**
         * Actualiza una entidad Articulo existente usando los datos del RequestDTO.
         * Se usa normalmente en UPDATE (PUT/PATCH).
         *
         * OJO: aquí NO tocamos idArticulo, porque eso es la PK y no se modifica.
         */
        public static void updateEntity(Articulo articuloExistente, ArticuloRequestDTO dto) {

            // Actualizamos las FK
            articuloExistente.setIdEmpresa(dto.getIdEmpresa());
            articuloExistente.setIdSeccion(dto.getIdSeccion());
            articuloExistente.setIdFamilia(dto.getIdFamilia());
            articuloExistente.setIdFabricante(dto.getIdFabricante());
            articuloExistente.setIdUnidadMedida(dto.getIdUnidadMedida());
            articuloExistente.setIdTarifa(dto.getIdTarifa());

            // Actualizamos los datos
            articuloExistente.setCodigo(dto.getCodigo());
            articuloExistente.setNombre(dto.getNombre());
            articuloExistente.setDescripcion(dto.getDescripcion());

            // Actualizamos precios e impuestos
            articuloExistente.setPrecioCoste(dto.getPrecioCoste());
            articuloExistente.setPrecioVenta(dto.getPrecioVenta());
            articuloExistente.setIvaPct(dto.getIvaPct());

            // Actualizamos estado
            articuloExistente.setActivo(dto.getActivo());
        }

        /**
         * Convierte una entidad Articulo en un ArticuloResponseDTO.
         * Se usa en GET / respuestas de POST/PUT.
         */
        public static ArticuloResponseDTO toResponseDTO(Articulo articulo) {

            // Creamos el DTO de salida
            ArticuloResponseDTO dto = new ArticuloResponseDTO();

            // Copiamos PK
            dto.setIdArticulo(articulo.getIdArticulo());

            // Copiamos FK
            dto.setIdEmpresa(articulo.getIdEmpresa());
            dto.setIdSeccion(articulo.getIdSeccion());
            dto.setIdFamilia(articulo.getIdFamilia());
            dto.setIdFabricante(articulo.getIdFabricante());
            dto.setIdUnidadMedida(articulo.getIdUnidadMedida());
            dto.setIdTarifa(articulo.getIdTarifa());

            // Copiamos datos
            dto.setCodigo(articulo.getCodigo());
            dto.setNombre(articulo.getNombre());
            dto.setDescripcion(articulo.getDescripcion());

            // Copiamos precios e impuestos
            dto.setPrecioCoste(articulo.getPrecioCoste());
            dto.setPrecioVenta(articulo.getPrecioVenta());
            dto.setIvaPct(articulo.getIvaPct());

            // Copiamos estado
            dto.setActivo(articulo.getActivo());

            return dto;
        }
    }

