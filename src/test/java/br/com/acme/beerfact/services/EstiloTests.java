package br.com.acme.beerfact.services;

import br.com.acme.beerfact.model.Estilo;
import br.com.acme.beerfact.service.EstiloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EstiloTests {
    @Autowired
    private EstiloService estiloService;
    @Test
    public void testaInsert(){
        List<Estilo> all = estiloService.findAll();
        assertEquals(all.size(),0);
        Estilo pilsen = new Estilo();
        pilsen.setNome("Pilsen");
        estiloService.save(pilsen);
        all = estiloService.findAll();
        assertEquals(all.size(),1);

    }
    @Test
    public void testaDelete(){
        Estilo pilsen = new Estilo();
        pilsen.setNome("Pilsen");
        estiloService.save(pilsen);
        List<Estilo> all = estiloService.findAll();
        assertEquals(all.size(),1);
        estiloService.delete(1L);
        all = estiloService.findAll();
        assertEquals(all.size(),0);

    }
    @Test
    public void testaFindAll(){

    }
}
