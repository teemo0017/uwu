package webdriver.Page;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;

import webdriver.models.Usuario;

public class tablaPage extends BasePage {

    public tablaPage() {
        super(driver);

    }

    public void navegar(){
        navegateTo("https://testpages.herokuapp.com/styled/tag/table.html");
    }

    public String divTable = "/html[1]/body[1]/div[1]/div[3]/div[1]";
    
    public List<Usuario> obtenerElementosTabla(){
        List<Usuario> usuarios = new ArrayList<>();
        List<WebElement> rows = obtenerFilas(divTable);
        obtenerUsuarios(usuarios, rows);
        return usuarios;
    }

    
    private void obtenerUsuarios(List<Usuario> usuarios, List<WebElement> rows) {
        for(WebElement row : rows){
            List<WebElement> tds = obtenerTds(row);
            if(tds != null && tds.size()> 0){
                Usuario usuario = new Usuario();
                usuario.setName(tds.get(0).getText());
                usuario.setAmount(Double.parseDouble(tds.get(1).getText()));
                usuarios.add(usuario);
            }
        }
    }

    // private void modificarLista(List<Usuario> usuarios){
    //     for(Usuario usuario: usuarios){
    //         usuario.setAmount(usuario.getAmount()+1);
    //     }
    // }
}
