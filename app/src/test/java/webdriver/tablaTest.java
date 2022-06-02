package webdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import webdriver.Page.BasePage;
import webdriver.Page.tablaPage;
import webdriver.models.Usuario;

public class tablaTest {
    

    tablaPage tablaPage;

    @BeforeEach
    public void setUp(){
        tablaPage = new tablaPage();
        tablaPage.navegar();
    }

    @Test
    public void validarAmountUsuarioBob(){
        String name = "Alan";
        double valueEsperado = 12;
        Usuario usuarioExistente = null;

        List<Usuario> usuarios = tablaPage.obtenerElementosTabla();

        for(Usuario usuario : usuarios){
            if(usuario.getName().equals(name)){
                usuarioExistente = usuario;
            }
        }
      System.out.println(usuarioExistente.getName() + " , " + usuarioExistente.getAmount());
        assertEquals(valueEsperado, usuarioExistente.getAmount());
    }


    @AfterAll
    public static void closeBrowser() throws InterruptedException{
        BasePage.closeBrowser();
    }
}
