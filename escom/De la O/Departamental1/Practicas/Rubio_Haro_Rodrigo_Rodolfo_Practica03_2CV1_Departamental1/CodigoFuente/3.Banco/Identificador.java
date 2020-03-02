/**
 * Identificador
 */
public class Identificador {
    private int numero;
    private int[] cadenaNumeros;
    private int decena = 0;
    private String palabra = "";
    private int mil = 0;
    private int auxiliar = 0;
    private int longitud, identificador;

    public String obtenerNumero(int numero) {

        this.numero = numero;
        int tam = String.valueOf(numero).length();
        cadenaNumeros = new int[tam];
        // System.out.println("Imprimiendo la lista de numeros");

        for (int i = 0; i < cadenaNumeros.length; i++) {
            cadenaNumeros[i] = Integer.parseInt(String.valueOf(numero).charAt(i) + "");
            // System.out.print(cadenaNumeros[i] +",");
        }

        // System.out.println("Obteniendo numero");
        longitud = cadenaNumeros.length;
        // System.out.println("Longitud del numero:" + longitud);

        identificador = longitud;
        // System.out.println("Longitud del numero:" + identificador);

        while (auxiliar < longitud) {
            // char caracter = String.valueOf(numero).charAt(auxiliar);
            // System.out.println("char:" + caracter);
            identifica(cadenaNumeros[auxiliar]);
            identificador--;
            auxiliar++;
        }
        System.out.println("Palabra creada");

        return palabra;
    }

    private final String[] numeros = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    private final String[] decenas = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete",
            "dieciocho", "diecinueve" };
    private final String[] numsDiezEnDiez = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
            "setenta", "ochenta", "noventa" };
    private final String[] numsCienEnCien = { "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos",
            "seiscientos", "setecientos", "ochocientos", "novecientos" };

    // Metodo Identificar
    public void identifica(int numero) {
        // System.out.println("entra: " + numero);
        switch (identificador) {
            case 1: {
                if (numero != 0) {
                    palabra += numeros[numero - 1];
                }
                // if (decena != 1) {

                // // if (numero == 1)
                // // palabra += "uno";
                // // if (numero == 2)
                // // palabra += "dos";
                // // if (numero == 3)
                // // palabra += "tres";
                // // if (numero == 4)
                // // palabra += "cuatro";
                // // if (numero == 5)
                // // palabra += "cinco";
                // // if (numero == 6)
                // // palabra += "seis";
                // // if (numero == 7)
                // // palabra += "siete";
                // // if (numero == 8)
                // // palabra += "ocho";
                // // if (numero == 9)
                // // palabra += "nueve";
                // }
                break;
            }
            case 2: {
                // System.out.println("num enviado:" + numero);

                int numeroSiguiente = cadenaNumeros[longitud - 1];
                // System.out.println("num siguiente:" + numeroSiguiente);
                // System.out.println("ident :" + identificador);
                if (numeroSiguiente == 0) {
                    if (numero != 0) {
                        palabra += numsDiezEnDiez[numero - 1];
                        identificador--;
                        auxiliar++;
                    }

                } else {
                    if (numero == 1) {
                        palabra += decenas[numeroSiguiente];
                        identificador--;
                        auxiliar++;
                    } else if (numero == 2)
                        palabra += "veinti";
                    else if (numero != 0) {
                        palabra += numsDiezEnDiez[numero - 1] + " y ";
                        // System.out.println("num: " + (numero -1));
                    }
                    // if (numero == 3)
                    // palabra += "treinta y ";
                    // if (numero == 4)
                    // palabra += "cuarenta y ";
                    // if (numero == 5)
                    // palabra += "cincuenta y ";
                    // if (numero == 6)
                    // palabra += "sesenta y ";
                    // if (numero == 7)
                    // palabra += "setenta y ";
                    // if (numero == 8)
                    // palabra += "ochenta y ";
                    // if (numero == 9)
                    // palabra += "noventa y ";
                }
                break;
            }
            case 3: {
                // System.out.println("org:" + this.numero);
                int numeroSiguiente = cadenaNumeros[longitud - 2];
                int numeroSiguienteSiguiente = cadenaNumeros[longitud - 1];

                // System.out.println("case 3, num sig:" +numeroSiguiente);
                // System.out.println("case 3, num sig-sig:" +numeroSiguienteSiguiente);
                // System.out.println("case 3, num:" +numero);

                if (numeroSiguiente == 0 && numeroSiguienteSiguiente == 0 && numero != 0) {
                    // System.out.println("Llega");
                    palabra += numsCienEnCien[numero - 1];
                    // System.out.println(palabra);
                    // System.out.println(identificador);
                    // System.out.println(auxiliar);
                    identificador--;
                    identificador--;
                    auxiliar++;
                    auxiliar++;
                    // System.out.println(identificador);
                    // System.out.println(auxiliar);
                } else {
                    if (numero == 1)
                        palabra += "ciento ";
                    if (numero == 2)
                        palabra += "doscientos ";
                    if (numero == 3)
                        palabra += "trescientos ";
                    if (numero == 4)
                        palabra += "cuatrocientos ";
                    if (numero == 5)
                        palabra += "quinientos ";
                    if (numero == 6)
                        palabra += "seiscientos ";
                    if (numero == 7)
                        palabra += "setecientos ";
                    if (numero == 8)
                        palabra += "ochocientos ";
                    if (numero == 9)
                        palabra += "novecientos ";

                }
                break;

            }
            case 4: {
                int numeroSiguiente = cadenaNumeros[longitud - 3];
                int numeroSiguienteSiguiente = cadenaNumeros[longitud - 2];
                int numeroSiguienteSiguienteSiguiente = cadenaNumeros[longitud - 1];

                if (numeroSiguiente == 0 && numeroSiguienteSiguiente == 0 && numeroSiguienteSiguienteSiguiente == 0
                        && numero != 0) {
                    if (numero == 1) {
                        palabra += "mil ";
                    } else {
                        palabra += numeros[numero - 1] + " mil ";
                    }
                    identificador--;
                    identificador--;
                    identificador--;
                    auxiliar++;
                    auxiliar++;
                    auxiliar++;

                    break;
                }
                if (numero == 1) {

                    palabra += "mil ";
                    // if (numero == 1)
                    // palabra += "un mil ";
                    // if (numero == 2)
                    // palabra += "dos mil ";
                    // if (numero == 3)
                    // palabra += "tres mil ";
                    // if (numero == 4)
                    // palabra += "cuatromil ";
                    // if (numero == 5)
                    // palabra += "cincomil ";
                    // if (numero == 6)
                    // palabra += "seismil ";
                    // if (numero == 7)
                    // palabra += "sietemil ";
                    // if (numero == 8)
                    // palabra += "ochomil ";
                    // if (numero == 9)
                    // palabra += "nuevemil ";
                } else if (numero != 0) {
                    palabra += numeros[numero - 1] + " mil ";
                }
                break;
            }
            case 5: {

                int numeroSiguiente = cadenaNumeros[longitud - 4];
                // int numeroSiguienteSiguiente = cadenaNumeros[longitud - 3];
                // int numeroSiguienteSiguienteSiguiente = cadenaNumeros[longitud - 2];
                // int numeroSiguienteSiguienteSiguienteSiguiente = cadenaNumeros[longitud - 1];

                if (numeroSiguiente == 0 && numero != 0) {
                    palabra += numsDiezEnDiez[numero - 1] + " mil ";
                    identificador--;
                    auxiliar++;
                } else {
                    

                    if (numero == 1) {
                        palabra += decenas[numeroSiguiente] + " mil ";
                        identificador--;
                        auxiliar++;
                    } else if (numero == 2)
                        palabra += "veinti";
                    else if (numero != 0) {
                        palabra += numsDiezEnDiez[numero - 1] + " y ";
                        // System.out.println("num: " + (numero -1));
                    }
                    if(numeroSiguiente == 1 && numero != 1){
                        palabra += "un mil " ;
                        identificador--;
                        auxiliar++;
                    }

                }

                // if (numero == 2)
                // palabra += "veinte y ";
                // if (numero == 3)
                // palabra += "treinta y ";
                // if (numero == 4)
                // palabra += "cuarenta y ";
                // if (numero == 5)
                // palabra += "cincuenta y ";
                // if (numero == 6)
                // palabra += "sesenta y ";
                // if (numero == 7)
                // palabra += "setenta y ";
                // if (numero == 8)
                // palabra += "ochenta y ";
                // if (numero == 9)
                // palabra += "noventa ";

                // if (numero == 1) {
                // if (numero.charAt(auxiliar + 1) == '1')
                // palabra += "once mil ";
                // if (numero.charAt(auxiliar + 1) == '2')
                // palabra += "doce mil";
                // if (numero.charAt(auxiliar + 1) == '3')
                // palabra += "trece mil";
                // if (numero.charAt(auxiliar + 2) == '4')
                // palabra += "catorce mil";
                // if (numero.charAt(auxiliar + 1) == '5')
                // palabra += "quince mil";
                // if (numero.charAt(auxiliar + 1) == '6')
                // palabra += "dieciseis mil";
                // if (numero.charAt(auxiliar + 1) == '7')
                // palabra += "diecisiete mil";
                // if (numero.charAt(auxiliar + 1) == '8')
                // palabra += "dieciocho mil";
                // if (numero.charAt(auxiliar + 1) == '9')
                // palabra += "diecinueve mil";
                // mil++;
                // }

                break;
            }
            case 6: {
                if (numero == 1)
                    palabra += "ciento ";
                if (numero == 2)
                    palabra += "doscientos ";
                if (numero == 3)
                    palabra += "trescientos ";
                if (numero == 4)
                    palabra += "cuatrocientos ";
                if (numero == 5)
                    palabra += "quinientos ";
                if (numero == 6)
                    palabra += "seiscientos ";
                if (numero == 7)
                    palabra += "setecientos ";
                if (numero == 8)
                    palabra += "ochocientos ";
                if (numero == 9)
                    palabra += "novecientos ";
                break;
            }
            case 7: {
                if (numero == 1)
                    palabra += "un millon ";
                if (numero == 2)
                    palabra += "dos millones ";
                if (numero == 3)
                    palabra += "tres millones ";
                if (numero == 4)
                    palabra += "cuatro millones ";
                if (numero == 5)
                    palabra += "cinco millones ";
                if (numero == 6)
                    palabra += "seis millones ";
                if (numero == 7)
                    palabra += "siete millones ";
                if (numero == 8)
                    palabra += "ocho millones ";
                if (numero == 9)
                    palabra += "nueve millones ";
                break;
            }
        }
    }
}