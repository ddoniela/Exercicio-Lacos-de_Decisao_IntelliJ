fun main(){

    /*
        Exercício 1: Faça um programa que receba três inteiros e diga qual deles é o maior.

     */

    /*

    println("Digite o primeiro valor inteiro: ")
    var int1 = readln().toInt()

    println("Digite o segundo valor inteiro: ")
    var int2 = readln().toInt()

    println("Digite o terceiro valor inteiro: ")
    var int3 = readln().toInt()

    if (int1 > int2 && int1 > int3){
        println("O maior valor é o $int1")
    }

    else if (int2 > int1 && int2 > int3){
        println("O maior valor é o $int2")
    }

    else{
        println("O maior valor é o $int3")
    }
    */

    /*

    Exercício 2 - Faça um programa que entre com três números e coloque em ordem crescente.

     */

    /*

    println("Digite o primeiro valor: ")
    var v1 = readln().toInt()

    println("Digite o segundo valor: ")
    var v2 = readln().toInt()

    println("Digite o terceiro valor: ")
    var v3 = readln().toInt()

    if (v1 <= v2 && v2 <= v3){
        println("A ordem crescente é: $v1, $v2, $v3")
    }

    else if (v2 <= v1 && v1 <= v3){
        println("A ordem crescente é: $v2, $v1, $v3")
    }

    else if (v3 <= v1 && v1 <= v2){
        println("A ordem crescente é: $v3, $v1, $v2")
    }

    else if (v1 <= v3 && v3 <= v2){
        println("A ordem crescente é: $v1, $v3, $v2")
    }

    else if (v2 <= v3 && v3 <= v1){
        println("A ordem crescente é: $v2, $v3, $v1")
    }

    else if (v3 <= v2 && v2 <= v1){
        println("A ordem crescente é: $v3, $v2, $v1")
    }


     */

    /*

    Exercício 3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
    - 10-14 infantil
    - 15-17 juvenil
    - 18-25 adulto

     */
    /*
    print("Digite a sua idade: ")
    val idade = readln().toInt()

    when(idade){
        in 10..14 -> println("A sua categoria é a Infantil.")
        in 15..17 -> println("A sua categoria é a Juvenil.")
        in 18..25 -> println("A sua categoria é a Adulto.")
        else -> println("Idade inválida")
    }

     */

    /*

       Exercício 4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este
   número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
   ímpar exiba o número elevado ao quadrado.

        */

    println("Digite um número qualquer: ")
    val num = readln().toDouble()
    var raiz = Math.sqrt(num)
    var pot = Math.pow(num, 2.0)

    if (num % 2 == 0.0){
        println("O seu número é par! E a raíz quadrada dele é: $raiz")

    }

    else{
        println("O seu número é ímpar! E esse número elevado ao quadrado é: $pot")
    }


}