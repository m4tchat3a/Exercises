var ler_dados = require('readline-sync');

var valor1 = ler_dados.question('Digite o primeiro valor: ');
var valor2 = ler_dados.question('Digite o segundo valor: ');

if(valor1 > valor2) {
    console.log(valor1 + " é maior que " + valor2)
} else if(valor1 < valor2) {
    console.log(valor1 + " é menor que " + valor2)
} else if(valor1 = valor2){
    console.log(valor1 + " é igual a " + valor2)
}