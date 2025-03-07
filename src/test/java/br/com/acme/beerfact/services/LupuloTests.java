package br.com.acme.beerfact.services;

import br.com.acme.beerfact.model.Lupulo;
import br.com.acme.beerfact.service.LupuloService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Profile("prod")
public class LupuloTests {
    @Autowired
    LupuloService lupuloService;
    @Test
    @DisplayName("Deve testar o findAll Paginado")
    public void testaFindAll(){
        List<Lupulo> all = lupuloService.findAll();
        assertEquals(16,all.size());
        List<Lupulo> paginado1 = lupuloService.findAll(0, 10);
        assertEquals(10,paginado1.size());
        List<Lupulo> paginado2 = lupuloService.findAll(1, 10);
        assertEquals(6,paginado2.size());

        List<Lupulo> paginado3 = lupuloService.findAll(0, 10, false);
        Lupulo lupulo1 = paginado1.get(0);
        Lupulo lupulo2 = paginado3.get(0);
        System.out.println(lupulo1.getNome());
        System.out.println(lupulo2.getNome());
        assertNotEquals(lupulo1.getNome(), lupulo2.getNome());


    }
    @Test
    @DisplayName("Deve testar uma busca simples pelo nome")
    public void testaFindByName(){
        Lupulo naoExiste = lupuloService.findAllByName("TTT");
        assertNull(naoExiste);
        Lupulo existe = lupuloService.findAllByName("Amarillo");
        assertNotNull(existe);
        assertEquals(existe.getNome(),"Amarillo");

    }
    @Test
    @DisplayName("Deve testar uma busca de like pelo nome")
    public void testaFindByNamecontains(){
        List<Lupulo> lupulos = lupuloService.findAllByNomeContains("a");
        assertEquals(2,lupulos.size());
        List<Lupulo> lupulos2 = lupuloService.findAllByNomeContains("A");
        assertEquals(2,lupulos.size());
    }
}
