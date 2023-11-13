package tests;

import core.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PrincipalPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscaTest {
    PrincipalPage principalPage;

    @BeforeEach
    public void inicializaTeste(){
        Driver.inicializaDriver("https://blogdoagi.com.br/");
        principalPage = new PrincipalPage();
    }

    @AfterEach
    public void finalizaTeste(){
        Driver.getDriver().quit();
    }

    @Test
    public void realizaBuscaDeValorValido(){
        principalPage.clickLupa();
        principalPage.setBusca("AgiBank");
        principalPage.clickPesquisa();
        assertEquals("Resultados da busca por: AgiBank",principalPage.getResultado());
    }

    @Test
    public void realizaBuscaDeValorInexistente(){
        principalPage.clickLupa();
        principalPage.setBusca("xptqo");
        principalPage.clickPesquisa();
        assertEquals("Nenhum resultado",principalPage.getResultado());
    }

}
