# Tomada de Decisão

Até o momento já vimos como podemos lidar com a __entrada__, __processamento__ e a
__saída de dados__. Entretanto, existirão situações em que teremos que programar
__desvios de execução__ dentro de um código. Por exemplo, o programa não irá
terminar após processar os dados. Pode ser necessário analisar o resultado
processado para então se tomar uma decisão dentro do programa, escolhendo
por onde o fluxo de dados irá trafegar.  
<br>
Imaginemos a seguinte situação: um programa que leia duas notas de um aluno,
calcule e apresente a sua média e além da média, exiba uma mensagem
informando se o aluno foi reprovado ou aprovado seguindo os critérios abaixo:

* Se a média for __menor do que 6__ o aluno será __reprovado__
* Se a média for __maior ou igual a 6__ o aluno será __aprovado__.

Observe que somente uma das duas mensagens será exibida: ou __aprovado__ ou
__reprovado__, sendo impossível que o mesmo aluno receba as duas mensagens.
Nesse caso será necessário __prever um desvio condicional__ dentro do programa,
também conhecido como __tomada de decisão__. O fluxo do programa deverá ser
desviado de acordo com a situação da média do aluno.

_A solução para esse problema em 4 etapas poderá ser assim escrita:_


### Código em Português Estruturado:
```
programa NOTAS
var
    n1, n2, m: real
início
    leia (n1)
    leia(n2)

    m <- (n1+n2)/2

    escreva (m)

    se (m<6) então
        escreva (‘Reprovado’)

    senão
        escreva(‘Aprovado’)

    fim_se
fim.
```

### Java:

```java
import java.util.*;

public class SomaNumeros {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double n1, n2, m;

        System.out.println("Entre com a 1a
        nota");
        n1 = in.nextDouble();

        System.out.println("Entre com a 2a
        nota:");
        n2 = in.nextDouble();

        m = (n1+n2) / 2;

        System.out.println("A média é: "+m);
        
        
        if(m < 6) {
            System.out.println("Reprovado! ");
        }else {
            System.out.println("Aprovado! ");
        }
    }
}
```
<br>

___
<br><br>