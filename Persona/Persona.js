class Persona {
    constructor(nombre, Edad, Sexo, Peso,  Altura) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    GetIMC(){
        return this.Peso / (this.Altura*this.Altura);
    }

    IsMAyorDeEdad(){
        if(this.Edad>=18){
            return true;
        }else{
            return false;
        }
    }

    GetDNI(){
        return this.nombre + this.Edad + this.Sexo;
    }
}
var PersonaRodrigo = new Persona('Rubio Haro Rodrigo Rodolfo', 18, 'M', 75, 1.8);
console.log("Mayor de Edad?" + PersonaRodrigo.IsMAyorDeEdad());
console.log("DNI" + PersonaRodrigo.GetDNI());
console.log("IMC:" + PersonaRodrigo.GetIMC());