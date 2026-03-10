public class Main {
    public static void main(String[] args) {
        Forma s1 = new Circulo(5.0);
        Forma s2 = new Retangulo(4.0, 5.0);

        
        System.out.println("Círculo - Área: " + String.format("%.2f", s1.calcularArea()));
        System.out.println("Círculo - Perímetro: " + String.format("%.2f", s1.calcularPerimetro()));
        System.out.println("Retângulo - Área: " + String.format("%.2f", s2.calcularArea()));
        System.out.println("Retângulo - Perímetro: " + String.format("%.2f", s2.calcularPerimetro()));
    }
   
}