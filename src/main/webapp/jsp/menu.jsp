<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        table {margin: 0 auto;}
        input[type=text], input[type=date] , input[type=number] {
            width: 45%;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            background-color: white;
            background-position: 10px 10px;
            padding: 5px 7px 1px;
            margin-bottom: 5px;
        }
        select {
            width: 30%;
            padding: 8px 2px;
            border: none;
            border-radius: 4px;
            background-color: #f1f1f1;
        }
        textarea {
            width: 50%;
            height: 75px;
            padding: 1px 2px;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
            background-color: #f8f8f8;
            resize: none;
        }
        .button{
            background-color: #1ABC9C;
            border: none;
            color: white;
            padding: 5px 15px;
            text-align: center;
            text-decoration: none;
            display: block;
            margin : auto;
            font-size: 16px;
            cursor: pointer;
        }
        .button {
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(134, 75, 75, 0.19);
        }

        .button:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(96, 53, 53, 0.19);
        }
        h1
        {
            text-align: center;
            margin-top: 0px;
        }
        form {
            width: 35%;
            margin: 0 auto;
        }
        .menu {
            display: flex;                /* Transformation en flexbox */
            padding:0;                    /* Suppression des marges internes */
            background-color: #ccc;       /* Ajout de la couleur d'arrière-plan */
            justify-content: space-around;/* Alignements des liens dans le menu */
            font-size: 15px;
            font-weight: bold;
        }
        .menu li {
            list-style-type: none ;       /* Suppression des puces */

        }
        .menu a {
            display:block;                /* Transformation en block */
            min-width: 130px;             /* Largeur minimale des liens */
            margin: 0.5rem;               /* Marges externes */
            padding: 0.4rem 0;            /* Marges internes */
            text-align: center;           /* Centrage du texte */
            background-color: #1ABC9C;    /* Arrière-plan */
            color: #fff;                  /* Couleur du texte */
            text-decoration: none;        /* Suppression du soulignement */
            border: 0px solid ;       /* Ajout d'une bordure */
            border-radius: 4px;           /* Arrondis des bordures */
            transition: all 1s ;          /* Ajout des effets de transition */
        }
        .menu a.actif {
            background-color: #000 ;
            color: #1ABC9C ;
            border-color: #1ABC9C ;
        }
        .menu a:hover,
        .menu a:hover.actif{
            background-color: #ad7594;
            color: #ffe843;
            border-color: #ffe843;
        }
        label
        {
            display: block;
            width: 150px;
            float: left;
            padding: 5px 7px 1px;
        }
        body{ margin-left: auto;
            margin-right: auto; }

        th                 { background-color : #55ba57; }
        /* Alternance de couleur sur les lignes */
        tr:nth-child(even) { background-color : #CED4E5; }
        tr:nth-child(odd)  { background-color : #E8EBF5; }
    </style>
             <title>Insert title here</title>
</head>
<body>
<nav >
    <ul class="menu">
        <li><a href="/">Accueil</a></li>
        <li><a href="/formhero">Création</a></li>
        <li><a href="/liste">Liste</a></li>
        <li><a href="/detail">Detail</a></li>
        <li><a href="/formpower">Pouvoir</a></li>
   </ul>
</nav>
</body>
</html>