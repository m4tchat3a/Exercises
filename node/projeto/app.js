var express = require('express')
var app = express()

app.use(express.static('public'));

app.set('view engine', 'ejs');

app.get('/', function(req, res){
  res.render('home/index');
});

app.get('/noticias', function(req, res){
  res.render('noticias/index');
});

app.get('/tecnologia', function(req, res){
  res.render('tecnologia/index');
});

app.listen(3000, function(){
  console.log('Rodando o servidor web com express !')
});
