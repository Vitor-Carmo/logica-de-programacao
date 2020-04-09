# Variáveis  

As __variáveis__ são __espaços reservados na memória do computador__ para que dados
sejam armazenados __temporariamente__. As variáveis recebem esse nome porque
seus valores __podem se alterar durante a execução do programa__, ou seja, seus
valores __variam__ de acordo com as ações a serem executadas.  

Imagine uma variável como se fosse uma caixa. Você pode dar um __nome__ para essa caixa e você pode colocar __informações dentro dela__. Caso você queira ver depois de um tempo qual é a informação que está dentro da caixa, você simplesmente abre a caixa com o nome que você deu e vê o que está guardado dentro dela.  

Porém há algumas restrições, e elas são:
>- __Toda caixa (_variável_) deve conter um identificador único;__
>- __Cada caixa (_variável_) só é capaz de armazenar um único dado por vez.__  

As variáveis são __alocadas na memória RAM do computador__, logo, ao se desligar
ou reiniciar um computador __seus dados são perdidos__.  
<br>

## Identificadores

Toda variável tem um  nome único. E para facilitar sua identificação, devemos utilizar algumas regras no momento de definir os identificadores das variáveis:  

>* __Todas as letras em minúsculas, somente a primeira letra da segunda sentença deverá ser escrita em maiúscula__.  
_Exemplo: idadeAluno, nomePais, dataNascimento, valor1_; <br><br>  
>* __O primeiro caractere deve obrigatoriamente ser uma letra__; <br><br>
>* __Pode conter números, mas não se iniciar com um número__; <br><br>
>* __Não podem ser usados caracteres especiais como__ _%, $, #, @, “, ç, !_ , __espaços em branco, caracteres com acentos, etc... Os únicos caracteres permitidos além de letras e números é o underscore__ _( _ )_ e o hífen _( - );<br><br>
>* __Os identificadores devem ser escolhidos de modo a explicitar as informações que serão armazenadas dentro da variável, por exemplo,__ _nome, endereço, idade, telefone, sexo_ __, são exemplos de identificadores adequados__.  

## Constantes

Por vezes, dentro da programação, devemos utilizar valores __pré-definidos__, que
__não se alteram__ durante a execução do programa. Esses valores são chamados de
__constantes__, pois permanecem os mesmos, sendo que o usuário não consegue
alterá-los em momento algum.

As constantes devem ser declaradas com tipo, nome e o valor que conterão.

Para declarar constantes, utilizaremos sempre letras __maiúsculas__, utilizando o
underline _(\_)_ para separar duas ou mais palavras.  
_Exemplo: VALOR_PI, COTACAO_DOLAR, etc._

#### Exemplo de utilização de uma constante:

_Criar um algoritmo que leia o valor do raio de uma circunferência e calcule e
apresente a área._  
```
1 - Leia o Raio (RAIO)
2 - Definir o valor de PI (VALOR_PI <- 3.14)
3 - Calcule a área da circunferência (AREA <- VALOR_PI * RAIO * RAIO)
4 - Apresente a area (AREA)
```  
Neste caso o valor de _PI_ 
é uma constante, sempre será __3.14__, indiferentemente do
valor do raio. Nesse caso o usuário poderá escolher o valor do raio, mas não o de
_PI_, pois _PI_
é uma constante e seu valor __não se altera__ durante a execução do
programa.

## Tipos de dados primitivos  

Os dados a serem armazenados pelas variáveis podem ser de quatro tipos
primitivos, a saber:


### Inteiro
Toda e qualquer informação __numérica__ que pertença ao __conjunto de números inteiros__ (negativo, nulo ou positivo).  

>_Exemplo: 234, -9, 0, -90, 3422, 5634, etc;_

### Real
Toda e qualquer informação __numérica__ que pertença ao conjunto dos números
__reais__ (negativo, nulo ou positivo).  

>_Ex: 1.75 m de altura, R$ 325.42 de saldo bancário, 2.5 m de fio, R$1252.56 de salário líquido._

### Caractere ou Texto:

Toda e qualquer informação composta por um conjunto de caracteres
alfanuméricos _(A..Z, 0..9)_ e ou especiais _(#,$,@,+,..., inclusive espaço em branco)_ .  
__Obs.:__ Todas as informações do tipo caractere devem ser sempre delimitadas por
__apóstrofes__. 

>_Ex: ’Proibido Fumar’, ’Fabio’, ’Rua XV de Novembro, 422’, ’F’ (representa sexo feminino), ’S’ (representa resposta sim)_.

### Lógico

Toda e qualquer informação que pode apenas assumir duas situações,
__VERDADEIRO__ ou __FALSO__, __SIM__ ou __NÃO__. Também conhecido como tipo de dados
__BOOLEANO__.   

>_Ex: Você é aluno dessa ETEC? __VERDADEIRO__ ou __FALSO__. Você é eleitor do bolsonaro? __SIM__ ou __NÃO__. Você é maior de idade? __SIM__ ou __NÃO__._  

## Declaração de variáveis

No ambiente computacional as informações são armazenadas em variáveis, sendo
que cada variável pode guardar apenas uma informação de cada vez, sendo
sempre do mesmo tipo. Portanto precisamos associar as variáveis a tipos,
conforme a informação que se pretende armazenar. 

A declaração destas variáveis
deve seguir a seguinte sintaxe:

>_IDENTIFICADOR DA VARIÁVEL: tipo de dados;_

#### Exemplos: 
`x, a, idade: inteiro;`  

`b: inteiro;`

`nome, endereco: caractere;`

`salario: real;`  

`resposta: lógico;`

## Comando de atribuição: 

Um comando de atribuição permite-nos fornecer um valor _(conteúdo)_ a uma
certa variável, __sendo que o tipo dessa informação deve ser compatível com o tipo da variável__. 

Possui a seguinte sintaxe:

> IDENTIFICADOR <- expressão ou valor;

sendo _'**<-**'_ a seta de atribuição.

#### Exemplos: 
`x <-2;`

`y <- 3 / x;`

`a <- verdadeiro;`

`b <- x + 8;`

___
