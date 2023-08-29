<?php
    $hostname = "127.0.0.1:3307";
    $bancodedados = "registro";
    $usuario = "root";
    $senha = "";

    $mysqli = new mysqli($hostname, $usuario, $senha, $bancodedados);
    if ($mysqli->connect_errno) {
        echo "falha ao conectar(" . $mysqli->connect_errno . ")" . $mysqli->connect_errno;
    }
    else
        echo "Conectado ao banco de dados";