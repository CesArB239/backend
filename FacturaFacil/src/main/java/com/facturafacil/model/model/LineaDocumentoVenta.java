package com.facturafacil.model.model;

import java.math.BigDecimal;

public class LineaDocumentoVenta {

        private Long idLinea;

        // FK a la cabecera
        private Long idDocumentoVenta;

        private Long idArticulo;

        private BigDecimal cantidad;
        private BigDecimal precioUnitario;
        private BigDecimal descuentoPct;
        private BigDecimal ivaPct;

        private BigDecimal subtotalLinea;
        private BigDecimal totalLinea;

    public Long getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Long idLinea) {
        this.idLinea = idLinea;
    }

    public Long getIdDocumentoVenta() {
        return idDocumentoVenta;
    }

    public void setIdDocumentoVenta(Long idDocumentoVenta) {
        this.idDocumentoVenta = idDocumentoVenta;
    }

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getDescuentoPct() {
        return descuentoPct;
    }

    public void setDescuentoPct(BigDecimal descuentoPct) {
        this.descuentoPct = descuentoPct;
    }

    public BigDecimal getIvaPct() {
        return ivaPct;
    }

    public void setIvaPct(BigDecimal ivaPct) {
        this.ivaPct = ivaPct;
    }

    public BigDecimal getSubtotalLinea() {
        return subtotalLinea;
    }

    public void setSubtotalLinea(BigDecimal subtotalLinea) {
        this.subtotalLinea = subtotalLinea;
    }

    public BigDecimal getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea(BigDecimal totalLinea) {
        this.totalLinea = totalLinea;
    }

    @Override
    public String toString() {
        return "LineaDocumentoVenta{" +
                "idLinea=" + idLinea +
                ", idDocumentoVenta=" + idDocumentoVenta +
                ", idArticulo=" + idArticulo +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", descuentoPct=" + descuentoPct +
                ", ivaPct=" + ivaPct +
                ", subtotalLinea=" + subtotalLinea +
                ", totalLinea=" + totalLinea +
                '}';
    }
}

