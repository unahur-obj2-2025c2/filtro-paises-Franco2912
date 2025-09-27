package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroOr extends FiltroCompuesto{

    public FiltroOr(IFiltro filtro, IFiltro nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroOr(List<IFiltro> filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }

    public FiltroOr(IFiltro filtrosNuevo){
        filtros.add(filtrosNuevo);
    }


    @Override
    public Boolean aplicar(Pais pais) {
        return filtros.stream().anyMatch(filtro -> filtro.aplicar(pais));
    }

    @Override
    public IFiltro and(IFiltro filtro) {
        return new FiltroAnd(this, filtro);
    }      
}
