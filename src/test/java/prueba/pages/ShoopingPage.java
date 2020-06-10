package prueba.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class ShoopingPage extends PageObject {

    // botón usuario
    @FindBy(xpath = "//*[@id='menuUser']")
    public WebElementFacade btnUsuario;

    // crear Cuenta
    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/a[2]")
    public WebElementFacade crearCuenta;

    // Campo Usuario
    @FindBy(xpath = "//input[@name='usernameRegisterPage']")
    public WebElementFacade txtUsuario;

    // Campo email
    @FindBy(xpath = "//*[@id='formCover']/div[1]/div[1]/sec-view[2]/div/input")
    public WebElementFacade txtEmail;

    // Campo password
    @FindBy(xpath = "//input[@name='passwordRegisterPage']")
    public WebElementFacade txtpassword;
    // Campo confirmacion password
    @FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
    public WebElementFacade txtConf_password;

    // check aceptar Politica
    @FindBy(xpath = "//*[@id='formCover']/sec-view/div/label")
    public WebElementFacade check_politica;

    // botón registrar
    @FindBy(css = "#register_btnundefined")
    public WebElementFacade btnRegistrar;

    // cerrar sesion
    @FindBy(xpath = "//*[@id='loginMiniTitle']/label[3]")
    public WebElementFacade cerrarSesion;

    //iniciar sesion
    @FindBy(xpath = "//input[@name='username']")
    public WebElementFacade usuario;

    @FindBy(xpath = "//input[@name='password']")
    public WebElementFacade password;

    @FindBy(css = "#sign_in_btnundefined")
    public WebElementFacade btnIniciar;

    //adicionar el producto al carrito de compras
    @FindBy(xpath = "//div[@id='tabletsImg']")
    public WebElementFacade categoria;

    @FindBy(id = "17")
    public WebElementFacade imgProducto;

    @FindBy(xpath = "//button[@name='save_to_cart']")
    public WebElementFacade addCarrito;

    @FindBy(xpath = "//a[@id='shoppingCartLink']//*[local-name()='svg']")
    public WebElementFacade verCarrito;

    //validar mensaje exito
    @FindBy(xpath = "//h3[@class='roboto-regular center sticky fixedImportant ng-binding']")
    public WebElementFacade lblmensaje;

    public void iniciarCuenta() {
        waitFor(5).second();
        btnUsuario.click();
        waitFor(5).second();
        crearCuenta.click();
    }

    public void usuario(String datoprueba) {
        waitFor(5).second();
        txtUsuario.click();
        txtUsuario.sendKeys(datoprueba);
    }

    public void email(String datoprueba) {
        txtEmail.click();
        txtEmail.sendKeys(datoprueba);
    }

    public void password(String datoprueba) {
        txtpassword.click();
        txtpassword.sendKeys(datoprueba);
    }

    public void confir_password(String datoprueba) {
        txtConf_password.click();
        txtConf_password.sendKeys( datoprueba);

    }

    public void politica() {
        waitFor(5).second();
        check_politica.click();
    }

    public void boton_registrar() {
        waitFor(5).second();
        btnRegistrar.click();;
    }

    public void cerrarSession() {
        waitFor(5).second();
        btnUsuario.click();
        cerrarSesion.click();
        waitFor(5).second();

    }

    public void me_usuario(String datoPrueba){
        btnUsuario.click();
        waitFor(5).second();
        usuario.click();
        usuario.sendKeys(datoPrueba);
    }

    public void me_clave(String datoPrueba){
        password.click();
        password.sendKeys(datoPrueba);
    }

    public void iniciar(){
        btnIniciar.click();
    }

    public void adicionarProducto() {
        waitFor(5).second();
        categoria.click();
        waitFor(5).second();
        imgProducto.click();
        waitFor(5).second();
        addCarrito.click();
        waitFor(5).second();
        verCarrito.click();
        waitFor(5).second();

    }

    public void VerificarMensaje() {
        String strMensaje = lblmensaje.getText();
        String mensajeEsperado = "SHOPPING CART";
        assertThat(strMensaje, containsString(mensajeEsperado));
    }
}

