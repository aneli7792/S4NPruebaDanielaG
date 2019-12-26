#Author: aneli77922@gmail.com
@tag
Feature: creacion de cuenta
  yo quiero realizar la correcta creacion de mi usuario en el sistema

  @registroOKhombre
  Scenario Outline: 
    Given yo quiero crear mi cuenta
    When yo ingrese mis datos y seleccione crear cuenta
      | <nombre> | <apellido> | <correo> | <contrasena> | <fechanac> | <sexo> |
    Then yo deberia quedar con una cuenta creada

    Examples: 
      | nombre | apellido | correo          | contrasena | fechanac   | sexo      |
      | Juan   | Perez    | Juan@correo.com | holamundo  | 2000-07-16 | masculino |

  @registroOKmujer
  Scenario Outline: 
    Given yo quiero crear mi cuenta
    When yo ingrese mis datos y seleccione crear cuenta
      | <nombre> | <apellido> | <correo> | <contrasena> | <fechanac> | <sexo> |
    Then yo deberia quedar con una cuenta creada

    Examples: 
      | nombre | apellido | correo           | contrasena | fechanac   | sexo     |
      | Lucia  | Perez    | lucia@correo.com | holamundo  | 2000-07-16 | femenino |

  @registrofallidosindatos
  Scenario Outline: 
    Given yo quiero crear mi cuenta
    When yo ingrese mis datos y seleccione crear cuenta
      | <nombre> | <apellido> | <correo> | <contrasena> | <fechanac> | <sexo> |
    Then yo deberia quedar con una cuenta creada

    Examples: 
      | nombre | apellido | correo | contrasena | fechanac | sexo |
      |        |          |        |            |          |      |

  @registroformatocorreo
  Scenario Outline: 
    Given yo quiero crear mi cuenta
    When yo ingrese mis datos y seleccione crear cuenta
      | <nombre> | <apellido> | <correo> | <contrasena> | <fechanac> | <sexo> |
    Then yo deberia quedar con una cuenta creada

    Examples: 
      | nombre | apellido | correo | contrasena | fechanac   | sexo      |
      | JUAN   | PEREZ    | juan   | holamundo  | 2000-07-16 | masculino |

  @registroreciennacido
  Scenario Outline: 
    Given yo quiero crear mi cuenta
    When yo ingrese mis datos y seleccione crear cuenta
      | <nombre> | <apellido> | <correo> | <contrasena> | <fechanac> | <sexo> |
    Then yo deberia quedar con una cuenta creada

    Examples: 
      | nombre | apellido | correo          | contrasena | fechanac   | sexo      |
      | JUAN   | PEREZ    | JUAN@CORREO.COM | holamundo  | 2019-07-16 | masculino |
