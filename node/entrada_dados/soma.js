var ler_dados = require('readline-sync');

var valor1 = ler_dados.question('Digite o primeiro valor: ');
var valor2 = ler_dados.question('Digite o segundo valor: ');

var resultado = parseInt(valor1) + parseInt(valor2);

console.log("A soma entre " + valor1 + " + " + valor2 + " é " + resultado);