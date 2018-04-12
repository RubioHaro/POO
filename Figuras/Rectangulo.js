class Rectangulo{
    constructor(Base, Altura){
        this.Perimetro;
        this.Base = Base;
        this.Altura = Altura;
        this.Area = (Base*Altura);
    }

    setBase(Base){
        this.Base=Base;
        this.Area = (Base*Altura);
    }
    setAltura(Altura){
        this.Altura = Altura;
        this.Area = (Base*Altura);
    }
    
    setArea(Area){
        this.Area = Area;
    }

    getPerimetro(){
        return this.Perimetro;
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
}