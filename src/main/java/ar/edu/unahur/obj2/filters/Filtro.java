package ar.edu.unahur.obj2.filters;

public abstract class Filtro implements IFiltro{
    
    @Override
    public IFiltro or(IFiltro filtro){
        return new FiltroOr(this, filtro);
    }

    @Override
    public IFiltro and(IFiltro filtro){
        return new FiltroAnd(this, filtro);
    }
}
