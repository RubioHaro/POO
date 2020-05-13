import java.io.*;

public class Calculadora {

    Operacion[] operaciones;
    String[] operadoresValidos = { "+", "-", "/", "*",  "++", "--","^2", "^3", ">>", "<<" };
    int cantidadRegistros;
    Double x;

    public Calculadora() {
        operaciones = new Operacion[10];
        cantidadRegistros = 0;
        x = 0.0;
    }

    public String PedirOperacion() {
        System.out.println("Ingresa una operacion, por ejemplo: +6.4");
        System.out.print("operacion:");
        String cadena = leer();
        return cadena;
    }

    public void ejecutarOperacion(String operador, Double numero) {
        switch (operador) {
            case "+":
                x += numero;
                break;
            case "-":
                x -= numero;
                break;
            case "*":
                x *= numero;
                break;
            case "/":
                x /= numero;
                break;
            case "^2":
                x *= x;
                break;
            case "^3":
                x *= x * x;
                break;
            case "++":
                --x;
                break;
            case "--":
                --x;
                break;
            case ">>":
                x = Double.valueOf(x.intValue() >> numero.intValue());
                break;
            case "<<":
                x = Double.valueOf(x.intValue() << numero.intValue());
                break;
            default:
                break;
        }
    }

    public String leer() {
        String cadena = "";
        DataInputStream sd = new DataInputStream(System.in);
        System.out.flush();

        try {
            cadena = sd.readLine();
        } catch (IOException e) {
            System.out.println("ERROR: Se introdujo el dato");
            System.out.println(e);
            cadena = "error";
        }
        return cadena;
    }

    private String mostrarOperadoresValidos() {
        String operadores = "";
        int cantidad = operadoresValidos.length;
        for (int i = 0; i < cantidad; i++) {
            operadores += operadoresValidos[i];
            if (i + 1 != cantidad) {
                operadores += ", ";
            }
        }
        return operadores;
    }

    public String registrarOperaciones(String operacion) {
        if (operacion != null && !operacion.equals("")) {
            Operacion nuevaOperacion = generarOperacion(operacion);
            if (nuevaOperacion != null) {
                operaciones[cantidadRegistros] = nuevaOperacion;
                cantidadRegistros++;
                return nuevaOperacion.toString();
            }
            return "No ha sido posible generar la operacion, " + "Operador invalido o estructura Incorrecta \n"
                    + "Mostrando operadores validos:" + mostrarOperadoresValidos();
        }
        return "No se ha ingresado ninguna operacion";
    }

    private boolean esOperador(String cadena) {
        for (int i = 0; i < operadoresValidos.length; i++) {
            if (cadena.equals(operadoresValidos[i]))
                return true;
        }
        return false;
    }

    public Operacion generarOperacion(String cadena) {
        int caracteres = cadena.length();
        if (caracteres >= 2) {
            Double operando;
            String posibleOperador = cadena.substring(0, 2);
            if (esOperador(posibleOperador)) {
                if (posibleOperador.equals(">>") || posibleOperador.equals("<<")) {
                    operando = Double.parseDouble(cadena.substring(2));
                    return new Operacion(posibleOperador, operando);
                } else if (cadena.length() == 2) {
                    return new Operacion(posibleOperador, 0.0);
                }
            } else {
                posibleOperador = cadena.substring(0, 1);
                if (esOperador(posibleOperador)) {
                    operando = Double.parseDouble(cadena.substring(1));
                    return new Operacion(posibleOperador, operando);
                }
            }
        }
        return null;
    }

    public void mostrarResultado() {
        System.out.println("El resultado de tus operaciones");
        for (int i = 0; i < cantidadRegistros; i++) {
            ejecutarOperacion(operaciones[i].getOperador(), operaciones[i].getOperando());
            System.out.print(operaciones[i].toString());
            if (i + 1 != cantidadRegistros) {
                System.out.print(",");
            }
        }
        System.out.print(" es: X = " + this.x);
    }

    public void DesplegarMenu() {
        String cadena;
        Boolean activo = true;
        while (activo) {
            cadena = PedirOperacion();
            if (cadena.equals("") || cadena == null) {
                activo = false;
                mostrarResultado();
            } else {
                System.out.println(registrarOperaciones(cadena));
            }
        }
    }
}