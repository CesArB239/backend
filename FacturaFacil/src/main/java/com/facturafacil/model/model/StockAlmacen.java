package com.facturafacil.model.model;

public class StockAlmacen {

    private Long id;
    private Integer unidades;
    private Articulo articulo;
    private Almacen almacen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public String toString() {
        return "StockAlmacen{" +
                "id=" + id +
                ", unidades=" + unidades +
                ", articulo=" + articulo +
                ", almacen=" + almacen +
                '}';
    }
}
