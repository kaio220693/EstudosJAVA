public class Casa {
    String nome;
    String cor;
    int numero;
    int tamanho = 100;

    public Casa(String nome, String cor, int numero, int tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.numero = numero;
    }

    public void abrirporta(){
        System.out.println("PORTA ABERTA");
    }

    public void fecharporta(){
        System.out.println("PORTA FECHADA");
    }

    public void demolirCasa(){

        while(tamanho > 0){
            System.out.println("Mais uma parede derrubada");
            tamanho-=25;
        }
        System.out.println("Casa demolinada");
    }

    public void reconstruirCasa(){
        for(int i = 0; i < 100; i++){
            tamanho +=1;
            System.out.println(tamanho);
        }
        System.out.println("Casa reconstruida");
    }
}
