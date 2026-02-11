package com.facturafacil.model.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DocumentoCompra {


        private Long idDocumentoCompra;
        private Empresa empresa;
        private Proveedor proveedor;
        private TipoDocumentoCompra tipoDocumento;
        private String serie;
        private Long numero;
        private LocalDate fechaEmision;
        private EstadoDocumento estado;
        private BigDecimal subtotal;
        private BigDecimal impuestosTotal;
        private BigDecimal total;
        private String observaciones;

    public Long getIdDocumentoCompra() {
        return idDocumentoCompra;
    }

    public void setIdDocumentoCompra(Long idDocumentoCompra) {
        this.idDocumentoCompra = idDocumentoCompra;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public TipoDocumentoCompra getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoCompra tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public EstadoDocumento getEstado() {
        return estado;
    }

    public void setEstado(EstadoDocumento estado) {
        this.estado = estado;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getImpuestosTotal() {
        return impuestosTotal;
    }

    public void setImpuestosTotal(BigDecimal impuestosTotal) {
        this.impuestosTotal = impuestosTotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}


