//Este es un objeto.
class Animal {

	constructor(Nombre,Edad, Tamaño, Color, Peso, Raza, Especie) {
		//Estos serán los atributos.
        this.Nombre = Nombre;
        this.Edad = Edad;
		this.Color = Color;
		this.Peso = Peso;
        this.Raza = Raza;
        this.Especie = Especie;

	}

    Comer(Comida){
        return `${this.Nombre} esta comiento ${Comida}`
    }

    setNombre(Nombre) {
		this.Nombre = Nombre;
	}
	getNombre() {
		return this.Nombre;
	}


	setColor(Color) {
		this.Color = Color;
	}
	getColor() {
		return this.Color;
	}


	setEdad(Edad) {
		this.Edad = Edad;
	}
	getEdad() {
		return this.Edad;
	}

	setPeso(Peso){
		this.Peso = Peso;
	}	
	getPeso(){
		return this.Peso;
	}	

	setRaza(Raza){
		this.Raza = Raza;
	}	
	getRaza(){
		return this.Raza;
	}	
	

	Morder() {
		console.log('Grrrr >:v');
	}

}