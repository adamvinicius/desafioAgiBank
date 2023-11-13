package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMaps {

    @FindBy(id = "search-open")
    public WebElement btnLupa;
    @FindBy(xpath = "//div[1]//label/input")
    public WebElement inpPesquisar;
    @FindBy(css = "div.desktop-search > form > input")
    public WebElement btnPesquisar;
    @FindBy(css = "h1")
    public WebElement textResultado;

}
