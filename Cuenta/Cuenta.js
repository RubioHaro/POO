class Cuenta {
    constructor(Titular) {
        this.Titular = Titular;
        this.cantidad = 0;
    }

    Ingresar(cantidad){
        if((this.cantidad + cantidad)>900){
            return "Cuenta de: " + this.Titular + "\n Ha excedido el limite de la cantidad a ingresar, sorry :c";
        }else{
            this.cantidad = this.cantidad + cantidad;
            return "Cuenta de: " + this.Titular + "\n Se ha abonado exitosamente la cantidad de: " + cantidad + ", saldo final: "+ this.cantidad;
        }
        
    }

    Retirar(cantidad){
        if((this.cantidad - cantidad)<10){
            return "Cuenta de: " + this.Titular + "\n No se puede retirar la cantidad, sorry :c";
        }else{
            this.cantidad = this.cantidad - cantidad;
            return "Cuenta de: " + this.Titular + "\n Se ha retirado exitosamente la cantidad de: " + cantidad + ", saldo final: "+ this.cantidad;
        }
    }
}
var CuentaRodrigo = new Cuenta('Rubio Haro Rodrigo Rodolfo');
console.log(CuentaRodrigo.Ingresar(100));
console.log(CuentaRodrigo.Ingresar(1000));
console.log(CuentaRodrigo.Retirar(1000));
console.log(CuentaRodrigo.Ingresar(50));