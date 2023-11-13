<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>PortoResq - Prestadores de Serviço</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            text-align: center;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
        }
        a {
            text-decoration: none;
            color: #0066ff;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <img src="./img//ResqLogo.png" alt="Logo portoResq">
        <h1>Serviços de Prestadores</h1>
        <ul>
            <li><a href="api/prestadores">Lista de Prestadores</a></li>
            <li><a href="api/prestadores/add">Adicionar Prestador</a></li>
            <li><a href="api/prestadores/update">Atualizar Prestador</a></li>
            <li><a href="api/prestadores/delete">Deletar Prestador</a></li>
        </ul>
    </div>
</body>
</html>

