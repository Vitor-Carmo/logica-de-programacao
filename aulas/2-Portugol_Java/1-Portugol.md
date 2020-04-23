# Portugol Estruturado
A estruturação do código é uma parte importante da programação, afinal de contas o seu código vai rodar em __modo cascata__, ou melhor dizendo, ele vai roda __linha por linha__.

Sobre a estruturação de código, ele pode ser  feito  em qualquer linguagem de programação: _Java_, _linguagem C_ entre outras. Porém em cada  linguagem
existe uma coisa chamada __PALAVRAS RESERVADAS__ _(Seria como se cada linguagem de programação tivesse o seu próprio dicionário)_.

Além de cada linguagem ter suas próprias __palavras-chaves__, a linguagem de programação do mercado são todas em __Inglês__, com isso torna-se a programação
para aquele que não sabe Inglês um  pouco mais difícil. Com base nesse problema foi criado __pseudocódigo__ conhecido como __Português Estruturado ou Portugol__, que se trata
de uma linguagem fictícia criada para estruturar um programa da mesma forma que em uma linguagem de programação, porém __utilizando o nosso idioma nativo__.

O portugol como qualquer outra linguagem possui sua lista de palavras reservadas, que indicam que ação está sendo executada.

>_Nota:  as palavras-chaves deve ser escrita corretamente para elas funcionarem direito._

##  palavras reservadas do portugol:

1. A palavra-chave `programa`, indica o __nome que foi dado ao mesmo__.  

1. A palavra-chave `var`, indica que nessa área serão declaradas as __variáveis__ a serem
utilizadas pelo programa.

1. A palavra-chave `inicio`, marca o __início do bloco__ de programação.

1. A palavra-chave `leia`, indica que o __dado foi lido__.

1. A expressão `c ← a + b`, indica que um __processamento__, um __cálculo__ ocorreu e foi
__guardado__ na variável `c`.

1. A palavra-chave `escreva`, indica que um dado foi __apresentado na tela__.

1. A palavra-chave `fim`, indica que o bloco de programação se __encerrou__.



### Exemplo:

_Criar o código em Português estruturado que realize a soma de dois numeros_.

```
programa SOMAR

var c, a, b: real  

inicio
  leia(a)
  leia(b)
  c ← a + b
  escreva (c)
fim
```

Como citado anteriomente nesse exemplo o programa rodou o código linha por linha, por conta disso ele será executado com maestria, etretanto se a estrutura for feita de qualquer modo o programa emitirá um erro.

### Exemplo Errado :
_Criar o código em Português estruturado que realize a soma de dois numeros_.

```
programa SOMAR
c ← a + b

var c, a, b: real             

escreva (c)
leia(b)
fim
leia(a)

inicio
```

_Esse programa emitira um erro_.
___