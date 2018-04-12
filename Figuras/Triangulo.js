class triangulo{
    constructor(Base, Altura){
        this.Perimetro;
        this.Base = Base;
        this.Altura = Altura;
        this.Area = (Base*Altura)/2;
    }

    setBase(Base){
        this.Base=Base;
        this.Area = (Base*Altura)/2;
    }
    setAltura(Altura){
        this.Altura = Altura;
        this.Area = (Base*Altura)/2;
    }

    setArea(Area){
        this.Area = Area;
        this.Area = (Base*Altura)/2;
    }

    getBase(){
        return this.Base;
    }
    getAltura(){
        return this.Altura;
    }
    getArea(){
        return this.Area;
    }

    getPerimetro(l1,l2,l3){
        return l1+l2+l3;
    }
}

var triangulo1 = new triangulo(5,5);
console.log(triangulo1.getArea());
