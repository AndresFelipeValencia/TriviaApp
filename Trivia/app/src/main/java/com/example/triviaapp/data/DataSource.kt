package com.example.triviaapp.data

import com.example.triviaapp.model.Category
import com.example.triviaapp.model.Option
import com.example.triviaapp.model.Player
import com.example.triviaapp.model.Question

var listPlayer: MutableList<Player> = mutableListOf()

val listQuestion: List<Question> = mutableListOf(
    Question(Category.POLITICS, "Cual es el presidente actual de Colombia",
        listOf<Option>(
            Option("Alvaro Uribe Velez", false, id = 1),
            Option("Ivan Duque", true, id = 2),
            Option("Gustavo petro", false, id = 3),
            Option("Alejandro Gaviria", false, id = 4),
        ), level = 1),
    Question(Category.POLITICS, "Cual es la capital de Colombia",
        listOf<Option>(
            Option("Medellin", false, id = 1),
            Option("Cali", false, id = 2),
            Option("Bogota", true, id = 3),
            Option("Quindio", false, id = 4),
        ), level = 2),
    Question(Category.POLITICS, "Cual es el salario minimo legal vigente para el 2022",
        listOf<Option>(
            Option("Es: $ 1.000.000", true, id = 1),
            Option("Es: $ 689.455", false, id = 2),
            Option("Es: $ 908.526", false, id = 3),
            Option("Es: $ 1.250.000", false, id = 4),
        ), level = 3),
    Question(Category.POLITICS, "Cuando son las elecciones presidenciales 2022",
        listOf<Option>(
            Option("29 de Marzo de 2022", false, id = 1),
            Option("02 de Febrero de 2022", false, id = 2),
            Option("20 de Julio de 2022", false, id = 3),
            Option("29 de Mayo de 2022", true, id = 4),
        ), level = 4),
    Question(Category.POLITICS, "Cual es el mayor producto de exportacion en Colombia",
        listOf<Option>(
            Option("Cafe", false, id = 1),
            Option("Cacao", false, id = 2),
            Option("Aceites crudos de petroleo", true, id = 3),
            Option("Hullas termicas", false, id = 4),
        ), level = 5),

    Question(Category.SPORTS, "Cual es el deporte mas practicado en el mundo",
        listOf<Option>(
            Option("Natacion", true, id = 1),
            Option("Voleibol", false, id = 2),
            Option("Baloncesto", false, id = 3),
            Option("Futbol", false, id = 4),
        ), level = 1),
    Question(Category.SPORTS, "Cual es el deporte mas popular del mundo",
        listOf<Option>(
            Option("Tenis", false, id = 1),
            Option("Balon mano", false, id = 2),
            Option("Beisbol", false, id = 3),
            Option("Futbol", true, id = 4),
        ), level = 2),
    Question(Category.SPORTS, "Cual es el hombre mas rapido del mundo",
        listOf<Option>(
            Option("Cristiano Ronaldo", false, id = 1),
            Option("Gareth Bale", false, id = 2),
            Option("Messi", false, id = 3),
            Option("Usain Bolt", true, id = 4),
        ), level = 3),
    Question(Category.SPORTS, "Quien fue el primer medallista Olimpico Colombiano",
        listOf<Option>(
            Option("Helmut Bellingrodt", true, id = 1),
            Option("Mariana Pajon", false, id = 2),
            Option("Caterine Ibarguen", false, id = 3),
            Option("Yuberjen Martinez", false, id = 4),
        ), level = 4),
    Question(Category.SPORTS, "Cuantas medallas de oro tiene Colombia",
        listOf<Option>(
            Option("3 Medallas de oro", false, id = 1),
            Option("1 Medallas de oro", false, id = 2),
            Option("5 Medallas de oro", false, id = 3),
            Option("2 Medallas de oro", true, id = 4),
        ), level = 5),

    Question(Category.CULTURE, "Quien escribe el libro 100 years de soledad",
        listOf<Option>(
            Option("Juan Gabriel Vasquez", false, id = 1),
            Option("William Ospina", false, id = 2),
            Option("Gabriel Garcia Marquez", true, id = 3),
            Option("Laura Restrepo", false, id = 4),
        ), level = 1),
    Question(Category.CULTURE, "Cual es la comida mas tipica de Colombia",
        listOf<Option>(
            Option("Bandeja Paisa", true, id = 1),
            Option("Lechona", false, id = 2),
            Option("Tamales", false, id = 3),
            Option("Ajiaco", false, id = 4),
        ), level = 2),
    Question(Category.CULTURE, "Que evento futbolistico se celebra cada 4 years",
        listOf<Option>(
            Option("Copa America", false, id = 1),
            Option("El Mundial", true, id = 2),
            Option("UEFA", false, id = 3),
            Option("La Bundesliga", false, id = 4),
        ), level = 3),
    Question(Category.CULTURE, "Quien es el pintor de la obra la Mona Lisa",
        listOf<Option>(
            Option("Vincent van Gogh", false, id = 1),
            Option("Miguel Angel", false, id = 2),
            Option("Leonardo da Vinci", true, id = 3),
            Option("Pablo Picasso", false, id = 4),
        ), level = 4),
    Question(Category.CULTURE, "Cuantos anos tiene la tierra",
        listOf<Option>(
            Option("4,501 years", false, id = 1),
            Option("2,022 years", false, id = 2),
            Option("5,010 years", false, id = 3),
            Option("4,543", true, id = 4),
        ), level = 5),

    Question(Category.GEOGRAPHY, "Que son los Icebergs",
        listOf<Option>(
            Option("Una masa de tierra", false, id = 1),
            Option("Un arbol gigante", false, id = 2),
            Option("Una masa de Hielo", true, id = 3),
            Option("Un barco gigante", false, id = 4),
        ), level = 1),
    Question(Category.GEOGRAPHY, "Cuantos continentes hay en el mundo",
        listOf<Option>(
            Option("10 Continentes", false, id = 1),
            Option("7 Continentes", true, id = 2),
            Option("5 Continentes", false, id = 3),
            Option("2 Continentes", false, id = 4),
        ), level = 2),
    Question(Category.GEOGRAPHY, "Cual es el desierto mas grande de la tierra",
        listOf<Option>(
            Option("Sahara", true, id = 1),
            Option("Antartico", false, id = 2),
            Option("Gobi", false, id = 3),
            Option("Patagonico", false, id = 4),
        ), level = 3),
    Question(Category.GEOGRAPHY, "Cuantos estados tienen los Estados Unidos",
        listOf<Option>(
            Option("70 Estados", false, id = 1),
            Option("20 Estados", false, id = 2),
            Option("50 Estados", true, id = 3),
            Option("55 Estados", false, id = 4),
        ), level = 4),
    Question(Category.GEOGRAPHY, "Cual es el continente mas poblado de la tierra",
        listOf<Option>(
            Option("Asia", true, id = 1),
            Option("Sudamerica", false, id = 2),
            Option("Antartica", false, id = 3),
            Option("Europa", false, id = 4),
        ), level = 5),

    Question(Category.SCIENCE, "Que es la fotosintesis",
        listOf<Option>(
            Option("Proceso químico que que utilizan las plantas y algunos organismos", true, id = 1),
            Option("La evaporacion del Agua", false, id = 2),
            Option("La condensacion del agua ", false, id = 3),
            Option("La muerte de las plantas y algunos organismos", false, id = 4),
        ), level = 1),
    Question(Category.SCIENCE, "Por que brilla el sol",
        listOf<Option>(
            Option("Por su masa critica", false, id = 1),
            Option("Por el reflejo de la luna", false, id = 2),
            Option("Por la enorme presion en su centro", true, id = 3),
            Option("Se esta derritiendo", false, id = 4),
        ), level = 2),
    Question(Category.SCIENCE, "Quien invento las computadoras",
        listOf<Option>(
            Option("Albert Einstein", false, id = 1),
            Option("Sheldon Cooper", false, id = 2),
            Option("Pedro Infante", false, id = 3),
            Option("Charles Babbage", true, id = 4),
        ), level = 3),
    Question(Category.SCIENCE, "Quien es Marie Curie",
        listOf<Option>(
            Option("Es una futbolistca", false, id = 1),
            Option("Es una cantante", false, id = 2),
            Option("Es una fisica", true, id = 3),
            Option("Es una poeta", false, id = 4),
        ), level = 4),
    Question(Category.SCIENCE, "Quien es el hombre mas inteligente de la historia",
        listOf<Option>(
            Option("William James Sidis", true, id = 1),
            Option("Isaac Newton", false, id = 2),
            Option("Nicolas Copernico", false, id = 3),
            Option("Galileo Galilei", false, id = 4),
        ), level = 5),

)
