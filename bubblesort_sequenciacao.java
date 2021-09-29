import java.util.Scanner;
import java.util.ArrayList;
public class ExVD02 {
    //pendente
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<>();
        char op;
        double temp = 0.0;
        double valor, soma = 0.0, maior = 0.0;

        //Pega os dados e coloca na fila(lista)
        do{
            System.out.println("Digite um valor real: ");
            valor = entrada.nextDouble();
            valores.add(valor);
            System.out.println("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);
        }while(op == 's' || op == 'S');

        //Controle de sequênciação
        for(int i = 0; i < valores.size(); i++){ //Size pega tamanho lista, conforme mais itens for adicionado mais ele incrementa o valor de size
            for(int j = 0; j < (valores.size() - 1); j++){ //Sempre decrementa -1 para ordenar até o último elemento

                //Controle para colocar em ordem crescente, alterna as posições usando  a variável temp(temporária)
                if(valores.get(j) > valores.get(j+1)){
                    temp = valores.get(j);
                    valores.set(j, valores.get(j+1)); 
                    valores.set(j+1, temp); 
                    
                }
            }
        }

        for(int i = 0; i < valores.size(); i++){
            soma += valores.get(i); 
            //soma = soma + ___
            if(valores.get(i) > maior){
                maior = valores.get(i);
            }
        System.out.println(valores.get(i));
        }

        System.out.println("Soma dos valores: "+ soma);
        System.out.println("Maior valor: "+maior);
        System.out.println(("Média: "+soma/valores.size()));

        //Imprime resultado
            System.out.println("Valores: " + valores);
    }
}
