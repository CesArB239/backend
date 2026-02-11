package com.facturafacil.model.dto;

import java.math.BigDecimal;

public class ArticuloRequestDTO {

    // FK
    private Long idEmpresa;
    private Long idSeccion;
    private Long idFamilia;
    private Long idFabricante;
    private Long idUnidadMedida;
    private Long idTarifa;

    // Datos
    private String codigo;
    private String nombre;
    private String descripcion;

    // Precios / impuestos
    private BigDecimal precioCoste;
    private BigDecimal precioVenta;
    private BigDecimal ivaPct; // 0..100

    private Boolean activo;


    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Long idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Long getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Long idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Long getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Long idFabricante) {
        this.idFabricante = idFabricante;
    }

    public Long getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Long idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public Long getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Long idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCoste() {
        return precioCoste;
    }

    public void setPrecioCoste(BigDecimal precioCoste) {
        this.precioCoste = precioCoste;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getIvaPct() {
        return ivaPct;
    }

    public void setIvaPct(BigDecimal ivaPct) {
        this.ivaPct = ivaPct;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
