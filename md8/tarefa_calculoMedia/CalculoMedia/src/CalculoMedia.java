/*
 * @author phtech
 */



public class CalculoMedia{
    
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private void somaNotas(double nota1, double nota2, double nota3, double nota4) {
        double soma = nota1 + nota2 + nota3 + nota4;
        double resultado = soma / 4;
        System.out.println("O resultado do cálculo da média é: " + resultado);
    }

    public static void main(String[] args){
        CalculoMedia media = new CalculoMedia();
        media.nota1 = 8;
        media.nota2 = 10;
        media.nota3 = 6;
        media.nota4 = 9;
        media.somaNotas(media.nota1, media.nota2, media.nota3, media.nota4);
    }

}