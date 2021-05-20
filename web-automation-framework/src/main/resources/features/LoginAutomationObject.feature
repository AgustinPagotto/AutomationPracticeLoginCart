Feature: Login Automation Practice

  @Login
  Scenario Outline: Login Automation Practice
    Given Usuario ingresa url selecciona sign in ingresa su mail y selecciona Create an account "<caso_prueba>"
    When Usuario ingresa sus datos "<caso_prueba>"
    Then Se valida el inicio de sesion "<caso_prueba>"
    Examples:
      | caso_prueba |
      |           1 |