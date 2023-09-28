class Address(city: String, region: String) {
  val cityName: String = city
  val regionName: String = region

  override def toString: String = s"$cityName, $regionName"
}

class Human(name: String, age: Int, address: Address) {
  val fullName: String = name
  val personAge: Int = age
  val homeAddress: Address = address

  override def toString: String = s"Name: $fullName\nAge: $personAge\nAddress: $homeAddress"
}

object Main extends App {
  val adress_human = new Address("Kherson", "Kherson Region")
  val name_people = new Human("Mykola", 18, adress_human)

  println(name_people)
}

Main.main(Array.empty[String])
