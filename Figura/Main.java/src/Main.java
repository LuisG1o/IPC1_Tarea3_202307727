abstract class Figura {
    protected int numLados;

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    public abstract double calcularArea();
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0); // Un círculo no tiene lados, por lo que se establece en 0
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Triangulo triangulo = new Triangulo(5, 8);
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(3);

        // Crear un arreglo de Figuras
        Figura[] arregloFiguras = {triangulo, cuadrado, circulo};

        // Imprimir el nombre de la figura y el área calculada
        for (Figura figura : arregloFiguras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double areaCalculada = figura.calcularArea();
            System.out.println(nombreFigura + ": Área = " + areaCalculada);
        }
    }
}
