//import kotlin.random.Random
//
//object Main {
//    @JvmStatic
//    fun main(args: Array<String>) {
//
//        val coordinate = Coordinate()
//        val gameField = Field()
//        val compField = Field()
//
//        compField.initField()
//        gameField.initField() //Создание
//        gameField.printField() //Вывод
//
//        val isShipReady = booleanArrayOf(
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true
//        ) //состояние каждого корабля для проверок
//
//        val isShipReady2 = booleanArrayOf(
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true
//        ) //состояние каждого корабля для проверок
//        val shipLength = intArrayOf(4, 3, 3, 2, 2, 2, 1, 1, 1, 1) //палубы кораблей
//        var i = 0
//        while (i < isShipReady.size) {
//            while (isShipReady[i]) { //пока true программа запрашивает координаты
//                System.out.printf("Введи координаты (%s палуб): \n", shipLength[i])
//                val newShip = coordinate.Coordinates(coordinate.readInput()) //новый корабль
//                if (!coordinate.isComparisonCoordinate(newShip)) { //проверка на корректность координат
//                    println("Ошибка в координатах! Попробуй снова:")
//                    break
//                }
//                if (!coordinate.isCorrectLength(newShip, shipLength[i])) { //проверка на длину
//                    print("Ошибка! Неверная длина корабля! Попробуй снова:")
//                    break
//                }
//                if (!gameField.isEmptyAround(newShip)) { //проверка на окружение
//                    break
//                }
//                gameField.fillPlayerField(newShip) //после удачных проверок выводим корабль
//                isShipReady[i] = false
//                i++
//                if (i == 10) break
//            }
//        }
//
//        i = 0
//        while (i <isShipReady2.size){
//            while (isShipReady2[i]){
//
//                val newShip = intArrayOf(Random.nextInt(1,11),Random.nextInt(1,11),Random.nextInt(1,11),Random.nextInt(1,11))
//
//                if (!coordinate.isComparisonCoordinate(newShip)) { //проверка на корректность координат
//                    break
//                }
//                if (!coordinate.isCorrectLength(newShip, shipLength[i])) { //проверка на длину
//                    break
//                }
//                if (!compField.isEmptyAround(newShip)) { //проверка на окружение
//                    break
//                }
//                compField.fillPlayerField(newShip) //после удачных проверок выводим корабль
//                isShipReady[i] = false
//                i++
//                if (i == 10) break
//            }
//        }
//
////        for(i in 0..30){
////            gameField.computerShot()
////        }
//        println("Начало игры!")
//        val countDots = 20
//        var playerDots = 0
//        var compDots = 0
//
//        gameField.printField()
//        compField.printField()
//        compField.printCompField()
//
//        while(true){
//            compField.computerShot()
//            compDots = compField.dotsCheck()
//            compField.printCompField()
//            println(compDots)
//
//            gameField.computerShot()
//            playerDots = gameField.dotsCheck()
//            gameField.printField()
//            println(playerDots)
//            if(playerDots == 20){
//                println("Computer Wins!")
//                break
//            }
//            if(compDots == 20){
//                println("Player wins!")
//                break
//            }
//        }
//    }
//}