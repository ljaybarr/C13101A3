package com.example.c13101a3

fun main () {
    println("===== LIST EXAMPLE =====")
    val fruits = listOf("Apple", "Banana", "Orange", "Banana", "Pear")

    println(fruits)
    println("First fruit: ${fruits[0]}")
    println("Third fruit: ${fruits[2]}")

    println("===== SET EXAMPLE =====")
    val subjects = setOf("Kotlin", "Jetpack Compose", "Kotlin", "Django", "UX/UI")
    println(subjects)

    val colors = setOf("Red", "Orange", "Yellow", "Yellow", "Green", "Blue", "Blue")
    println("colors: $colors")
    println("Size: ${colors.size}")

    // Challenge 1 Session 3

    val hobbies = setOf("Video Games", "Woodcarving", "Sports", "Coding", "Coding", "Sports")
    println("Hobbies: $hobbies")
    println("Size: ${hobbies.size}")
    println("a set is useful, because it can be used to gather unique data and cut out any redundancies that may not be as important to the developers goal")

    println("===== MAP EXAMPLE =====")
    val student = mapOf(
        "name" to "Jay",
        "school" to "SDGKU",
        "program" to "MDI2"
    )

    println(student)
    println("Name: ${student["name"]}")
    println("Program: ${student["program"]}")

    // Challenge 2 Session 3

    val countries = mapOf(
        "United States" to "Washington DC",
        "Mexico" to "Mexico City",
        "Canada" to "Ottowa",
        "Brazil" to "Brasilia"
    )

    for ((country, capital) in countries) (
        println("Country: $country, Capital: $capital")
    )

    // Challenge 3 Session 3

    val favoriteMobileApps = listOf("YouTube", "Snapchat", "Reddit", "Discord", "Tiktok")
    val favoriteMovies = setOf("Wanted", "Deliver us from evil", "Evil Dead", "It", "It", "Wanted")
    val personalProfile = mapOf(
        "name" to "Jay",
        "age" to "28",
        "city" to "Pisgah",
        "program" to "MDI2"
    )

    println("Favorite Mobile Apps: ${favoriteMobileApps}")
    println("Favorite Movies: ${favoriteMovies}")
    println("My personal profile is: ${personalProfile}")

    println("====== IMMUTABLE LIST EXAMPLE ======")
    val cars = listOf("Honda", "Kia", "BMW", "Mazda", "Chevrolet", "Toyota", "Ford")

    println(cars)
    println("First car: ${cars[0]}")
    println("Second car: ${cars[1]}")

    for (car in cars) {
        println(car)
    }

    // Challenge 4 Session 3

    val favoriteVideoGames = listOf("Fable", "Fallout", "TES", "Dragons Dogma 2", "Darkest Dungeon")

    for (games in favoriteVideoGames)
        println(games)

    println("First Game: ${favoriteVideoGames[0]}")
    println("Last Game: ${favoriteVideoGames[4]}")

    println("====== MUTABLE LIST EXAMPLE ======")
    val vegetables = mutableListOf("Carrot", "Broccoli", "Celery", "Potato")
    println(vegetables)
    // ADD A VALUE
    println("\n====== ADD A VALUE ======")
    vegetables.add("Corn")
    println(vegetables)
    println("\n====== REMOVE A VALUE ======")
    vegetables.remove("Potato")
    println(vegetables)
    // UPDATE A VALUE
    println("\n====== UPDATE A VALUE ======")
    vegetables[3] = "Onion"
    println(vegetables)

    // Challenge 5 Session 3

    val favoriteFoods = mutableListOf("Ramen", "Wings", "Chicken Parm")
    println(favoriteFoods)
    favoriteFoods.add("Pizza")
    println(favoriteFoods)
    favoriteFoods.remove("Chicken Parm")
    println(favoriteFoods)
    favoriteFoods[1] = "Steak"
    println(favoriteFoods)

    // Basic Function Syntax

    fun sayHello(){
        println("Hello World!")
    }

    // Function with Parameters

    fun greetUser(name: String) {
        println("Hello, $name")
    }

    // Function with Return Value

    fun addNumbers(number1: Int, number2: Int): Int {
        return number1 + number2
    }


    sayHello()
    greetUser("Me")
    println(addNumbers(2, 6))

    // Challenge 6 Session 3

    fun favoriteMovieGetter(favoriteMovie: String){
        println("Your favorite movie is: $favoriteMovie, that's a good one!")
    }

    fun multiplyNumbers(number1: Int, number2: Int, number3: Int): Int {
        return number1 * number2 * number3
    }

    favoriteMovieGetter("Donny Darko")
    println(multiplyNumbers(2, 5, 26))
}
