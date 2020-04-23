# Tipos de tomada de decisão

Existem _3 tipos_ de tomada de decisão:<br>

* ### Tomada de decisão simples  

    Neste tipo de decisão, __uma condição será verificada__. Caso a mesma seja
    __*verdadeira*__, um bloco de ações __será executado__. Caso seja __*falsa*__ a condição é
    encerrada, __sem que nenhuma ação seja executada__.  

    #### Exemplo de tomada de decisão simples:<br>
    Criar um programa que apresente a mensagem _“Maior de idade”_ caso a idade lida seja igual ou superior a 18 anos.

    ```java
    import java.util.*;

    public class Main {

        public static void main(String args[]){
            
            int idade; 

            Scanner in = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            idade = in.nextInt();

            if (idade >= 18){
                System.out.println("Maior de idade")
            }

        }
    }
    ```

* ### Tomada de decisão composta
    Neste tipo de decisão uma condição será verificada. Caso a mesma seja
    __*verdadeira*__, um bloco de ações __será executado__. Caso seja __*falsa*__ um __outro bloco de ações é executado__.  

    [Exemplo](1-tomada_desição.md###Java:)


* ### Tomada de Decisão Encadeada
    Neste tipo de tomada de decisão uma condição é verificada. Caso seja __*verdadeira*__,
    um bloco de __ações é executado__. Caso seja __*falsa*__, uma __nova condição pode ser verificada__, até que se __esgotem todas as possibilidades de teste__.
    <br><br>

    _Exemplo_: Criar um programa que leia duas notas de um usuário, calcule e apresente a sua média, e em seguida uma mensagem segundo a condição da média:
    - Se a média for < 4: Reprovado.
    - Se a média for >=6: Aprovado.
    ```java
    import java.util.*;
    public class TomadaDecisao {
        public static void main(String args[]){
            
            Scanner in = new Scanner(System.in);
            double n1, n2, m;

            System.out.println("Entre com a 1a nota:");
            n1 = in.nextDouble();

            System.out.println("Entre com a 2a nota:");
            n2 = in.nextDouble();

            m = (n1 + n2) / 2;

            System.out.println("A média é: "+m);

            if(m<4){
                System.out.println("Você está reprovado!");

            }else if(m<6){
                System.out.println("Você está de recuperação ");

            }else{
                System.out.println("Você está aprovado! ");
            }
        }
    }
    ```

___
    