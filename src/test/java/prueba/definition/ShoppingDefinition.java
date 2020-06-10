package prueba.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Steps;
import prueba.steps.ShoppingSteps;

import java.util.List;

public class ShoppingDefinition {
    @Steps
    ShoppingSteps shoppingSteps;

    @Given("^Ingreso a la pagina shopping advantege$")
    public void ingreso_a_la_pagina_shopping_advantege() {
        shoppingSteps.abrirPagina();
    }
    @When("^registro y Autentico en shoppin avantege$")
    public void registro_y_Autentico_en_shoppin_avantege(DataTable dtsDatos) {
        shoppingSteps.iniciarCuenta();
        List<List<String>> data = dtsDatos.raw();
        for (int i=1; i<data.size();i++){
            shoppingSteps.for_crearCuenta(data,i);
        }

        shoppingSteps.cerraSesion();

        List<List<String>> data2 = dtsDatos.raw();
        for (int i=1; i<data2.size();i++){
            shoppingSteps.iniciarSesion(data2,i);
        }

        shoppingSteps.adicionarProducto();

    }

    @Then("^Verifico el articulo en el carrito de comparas$")
    public void verifico_el_articulo_en_el_carrito_de_comparas() {
        shoppingSteps.VerificarMensaje();
    }

}
