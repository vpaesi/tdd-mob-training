# Treinamento de TDD

## Exercício 1 - Saudações

Usando TDD, escreva uma função pura para cumprimentar o usuário, evoluindo o código com os requisitos na ordem abaixo.

### Requisitos:

1 - Interpolar o nome com uma saudação simples. Por exemplo, quando o nome é "Maria", o método retorna "Olá, Maria".

2 - Caso o nome não esteja preenchido, retornar "Olá, você aí".

3 - Se o nome for gritado (em maiúsculas), retornar gritando também "OLÁ, MARIA!!!".

4 - Para entrada com dois nomes, retornar os nomes separados com "e". Por exemplo para ["Maria, "Nina"], retornar "Olá, Maria e Nina".

5 - Para entrada com mais de dois nomes, separar os nomes com vírgula e o último com "e".

6 - Separar nomes gritados em outra saudação. Por exemplo para ["Maria", "LÚCIA", "Nina"] retornar "Olá Maria e Nina. E OLÁ, LÚCIA!!!"

7 - Se algum dos nomes incluir vírgula, separe e trate como nomes separados. Por exemplo para ["Maria, Lúcia", "Nina"], retornar "Olá, Maria, Lúcia e Nina".

8 - Permita que a entrada informe vírgulas intencionalmente usando caracteres de escape. Isso pode ser feito da mesma forma que em arquivos CSV, com aspas duplas em volta da entrada. Por exemplo para ["Maria", "\"Nina, Lúcia\""], retornar "Olá, Maria e Nina, Lúcia".

Fonte: https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata


## Exercício 2 - Algaritmos Romanos

Escreva uma função para converter algarismos romanos em arábicos.

Números são formados combinando os algarismos e somando seu valor. Em geral os algarismos são colocados em ordem de valor, começando com os valores mais altos. Quando valores menores precedem valores maiores, os valores menores são subtraídos dos maiores e o resultado é somado ao total.

Fonte: https://github.com/TDD-Katas/roman-numerals
