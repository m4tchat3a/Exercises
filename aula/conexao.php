<?php
    $hostname = "localhost";
    $bancodedados = "conexao";
    $usuario = "root";
    $senha = "123456";

    $mysqli = new mysqli($hostname, $usuario, $senha, $bancodedados);
    if ($mysqli->connect_errno) {
        echo "falha ao cnectar(" . $mysqli->connect_errno . ")" . $mysqli->connect_errno;
    }
    else
        echo "Conectado ao banco de dados";