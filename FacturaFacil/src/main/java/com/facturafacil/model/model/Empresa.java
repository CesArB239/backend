package com.facturafacil.model.model;
import java.time.LocalDate;

public class Empresa {
    private Long idEmpresa;
    private String nombre;
    private String cif;
    private String direccion;
    private String cp;
    private String provincia;
    private String telefono;
    private String email;
    private String SerieFacturacion;
    private LocalDate fechaAlta;

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSerieFacturacion() {
        return SerieFacturacion;
    }

    public void setSerieFacturacion(String serieFacturacion) {
        SerieFacturacion = serieFacturacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cp='" + cp + '\'' +
                ", provincia='" + provincia + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", SerieFacturacion='" + SerieFacturacion + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
