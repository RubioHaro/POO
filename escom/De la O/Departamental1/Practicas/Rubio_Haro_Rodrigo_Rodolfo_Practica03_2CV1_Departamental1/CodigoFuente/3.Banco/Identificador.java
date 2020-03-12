
public class Identificador {
    private int[] cadenaNumeros;
    private String palabra = "";
    private int auxiliar = 0;
    private int longitud, identificador;

    public String obtenerNumero(int numero) {
        int tam = String.valueOf(numero).length();
        cadenaNumeros = new int[tam];

        for (int i = 0; i < cadenaNumeros.length; i++) {
            cadenaNumeros[i] = Integer.parseInt(String.valueOf(numero).charAt(i) + "");
        }

        longitud = cadenaNumeros.length;

        identificador = longitud;

        while (auxiliar < longitud) {
            identifica(cadenaNumeros[auxiliar]);
            identificador--;
            auxiliar++;
        }
        return palabra;
    }

    private final String[] numeros = { "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    private final String[] decenas = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete","dieciocho", "diecinueve" };
    private final String[] numsDiezEnDiez = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta","setenta", "ochenta", "noventa" };
    private final String[] numsCienEnCien = { "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos","seiscientos", "setecientos", "ochocientos", "novecientos" };

    // Metodo Identificar
    public void identifica(int numero) {
        switch (identificador) {
            case 1: {
                if (numero != 0) {
                    palabra += numeros[numero - 1];
                }
                break;
            }
            case 2: {

                int numeroSiguiente = cadenaNumeros[longitud - 1];
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
                    }
                }
                break;
            }
            case 3: {
                int numeroSiguiente = cadenaNumeros[longitud - 2];
                int numeroSiguienteSiguiente = cadenaNumeros[longitud - 1];

                if (numeroSiguiente == 0 && numeroSiguienteSiguiente == 0 && numero != 0) {
                    palabra += numsCienEnCien[numero - 1];
                    identificador -= 2;
                    auxiliar += 2;
                } else if (numero != 0) {
                    if (numero == 1)
                        palabra += "ciento ";
                    else
                        palabra += numsCienEnCien[numero - 1];
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
                    identificador -= 3;
                    auxiliar += 3;
                    break;
                }
                if (numero == 1) {
                    palabra += "mil ";
                } else if (numero != 0) {
                    palabra += numeros[numero - 1] + " mil ";
                }
                break;
            }
            case 5: {

                int numeroSiguiente = cadenaNumeros[longitud - 4];
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
                    }
                    if (numeroSiguiente == 1 && numero != 1) {
                        palabra += "un mil ";
                        identificador--;
                        auxiliar++;
                    }

                }
                break;
            }
            case 6: {

                int numeroSiguiente = cadenaNumeros[longitud - (3 + 2)];
                int numeroSiguienteSiguiente = cadenaNumeros[longitud - (2 + 2)];

                if (numeroSiguiente == 0 && numeroSiguienteSiguiente == 0 && numero != 0) {
                    palabra = numsCienEnCien[numero - 1] + " mil ";
                    identificador -= 2;
                    auxiliar += 2;
                } else if (numero != 0)
                    palabra += numsCienEnCien[numero - 1];
                break;
            }
            case 7: {

                if (numero != 0) {
                    if (numero == 1)
                        palabra += numeros[numero-1] + " millon ";
                    else {
                        palabra += numeros[numero-1] + " millones ";
                    }
                }

                break;
            }
        }
    }
}