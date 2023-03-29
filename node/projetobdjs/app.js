const express = require('express')
const aplicacao = express();
const cliente = require('./clientes');
const clienteNome = require('./clientes_nomes');
const clienteNovo = require('./cliente_novo');

aplicacao.use(express.static(__dirname + '/public'));

aplicacao.set('view engine', 'ejs')

aplicacao.get('/', function(req, res) {
    res.send('Hello World!')
})

aplicacao.get('/tecnologia', function(req, res) {
    res.render('secao/tecnologia.ejs')
    console.log("Tecnologia da Informação")
})

aplicacao.get('/home', function(req, res) {
    res.render('secao/home.ejs')
    console.log("Home Page")
})

aplicacao.listen(3000, function() {
    console.log("Servidor Web criado através do Express")
})