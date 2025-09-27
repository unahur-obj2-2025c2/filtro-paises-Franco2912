package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public interface IFiltro {

    Boolean aplicar(Pais pais);

    IFiltro or(IFiltro filtro);
    IFiltro and(IFiltro filtro);
}
