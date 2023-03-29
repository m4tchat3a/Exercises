var ler_dados = require('readline-sync');

var valor1 = ler_dados.question('Digite o primeiro valor: ');
var valor2 = ler_dados.question('Digite o segundo valor: ');
var resultado; 
var sinal;

var operador = ler_dados.question('Digite [1 - soma] [2 - subtrair] [3 - multiplicar] [4 - dividir]: ');

if(operador == 1) {
    resultado = parseInt(valor1) + parseInt(valor2);
    sinal = "+";
} else if(operador == 2) {
    resultado = parseInt(valor1) - parseInt(valor2);
    sinal = "-";
} else if(operador == 3) {
    resultado = parseInt(valor1) * parseInt(valor2);
    sinal = "*";
} else if(operador == 4) {
    resultado = parseInt(valor1) / parseInt(valor2);
    sinal = "/";
} 

if (sinal == "/" && valor2 == 0) {
    console.log("Não pode dividir por zero!")
} else {
    console.log(valor1 + sinal + valor2 + " = " + resultado)
}