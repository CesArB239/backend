package com.facturafacil.model.model;

public class Almacen {
    private String codigo;

    private String domicilio;


    private String contacto;

    private Empresa empresa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "codigo='" + codigo + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", contacto='" + contacto + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
