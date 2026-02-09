package comFacturaFacil.FacturaFacil.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cliente {
    private Long idCliente;
    private Long idEmpresa;
    private Long idTipoCliente;
    private Long idAgente;
    private Long idRuta;
    private String Nombre;
    private String nif;
    private String dirección;
    private String telefono;
    private String email;
    private BigDecimal limiteCredito;
    private BigDecimal descuentoGeneral; // 0..100
    private Boolean activo;
    private LocalDate fechaAlta;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(Long idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public Long getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Long idAgente) {
        this.idAgente = idAgente;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
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

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getDescuentoGeneral() {
        return descuentoGeneral;
    }

    public void setDescuentoGeneral(BigDecimal descuentoGeneral) {
        this.descuentoGeneral = descuentoGeneral;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", idEmpresa=" + idEmpresa +
                ", idTipoCliente=" + idTipoCliente +
                ", idAgente=" + idAgente +
                ", idRuta=" + idRuta +
                ", Nombre='" + Nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", dirección='" + dirección + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", descuentoGeneral=" + descuentoGeneral +
                ", activo=" + activo +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
