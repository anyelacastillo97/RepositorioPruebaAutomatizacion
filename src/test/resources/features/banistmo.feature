Feature: Acceso al sitio web de Bancolombia Personas

	@EscenarioPrueba
  Scenario: Acceso al sitio web de Bancolombia Personas y realizar el evento
    Given que un usuario esta en la pagina de Bancolombia Personas
    When selecciona la opcion productos y servicios
    And selecciona la opcion inversiones
    And selecciona la opcion inversion virtual
    And selecciona el boton documentos
    Then valida que el documento sea correcto