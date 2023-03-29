var valor_produto;          // R$ 2.000,00
var desconto_percentual;    // 20%
var valor_descontado;       // R$ 400,00
var valor_liquido;          // R$ 1.600,00

valor_produto = 2000;
desconto_percentual = 0.2;
valor_descontado = valor_produto * desconto_percentual;
valor_liquido = valor_produto - valor_descontado;

console.log("Valor Líquido do Produto : R$ " + valor_liquido.toLocaleString('en-US', {style: 'currency', currency: 'USD'}));
console.log("Valor Líquido do Produto : R$ " + valor_liquido.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}));