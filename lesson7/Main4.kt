// МОЖНО БЫЛО СДЕЛАТЬ ГОРАЗДО ПРОЩЕ, НО ПОНЯЛ Я ЭТО ЧЕРЕЗ 15 МИНУТ ПОСЛЕ ТОГО, КАК НАПИСАЛ

import kotlin.random.Random

fun main() {
    println("ИГРА 21" +
            "\nПравила игры: Туз - 11, Король - 4, Дама - 3, Валет - 2" +
            "\nГотовы начать?")

    val start = readln()

    var cardUserSum = 0
    var cardBankerSum = 0
    var resume = ""

    when (start) {
        "Нет" -> return
        "Да" -> {
            while (cardUserSum < 22) {
                    println("Банкир взял 2 карты")
                    cardBankerSum += randomCards("+")
                    cardBankerSum += randomCards("+")

                    cardUserSum += randomCards("+")
                    cardUserSum += randomCards("+")
                    println("Сумма ваших карт: $cardUserSum")

                if (cardUserSum == 21) {
                    println("Вы выиграли!")
                    return
                }
                if (cardBankerSum == 21) {
                    println("Вы проиграли!")
                    return
                }
                if (cardUserSum < 22) {
                    println("Берёте?")
                    resume = readln()
                    if (resume == "Нет") {
                        println("Ваши карты: $cardUserSum\nКарты банкира: $cardBankerSum")
                        if (cardUserSum < 22 && cardUserSum > cardBankerSum || cardBankerSum > 21) {
                            println("Вы выиграли!")
                        }
                        return
                    }
                    else if (resume == "Да") {
                        println("Банкир взял карту")
                        cardBankerSum += randomCards("+")

                        cardUserSum += randomCards("+")
                        println("Сумма ваших карт: $cardUserSum")

                        if (cardUserSum < 22) {
                            println("Берёте?")
                            resume = readln()
                            if (resume == "Нет") {
                                println("Ваши карты: $cardUserSum\nКарты банкира: $cardBankerSum")
                                if (cardUserSum < 22 && cardUserSum > cardBankerSum || cardBankerSum > 21) {
                                    println("Вы выиграли!")
                                }
                                return
                            }
                            else if (resume == "Да") {
                                println("Банкир взял карту")
                                cardBankerSum += randomCards("+")

                                cardUserSum += randomCards("+")
                                println("Сумма ваших карт $cardUserSum")

                                if (cardUserSum < 22) {
                                    println("Берёте?")
                                    resume = readln()
                                    if (resume == "Нет") {
                                        println("Ваши карты: $cardUserSum\nКарты банкира: $cardBankerSum")
                                        if (cardUserSum < 22 && cardUserSum > cardBankerSum || cardBankerSum > 21) {
                                            println("Вы выиграли!")
                                        }
                                        return
                                    }
                                    else if (resume == "Да") {
                                        println("Банкир взял карту")
                                        cardBankerSum += randomCards("+")

                                        cardUserSum += randomCards("+")
                                        println("Сумма ваших карт $cardUserSum")

                                        if (cardUserSum < 22) {
                                            println("Берёте?")
                                            resume = readln()
                                            if (resume == "Нет") {
                                                println("Ваши карты: $cardUserSum\nКарты банкира: $cardBankerSum")
                                                if (cardUserSum < 22 && cardUserSum > cardBankerSum || cardBankerSum > 21) {
                                                    println("Вы выиграли!")
                                                }
                                                return
                                            }
                                            else if (resume == "Да") {
                                                println("Банкир взял карту")
                                                cardBankerSum += randomCards("+")

                                                cardUserSum += randomCards("+")
                                                println("Сумма ваших карт $cardUserSum")

                                                if (cardUserSum < 22) {
                                                    println("Берёте?")
                                                    resume = readln()
                                                    if (resume == "Нет") {
                                                        println("Ваши карты: $cardUserSum\nКарты банкира: $cardBankerSum")
                                                        if (cardUserSum < 22 && cardUserSum > cardBankerSum || cardBankerSum > 21) {
                                                            println("Вы выиграли!")
                                                        }
                                                        return
                                                    }
                                                    else if (resume == "Да") {
                                                        return
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    println("Вы проиграли!")
                    return
                }
            }
        }
    }
}

fun randomCards(string: String): Int {
    val cardArray = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз")
    val randomIndex = Random.nextInt(cardArray.size)
    val randomCards = cardArray[randomIndex]
    var cardNum = 0

    when (randomCards) {
        "2" -> cardNum = 2
        "3" -> cardNum = 3
        "4" -> cardNum = 4
        "5" -> cardNum = 5
        "6" -> cardNum = 6
        "7" -> cardNum = 7
        "8" -> cardNum = 8
        "9" -> cardNum = 9
        "10" -> cardNum = 10
        "Валет" -> cardNum = 2
        "Дама" -> cardNum = 3
        "Король" -> cardNum = 4
        "Туз" -> cardNum = 11
    }

    return when (string) {
        "+" -> cardNum
        else -> 0
    }
}