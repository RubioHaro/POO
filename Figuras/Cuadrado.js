class Cuadrado {
    
    constructor(Lado) {
        this.Perimetro = (Lado*4);
        this.Lado = Lado;
        this.Area = (Lado * Lado);
    }


    setLado(Lado) {
        this.Lado = Lado;
        this.Area = (Lado * Lado);
        this.Perimetro = (Lado*4);
    }

    getLado() {
        return this.Lado;
    }

    setArea(Area) {
        this.Area = Area;
    }

    getArea() {
        return this.Area;
    }
}