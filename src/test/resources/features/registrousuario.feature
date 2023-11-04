#Autor: Juan Diego Moncaleano
  @stories
  Feature: Registro de usuario en la página Utest.com
    @scenario
    Scenario: Registro de juan en Utest
      Given juan quiere registrarse en Utest
      When juan ingresa la informacion correctamente
        | stNombre | stApellido   | stCorreo                | stMes  | stDia | stAnio | stCiudad | stCodigo_Postal | stDispositivo_Movil | stModelo_Dispositivo   | stVerion_So_Movil | stPASSWORD       | stPASSWORD2      |
        | juan     | moncaleano   | juanmonca1077@gmail.com | August | 25    | 1987   | Neiva    | 41001           | Xiaomi              | Redmi Note 12 Pro 5G   | Android 13        | Luccasydalila.30 | Luccasydalila.30 |
      Then se completa el registro en la pagina
        | stTextoFinal1  |
        | Complete Setup |

