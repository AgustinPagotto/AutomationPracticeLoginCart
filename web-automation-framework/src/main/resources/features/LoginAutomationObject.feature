Feature: Login Automation Practice

  @Login
  Scenario Outline: Login Automation Practice
    Given Usuario ingresa url selecciona sign in ingresa su mail y selecciona Create an account "<caso_prueba>"
    When Usuario ingresa sus datos "<caso_prueba>"
    And Se valida el inicio de sesion "<caso_prueba>"
    And Ingreso en la categoria Women
    And Agrego cuatro productos al carrito
    Then Valido que esten los cuatro productos seleccionados
    Examples:
      | caso_prueba |
      |           1 |