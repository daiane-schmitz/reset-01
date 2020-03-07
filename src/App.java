public class App {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int somaIdades = calculadora.somar(40, 20);
        System.out.println("A soma das idades é: " + somaIdades);

        int subtraiIdades = calculadora.subtrair(40, 20);
        System.out.println("A subtração das idades é: " + subtraiIdades);

        int divideIdades = calculadora.dividir(40, 20);
        System.out.println("A divisão das idades é: " + divideIdades);

        int multiplicaIdades = calculadora.multiplicar(40, 20);
        System.out.println("A multiplicação das idades é: " + multiplicaIdades);

        Comparador comparador = new Comparador();
        boolean comparando = comparador.menorQue(1, 5);

        System.out.println("O primeiro valor é menor que o segundo? " + comparando);
    }
}
