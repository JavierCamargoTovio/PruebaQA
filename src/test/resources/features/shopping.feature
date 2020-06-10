#Sample Feature Definition Template
@Regresion
Feature: Comprar un acticulo en ShoppiG Advantage
  El usuario debe ingresar a la pagina crear una cuenta y luego ingresar con el usuario
  anteriormente registrado, posteriormente adicionar un articulo al carrito de compra.

  @CasoExitoso
  Scenario: registrarse e iniciar sesion y agregar un articulo al carrito de compras,
    Given Ingreso a la pagina shopping advantege
    When registro y Autentico en shoppin avantege
      |Username      |Email                   |Password      |Confirmacion|
      |Carmen1212  |Carmen1212@gmail.com|A123Medellin  |A123Medellin|
    Then Verifico el articulo en el carrito de comparas
