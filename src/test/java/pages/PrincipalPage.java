package pages;

import core.Driver;
import maps.PrincipalMaps;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {

    PrincipalMaps principalMaps;

    public PrincipalPage(){
        principalMaps = new PrincipalMaps();
        PageFactory.initElements(Driver.getDriver(), principalMaps);
    }

    public void clickLupa(){
        principalMaps.btnLupa.click();
    }

    public void setBusca(String termo){
        Driver.waitElementBeClickable(principalMaps.inpPesquisar);
        principalMaps.inpPesquisar.clear();
        principalMaps.inpPesquisar.sendKeys(termo);
    }

    public void clickPesquisa(){
        principalMaps.btnPesquisar.click();
    }

    public String getResultado(){
        return principalMaps.textResultado.getText();
    }


}
