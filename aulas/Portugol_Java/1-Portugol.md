# Portugol Estruturado
  A estruturação do codigo e uma parte importante da programação, afinal de contas o seu codigo vai rodar em modo cascata, ou melhor dizendo, ele vai roda linha por linha.
Sobre a estruturação de codigo, ele pode ser  feito  em qualquer liguagem de programação: _java_, _linguagem C_ entre outros, porém em cada  liguagem
existe uma coisa chamada _"PALAVRAS RESERVADAS"_ (Seria como se cada liguagem de programação tivesse o seu próprio dicionário).
Alem de  cada liguagem ter suas propias palavras chaves, a liguagem de programção do mercado são todas em Inglês, com isso torna-se a programação
para aquele que não sabe Inglês um  pouco mais dificil. Com base nesse problema foi criado pseudocódigo conhecido como Português Estruturado ou Portugol, que se trata
de uma linguagem fictícia criada para estruturar um programa da mesma forma que em uma linguagem de programação, porém utilizando o nosso idioma pátrio</br>

O portugol como qualquer outra liguagem possui sua lista de palavras reservadas, que indicam que uma ação está sendo executada.</p>
//Nota as palavras chaves deve ser escrita corretamente para elas fncionarem direito.</p>

##  palavras reservadas do portugol: 
1. A palavra chave _"programa"_ indica o nome que foi dado ao mesmo.
2. A palavra chave _"var"_ indica que nessa área serão declaradas as variáveis a serem
utilizadas pelo programa.
3. A palavra chave _"início"_ marca o início do bloco de programação.
4. A palavra chave "_leia"_ indica que o dado foi lido.
5. A expressão _"c← a + b"_ indica que um processamento, um cálculo ocorreu e foi
guardado na variável c.
6. A palavra chave _"escreva"_ indica que um dado foi apresentado na tela.
7. A palavra chave _"fim"_ indica que o bloco de programação se encerrou.</p></p>



### Exemplo:</p>
Criar o código em Português estruturado que realize a soma de dois numeros.</p>
programa SOMAR</p>
var c, a, b: real              // nota: "real" é o tipo de dado primitivo da vriavel.</p>
inicio</p>
leia(a)</p>
leia(b)</p>
c ← a + b</p>
escreva (c)</p>
fim</p>

Como citado anteriomente nesse exemplo o programa rodou o codigo linha por linha, por conta disso ele será executado com maestria, etretanto se a estrutura for feita de qualquer modo o programa emitira um erro.</p>

### Exemplo Errado :</p>
Criar o código em Português estruturado que realize a soma de dois numeros.</p>
programa SOMAR</p>
c ← a + b</p>
var c, a, b: real </p>            
escreva (c)</p>
leia(b)</p>
fim</p>
leia(a)</p>
inicio</p>
*Esse programa emitira um erro.
