package ar.edu.unahur.obj2.model;

import java.util.List;

public class Pais {
    private final String nombre;
    private final String capital; 
    private final String region;
    private final String subRegion; 
    private final Long poblacion;
    private final List<String> idiomas;
    private final List<String> limites;
    private final Integer area;

    public Pais(DatosPais dp){
        this.nombre = dp.nombre();
        this.capital = dp.capital();
        this.region = dp.region();
        this.subRegion = dp.subRegion();
        this.poblacion = dp.poblacion();
        this.idiomas = dp.idiomas().stream()
                .map(Idioma::name)
                .toList();
        this.limites = dp.limites();
        this.area = dp.area() != null ? dp.area() : 0;
    }

    public Boolean esIsla(){
        return this.limites == null || this.limites.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public Integer getArea(){
        return area;
    }

    public List<String> getLimites(){
        return limites;
    }

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", capital=" + capital + ", region=" + region + ", subRegion=" + subRegion
                + ", poblacion=" + poblacion + ", idiomas=" + idiomas + ", esIsla()=" + esIsla() + "]";
    }

    

}

