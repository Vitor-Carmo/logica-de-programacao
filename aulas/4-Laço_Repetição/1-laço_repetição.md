# Laços de Repetição  

Quando criamos um programa, cada linha do código é executada uma única vez. Para que
possamos repetir uma seqüência de passos dentro do código-fonte, devemos executar o
programa quantas vezes forem necessárias. Entretanto, imagine a seguinte situação:   

_Um programa que leia duas notas de um determinado aluno, calcule e apresente a sua média aritmética e informe se o aluno está aprovado (caso a média seja >=6) ou reprovado (caso a média seja < 6). Esse programa deverá ser executado para 5 alunos._

Para que isso seja possível, com os comandos e estruturas que aprendemos até o momento, teríamos que criar um programa enorme, repetindo 5 vezes a mesma seqüência de passos, pois
a fórmula para saber se um aluno está aprovado ou reprovado é a mesma para qualquer aluno.  
Imagine ainda que ao invés de 5 alunos tenhamos que repetir essa operação para 40 alunos. O
código-fonte ficaria enorme, repetindo 40 vezes o mesmo trecho. O mesmo ocorreria caso
tivéssemos 100 ou 1000 alunos.


Quando devemos repetir um determinado trecho de um programa ou até mesmo todo o
código, utilizamos uma estrutura chamada de __LAÇO DE REPETIÇÃO__ que nos permite
__executarmos mais de uma vez__ um mesmo trecho do código-fonte, baseado em uma condição (teste lógico).
Existem três tipos básicos de laços de repetição, conforme veremos a seguir.

## Laço de repetição com teste no início (`while`)

Nesse tipo de estrutura, é realizado um teste lógico no início do bloco. Caso a __condição seja *VERDADEIRA*__, o bloco de comandos associado à condição __será executado__. Quando a __condição for *FALSA*__, o bloco é __abandonado__, e a execução do programa __seguirá seu fluxo__.

_Vejamos como ficaria o exemplo acima utilizando essa estrutura:_

```java
import java.util.*;
public class LacoInicio {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int i=1;
        double n1, n2,m;

        while( i <= 5){
            System.out.println("Digite a 1a nota do "+i+"o
            aluno:");
            n1 = in.nextDouble();
            
            System.out.println("Digite a 2a nota do "+i+"o
            aluno:");
            n2 = in.nextDouble();

            m = (n1 + n2) / 2;

            System.out.println("A média é: "+m);
            
            if (m >= 6){
                System.out.println("Aprovado!");

            }
            else{
                System.out.println("Reprovado!");
            }

            i++;

        }

    }
}
```


## Laço de repetição com teste no fim (`do`)

Nesse tipo de estrutura, o bloco de execução associado ao laço de repetição __é executado__, e __ao final é realizado um teste lógico__. Caso a condição seja __*VERDADEIRA*__, o bloco de comandos
associado à condição __será executado novamente__. __Enquanto__ a condição __for *VERDADEIRA*__, o
bloco é __repetido__, e a execução do programa seguirá seu fluxo.

_Vejamos como ficaria o exemplo anterior utilizando essa estrutura:_

```java
import java.util.*;
public class LacoFim {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int i=1;
        double n1, n2,m;

        do{
            System.out.println("Digite a 1a nota do "+i+"o
            aluno:");
            n1 = in.nextDouble();

            System.out.println("Digite a 2a nota do "+i+"o
            aluno:");
            n2 = in.nextDouble();

            m = ( n1 + n2 ) / 2;

            System.out.println("A média é: "+m);

            if (m < 6){
                System.out.println("Reprovado!");
            }
            else{
                System.out.println("Aprovado!");
            }

            i++;

        }while(i <= 5);
    }
}
```

## Laço de repetição com teste no fim (`for`)

Nesse tipo de estrutura, no início do laço de repetição uma variável de controle _(contador)_ é
__iniciada__, __incrementada__ e __testada__ numa __única instrução__. 

_Escrito com esse tipo de laço ficaria assim_:


```java
import java.util.*;
public class LacoInicio {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int i;
        double n1, n2,m;
        
        for (i=1;i<=5;i++){
            System.out.println("Digite a 1a nota do "+i+"o aluno:");
            n1 = in.nextDouble();

            System.out.println("Digite a 2a nota do "+i+"o aluno:");
            n2 = in.nextDouble();

            m = (n1+n2)/2;

            System.out.println("A média é: "+m);

            if ( m < 6){
                System.out.println("Reprovado!");
            }
            else{
                System.out.println("Aprovado!");
            }

        }
    }
}
```

___
<br><br>