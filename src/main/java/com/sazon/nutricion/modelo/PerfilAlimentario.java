package com.sazon.nutricion.modelo;

import java.util.Objects;

public class PerfilAlimentario {

    private Long id;
    private String tipoDieta;
    private Integer caloríasDiarias;
    private Double pesoKg;
    private Double estaturaCm;
    private Long idUsuario;

    public PerfilAlimentario() {
    }

    public PerfilAlimentario(Long id, String tipoDieta, Integer caloríasDiarias, Double pesoKg, Double estaturaCm, Long idUsuario) {
        this.id = id;
        this.tipoDieta = tipoDieta;
        this.caloríasDiarias = caloríasDiarias;
        this.pesoKg = pesoKg;
        this.estaturaCm = estaturaCm;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    public Integer getCaloríasDiarias() {
        return caloríasDiarias;
    }

    public void setCaloríasDiarias(Integer caloríasDiarias) {
        this.caloríasDiarias = caloríasDiarias;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getEstaturaCm() {
        return estaturaCm;
    }

    public void setEstaturaCm(Double estaturaCm) {
        this.estaturaCm = estaturaCm;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "PerfilAlimentario{" +
                "id=" + id +
                ", tipoDieta='" + tipoDieta + '\'' +
                ", caloríasDiarias=" + caloríasDiarias +
                ", pesoKg=" + pesoKg +
                ", estaturaCm=" + estaturaCm +
                ", idUsuario=" + idUsuario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerfilAlimentario that = (PerfilAlimentario) o;
        return Objects.equals(id, that.id) &&
               Objects.equals(tipoDieta, that.tipoDieta) &&
               Objects.equals(caloríasDiarias, that.caloríasDiarias) &&
               Objects.equals(pesoKg, that.pesoKg) &&
               Objects.equals(estaturaCm, that.estaturaCm) &&
               Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoDieta, caloríasDiarias, pesoKg, estaturaCm, idUsuario);
    }
}
