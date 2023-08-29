<?php
session_start();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Login</title>
</head>

<body>
    <h1>Cadastre seu E-mail</h1>
    <?php
    if (isset($_SESSION['msg']))
        echo $_SESSION['msg'];
        unset($_SESSION['msg']);
    ?>
    <form class="formulario" method="post" action="processa.php">
        <div class="field">
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" placeholder="Nome*" required>
        </div>
        <div class="field">
            <label for="email">E-mail:</label>
            <input type="email" id="email" name="email" placeholder="E-mail*" required>
        </div>
        <div class="field">
            <label for="senha">Senha:</label>
            <input type="password" id="senha" name="senha" placeholder="Senha*" required>
        </div>
        <input type="submit" name="acao" value="Cadastrar">
    </form>
</body>

</html>