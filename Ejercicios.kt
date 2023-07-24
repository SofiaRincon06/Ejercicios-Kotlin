package com.example.ejercicioskotlin.ui.theme

import kotlin.math.pow

fun main() {
    var opcion: Int
    while (true) {
        println("Menú de opciones:")
        println("1. Opción 1")
        println("2. Opción 2")
        println("3. Opción 3")
        println("99. Salir")

        println("Ingrese el número de la opción deseada:")
        opcion = readLine()?.toIntOrNull() ?: 0
        when (opcion) {

            //Ejercicios Operadores
            // Ejercicio:Calcular el área de un triángulo .
            1 -> {
                println("Ejercicio 1 Calcular área del triángulo")

                println("Ingresa la base: ")

                var base: Int = readLine()!!.toInt()

                println("Ingresa la altura: ")

                var height: Int = readLine()!!.toInt()

                var are = (base * height) / 2
                println("El área es: $are")

                println( "Ejercicio 2:Ingresar dos números por teclado y sumarlos")
                println("Sume los números ")
                println("Ingrese el #1: ")
                var number1: Int = readLine()!!.toInt()
                println("Ingrese el #2: ")
                var number2: Int = readLine()!!.toInt()
                var addition = number1 + number2
                println(" El total de la suma es: $addition")

                println(" Ejercicio #3:Ingresar un número y visualizar el número elevado al cuadrado.")
                println("Eleve el número al cuadrado: ")
                println("Ingrese el número que desea elevar al cuadrado: ")
                var number: Int = readLine()!!.toInt()
                var square = number * number
                println("$number elevado a el cuadrado da: $square")

                println( "Ejercicio 4: Escribir un algoritmo que convierta de euros a dólares")
                println("Convierta sus Euros en Dolares")

                var dola: Double = 1.11
                println("Ingrese el valor en Euros: ")
                val eu: Int = readLine()!!.toInt()
                val mone = eu * dola
                println(" $eu euros en dolares es $mone")

                println(" Ejercicio 5:Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro.")
                println("Ingrese el lado de su cuadrado  : ")
                val side: Int = readLine()!!.toInt()
                val area1 = side * side
                val perimeter = side * 4
                println("El area de su cuadrado es: $area1 y el perimetro del cuadrado es: $perimeter")

                println(" Ejercicio 6: Escribir un algoritmo que determine el área y el volúmen de un cilindro.")

                println("digite la altura de el  cilindro   : ")
                val h: Double = readLine()!!.toDouble()
                println("digite el  radio de el  cilindro  : ")
                val rad: Double = readLine()!!.toDouble()
                var pi: Double = 3.14
                val volume = pi * (rad).pow(2) * h
                val area = 2 * (pi * rad).pow(2) + (pi * 2 * rad * h)
                println("el area de el  cilindro es $area y el volumen de el cilindro es $volume")

                println(" Ejercicio 7: Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.")

                println("calcular el la longitud y area de una circuferencia")
                println("Digite el radio de la circuferencia cm³:  ")
                val r: Double = readLine()!!.toDouble()
                var pi1: Double = 3.14
                var areas = pi1 * (r).pow(2)
                val length = 2 * pi1 * r
                println("el area de la circuferencia es  $areas cm³  y la longitud de la circuferencia es $length cm³")

                println(" Ejercicio 8: Calcular el promedio de tres (3) números ingresados por teclado")
                println("Calcular el promedio de 3 numeros ")

                println("digite el #1 número : ")
                val nu1: Int = readLine()!!.toInt()
                println("digite el #2 el número : ")
                val nu2: Int = readLine()!!.toInt()
                println("digite el #3 número : ")
                val nu3: Int = readLine()!!.toInt()

                val sum = nu1 + nu2 + nu3
                val prome = sum / 3
                println("el promedio de los números es: $prome")


            }


            2 -> {
                //Ejercicios Condicionales

                println(" Ejercicio 1: Número positivo o negativo")
                println("digite un numero: ")
                val nu: Int = readLine()!!.toInt()
                if (nu > 0) {
                    println("el numero es positivo :) ")
                } else if (nu < 0) {
                    println("el numero es negativo :( ")
                } else if (nu.equals(0)) {
                    println("el numero es cero ")
                }

                println(" Ejercicio 2: mayor y menor")
                println("Ingrese el número 1 : ")
                var n1: Int = readLine()!!.toInt()
                println("Ingrese el número 2 : ")
                var n2: Int = readLine()!!.toInt()
                if (n1 > n2) {
                    println("El número $n1 es mayor que $n2")
                } else if (n1 < n2) {
                    println("El número $n1 es menor que $n2")
                } else {
                    println("Los números son iguales ")
                }

                println(" Ejercicio 3: numeros enteros positivos")
                println("digite el primer número : ")
                var nu1: Int = readLine()!!.toInt()
                println("digite el  segundo número : ")
                var nu2: Int = readLine()!!.toInt()
                println("digite el tercer  número : ")
                var nu3: Int = readLine()!!.toInt()

                var nums = arrayOf(nu1, nu2, nu3)
                var nm = nums.max()
                var nmen = nums.min()
                println("el número mayor es $nm  \n el número menor es $nmen ")

                println(" Ejercicio 4: numero A y B")
                println("Ingrese el valor de A: ")
                var a: Int = readLine()!!.toInt()
                println("Ingrese el valor de B: ")
                var b: Int = readLine()!!.toInt()
                if (a < b) {
                    val sum = a + b
                    println(" la suma de $a + $b es $sum")
                } else if (a > b) {
                    val res = a - b
                    println(" la resta de $a - $b es $res")

                }

                println(" Ejercicio 5: Numero cociente")
                println("Ingrese el valor de A: ")
                var a1: Int = readLine()!!.toInt()
                println("Ingrese el valor de B: ")
                var b1: Int = readLine()!!.toInt()
                if (a1 > 0 && b1 > 0) {
                    var result = a1 / b1
                    println("La division de $a1 y $b1 es: $result")
                } else {
                    println("La división por 0 es invalida ")
                }

                println(" Ejercicio 6: suma y multiplicación")
                println("Ingrese el valor de A: ")
                var a2: Int = readLine()!!.toInt()
                println("Ingrese el valor de B: ")
                var b2: Int = readLine()!!.toInt()
                if (a2 < 0 || b2 < 0) {
                    var su = a2 + b2
                    println("La suma de $a2 y de $b2 es $su ")
                } else {
                    var mul = a2 * b2
                    println("La multiplicación de $a2 y $b2 es: $mul")
                }
                println(" Ejercicio 7: año  bisiesto")
                println("Consulte e año que desea saber si es bisiesto o no   ")
                val year: Int = readLine()!!.toInt()
                if (year % 4 == 0) {
                    println("el año $year es biciesto ")
                } else {
                    println(" el año no es biciesto ")
                }
            }


            3 -> {

                //Ejercicio Ciclos
                println(" Ejercicio 1: multiplos")
                fun main() {
                    for(nume in 1..100){
                if(nume %3 ==0){
                    println(nume)
                }
            }
    println(" Ejercio 2: Impares")
    for (num2 in 1..100 step 2) {
        println(num2)
    }
     println(" Ejercicio 3: Pares")
            for(num3 in 2..100 step 2){
                println(num3)
            }
     println(" Ejercicio 4: Cuadrados")
    for (num4 in 1..30) {
        var cuad = num4 * num4
        println("El cuadrado de $num4 es $cuad")
    }
     println(" Ejercicio 5: numero naturales")
    var sumSquares = 0

    for (numero in 1..100) {
        val square1 = numero * numero
        sumSquares += square1
    }

    println("La suma de los cuadrados de los cien primeros números naturales es: $sumSquares")


    println(" Ejercicio 6:secuencia ascendente")
    val firstNumber = 5
    val secondNumber = 15

    println("Números comprendidos entre $firstNumber y $secondNumber en secuencia ascendente:")

    for (num6 in firstNumber..secondNumber) {
        println(num6)
    }
            println(" Ejercicio 7: suma numeros")
            var sum1 = 0
            var num7: Int

            println("Ingrese los números a sumar (ingrese 0 para detener):")

            while (true) {
                var num7 = readLine()!!.toInt()

                if (num7 == 0) {
                    break
                }
                sum1 += num7
            }

            println("La suma de los números ingresados es: $sum1")
                }
            }
            99 -> {
                println("Saliendo del programa...")
                return
            }
            else -> {
                println("Opción inválida. Por favor, ingrese un número válido del 1 al 4.")
            }
        }
    }
}









