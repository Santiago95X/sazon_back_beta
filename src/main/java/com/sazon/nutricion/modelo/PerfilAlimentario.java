package com.sazon.nutricion.modelo;

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTipoDieta() { return tipoDieta; }
    public void setTipoDieta(String tipoDieta) { this.tipoDieta = tipoDieta; }
    public Integer getCaloríasDiarias() { return caloríasDiarias; }
    public void setCaloríasDiarias(Integer caloríasDiarias) { this.caloríasDiarias = caloríasDiarias; }
    public Double getPesoKg() { return pesoKg; }
    public void setPesoKg(Double pesoKg) { this.pesoKg = pesoKg; }
    public Double getEstaturaCm() { return estaturaCm; }
    public void setEstaturaCm(Double estaturaCm) { this.estaturaCm = estaturaCm; }
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

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
}
