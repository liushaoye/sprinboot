<%@ page import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>跳转页面</title>
    <style type="text/css" >

        .gomyblog {
            display:inline-block;
            animation:lol 0.5s infinite 3s;
            -webkit-animation:lol 0.5s infinite 3s;

        }
        @keyframes lol {
            0% {transform:rotate(0deg)}
            33% {transform:rotate(30deg)}
            66% {transform:rotate(0deg)}
            100% {transform:rotate(-30deg)}
        }
        @-webkit-keyframes lol {
            0% {-webkit-transform:rotate(0deg)}
            33% {-webkit-transform:rotate(30deg)}
            66% {-webkit-transform:rotate(0deg)}
            100% {-webkit-transform:rotate(-30deg)}
        }

    </style>
</head>
<body style="align-content: center">
${msg}
</body>
</html>
