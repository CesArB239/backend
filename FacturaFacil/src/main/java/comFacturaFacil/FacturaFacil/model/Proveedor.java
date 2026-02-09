package comFacturaFacil.FacturaFacil.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Proveedor {
    private Long idProveedor;
    private Long idEmpresa;
    private String Nombre;
    private String nif;
    private String direccion;
    private String telefono;
    private String email;
    private String iban;
    private Boolean activo;
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }



    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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


    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Cliente{" +

                ", idEmpresa=" + idEmpresa +
                ", Nombre='" + Nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", dirección='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", activo=" + activo +

                '}';
    }
}


