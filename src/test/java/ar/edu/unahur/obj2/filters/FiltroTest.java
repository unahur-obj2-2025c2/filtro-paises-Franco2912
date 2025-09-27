package ar.edu.unahur.obj2.filters;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

class FiltroTest {

    private List<Pais> paises;

    void setUp(){
        IPaisService paisService = new PaisService();
        paises = paisService.getPaises();
    }

    @Test
    void FiltroAreaMayor(){
        IFiltro areaMayotAUnMillon = new FiltroAreaMayorA(1000000);
        List<Pais> paisesGrandes = paises.stream().filter(p -> areaMayotAUnMillon.aplicar(p)).collect(Collectors.toList());
        Set<Pais> paisesGrandes2 = paises.stream().filter(p -> areaMayotAUnMillon.aplicar(p)).collect(Collectors.toSet());
        paisesGrandes.stream().forEach(p -> System.out.print(p.toString()));
        paisesGrandes2.stream().forEach(p -> System.out.print(p.toString()));
    }

    @Test
    void FiltroporIdiomas(){
        IFiltro hablanEspanol = new FiltroPorIdioma("Spanish");
        List<Pais> hablanEnEspanol = paises.stream().filter(p -> hablanEspanol.aplicar(p)).collect(Collectors.toList());
        hablanEnEspanol.stream().forEach(p -> System.out.print(p.toString()));
    }
    
}
