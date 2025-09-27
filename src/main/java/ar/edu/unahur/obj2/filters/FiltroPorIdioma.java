package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorIdioma extends Filtro{
    private final String idioma;

    public FiltroPorIdioma(String idioma) {
        this.idioma = idioma;
    }

    // @Override
    // public Boolean aplicar(Pais pais){
    //     return pais.getIdiomas().contains(idioma);
    // }

    @Override
    public Boolean aplicar(Pais pais){
        return pais.getIdiomas().stream().anyMatch(i -> i.equals(idioma));
    }


}
