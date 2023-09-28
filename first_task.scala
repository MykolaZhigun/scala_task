object Main {
  def main(args: Array[String]): Unit = {
    val numbers_array = Array(1, 2, 3) //Массив


    if (numbers_array.isEmpty) {
      println("Массив пуст.")
    } else {
      var min = numbers_array.min
      var max = numbers_array.max
      var result_number = numbers_array.reduceLeft(_*_) //Перемножаємо елементи
      var find_number = numbers_array.contains(2)
      var AVG_number = (numbers_array.sum)/numbers_array.length //знаходимо середнє арифметичне


      if (find_number)
      {
        println("В массиві є число 2")
      }
      else
      {
        println("В массиві не має числа 2")
      }


      // Виводимо текст в якому виводимо максимальне та мінімальне число (max, min) через форматування $
      println(s"\nСамое маленькое число: $min")
      println(s"Самое большое число: $max")
      println(s"Добуток чисел масива: $result_number")
      println(s"AVG: $AVG_number")
    }
  }
}

Main.main(Array.empty[String])
