/**
 * Rubio Haro Rodrigo R.
 */
public class Main{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Ingresar... Calculadora");

        if(args.length == 3){
            double[] cofactores = {0.0,0.0,0.0};
            for (int i = 0; i < 3; i++) {
                cofactores[i] = Double.parseDouble(args[i]);
            }
            calc.resolverPorFormulaGeneral(cofactores);
		}else{
			System.out.println("Ingresa coeficientes!");
		}
        
       
    }
}