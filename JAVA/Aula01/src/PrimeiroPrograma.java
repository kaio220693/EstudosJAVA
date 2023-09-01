public class PrimeiroPrograma {

    public static void main(String[] args) {


        Casa casaKaio = new Casa("kaio", "vermelho", 21, 100);
        System.out.println( casaKaio.cor);
        casaKaio.abrirporta();

        Condicional c1 = new Condicional();  // Instanciando um objeto
        c1.Comparar();

        System.out.println("================================");
        casaKaio.demolirCasa();
        System.out.println(casaKaio.tamanho);
        System.out.println("================================");
        casaKaio.reconstruirCasa();

        System.out.println("================================");
        Livros livro = new Livros("Alice no país das maravilhas","Louis Carrol", "TDS10", 1845);
        livro.abrirLivro();
        livro.fecharLivro();
        System.out.println("================================");
        Livros livro2 = new Livros("Zarastrusta","Nietzsche", "TDS10", 1854);
        livro2.abrirLivro();
        livro2.fecharLivro();
        System.out.println("================================");
        System.out.println("Escreve na tela");
        System.out.println("================================");
        int valor1 = 10;
        int valor2 = 20;
        int soma;
        soma = valor1 + valor2;
        System.out.println(soma);
        System.out.println("================================");

        int idade = 30;
        boolean menor = idade > 18;
        System.out.println(menor);
        System.out.println("================================");

        double num1 = 1.5;
        float num2 = 2.9F;
        System.out.println(num1);
        System.out.println(num2);
        double soma1;
        soma1 = num1 + num2;
        System.out.println(soma1);
        System.out.println("================================");





    }


}
