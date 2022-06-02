package webdriver;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import webdriver.Page.BasePage;
import webdriver.Page.formularioPage;

public class formularioTest {
    
    formularioPage formularioPage;

    @BeforeEach
    public void setUp(){
        formularioPage = new formularioPage();
        formularioPage.navegar();
    }

    @Test
    public void llenarFormulario (){
        formularioPage.selectColor("#3CB371");
        formularioPage.selecionarFecha("06/15/2022");
        formularioPage.selecionarFechaPicker("2020-12-04T09:34");
        formularioPage.selecionarCorreo("arodicontreras@hotmail.com");
        formularioPage.selecionarMes("2022-11");
        formularioPage.selecionarNumero("8");
        formularioPage.darclick();

        //Validar Color
        String color = formularioPage.obtenerColor();
        String colorEsperado =  "#3cb371";
        assertEquals(colorEsperado, color);

        //Validar fecha
        String fecha = formularioPage.obtenerFecha();
        String fechaEsperada =  "2022-12-06";
        assertEquals(fechaEsperada, fecha);

        //Validar fechaLocal
        String fechaLocal = formularioPage.obtenerFechaLocal();
        String fechaLocalEsperada =  "2020-12-04T09:34";
        assertEquals(fechaLocalEsperada, fechaLocal);

        //Validar Email
        String email = formularioPage.obtenerEmail();
        String emailEsperado =  "arodicontreras@hotmail.com";
        assertEquals(emailEsperado, email);

        //Validar Mes
        String mes = formularioPage.obtenerMes();
        String mesEsperado =  "2022-11";
        assertEquals(mesEsperado, mes);
        //Validar Numero UWU
        String numero = formularioPage.obtenerNumero();
        String numeroEsperado =  "8";
        assertEquals(numeroEsperado, numero);



    }

    public void validarColor(){
        
    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException{
        Thread.sleep(5000);
        BasePage.closeBrowser();
    }


}
