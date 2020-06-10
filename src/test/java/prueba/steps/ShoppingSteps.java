package prueba.steps;

import net.thucydides.core.annotations.Step;
import prueba.pages.ShoopingPage;

import java.util.List;

public class ShoppingSteps {
    ShoopingPage shoopingPage;

    @Step
    public void abrirPagina() {
        shoopingPage.open();
    }

    @Step
    public void iniciarCuenta() {
        shoopingPage.iniciarCuenta();
    }

    @Step
    public void for_crearCuenta(List<List<String>> data, int id) {
        shoopingPage.usuario(data.get(id).get(0).trim());
        shoopingPage.email(data.get(id).get(1).trim());
        shoopingPage.password(data.get(id).get(2).trim());
        shoopingPage.confir_password(data.get(id).get(3).trim());
        shoopingPage.politica();
        shoopingPage.boton_registrar();

    }
    @Step
    public void cerraSesion() {
        shoopingPage.cerrarSession();
    }
    @Step
    public void iniciarSesion(List<List<String>> data2, int id) {
        shoopingPage.me_usuario(data2.get(id).get(0).trim());
        shoopingPage.me_clave(data2.get(id).get(2).trim());
        shoopingPage.iniciar();

    }
    @Step
    public void adicionarProducto() {
        shoopingPage.adicionarProducto();
    }
    @Step
    public void VerificarMensaje() {
        shoopingPage.VerificarMensaje();
    }
}
