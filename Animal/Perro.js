//Este es un objeto.
class Animal {

	constructor(Nombre, Edad, Tamaño, Color, Peso, Raza, Especie) {
		//Estos serán los atributos.
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Color = Color;
		this.Peso = Peso;
		this.Raza = Raza;
		this.Especie = Especie;

	}

	Comer(Comida) {
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

	setPeso(Peso) {
		this.Peso = Peso;
	}
	getPeso() {
		return this.Peso;
	}

	setRaza(Raza) {
		this.Raza = Raza;
	}
	getRaza() {
		return this.Raza;
	}


	Morder() {
		console.log('Grrrr >:v');
	}

}

//Este es un objeto.
class Perro extends Animal {

	constructor(Nombre, Edad, Tamaño, Color, Peso, Raza) {
		//Estos serán los atributos.
		super(Nombre, Edad, Tamaño, Color, Peso, Raza, 'Perro');
		this.Edad = Edad;
		this.Color = Color;
		this.Peso = Peso;
		this.Raza = Raza;

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

	setPeso(Peso) {
		this.Peso = Peso;
	}
	getPeso() {
		return this.Peso;
	}

	setRaza(Raza) {
		this.Raza = Raza;
	}
	getRaza() {
		return this.Raza;
	}


	Morder() {
		console.log('Grrrr >:v');
	}

	Ladrar() {
		console.log('Guaf');
	}

	PrintDatosPerritos() {
		console.log('***************************');
		console.log('Datos del perrito: ');
		console.log('Edad: ' + Edad);
		console.log('Tamaño: ' + Tamaño);
		console.log('Color: ' + Color);
		console.log('Raza: ' + Raza);
		console.log('***************************');

	}

	PrintPerrito() {
		console.log('**********************___**');
		console.log('*********************[  *]*');
		console.log('*********************[ __]*');
		console.log('***[ ________________ ]****');
		console.log('***[ ________________ ]****');
		console.log('***[*]***************[]****');
		console.log('***[*]***************[]****');
		console.log('***[*]***************[]****');
		console.log('***[*]***************[]****');
	}

}

var Perrito1 = new Perro(13, '13cm', 'Rojo', '3kg', 'Pitbull');
var Perrito2 = new Perro(7, '40cm', 'Negro', '10kg', 'Golden');
//console.log(Perrito1.getRaza());
Perrito2.Morder();
