<?php
session_start();
include_once("conexao.php");

$nome = filter_input(INPUT_POST, 'nome', FILTER_SANITIZE_STRING);
$email = filter_input(INPUT_POST, 'email', FILTER_SANITIZE_STRING);
$senha = filter_input(INPUT_POST, 'senha', FILTER_SANITIZE_STRING);

$result_usuario = "INSERT INTO usuarios (nome, email, created, senha) VALUES ('$nome', '$email', NOW(), '$senha')";
$resultado_usuario = mysqli_query($mysqli, $result_usuario);

if(mysqli_insert_id($mysqli)) {
    $_SESSION['msg'] = "<p style='color:green;'>Usuario cadastrado com sucesso</p>";
    header("Location: cadastrocliente.php");
} else {
    header("Location: cadastrocliente.php");
}
