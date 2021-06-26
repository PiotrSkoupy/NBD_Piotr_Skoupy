package Cwiczenia2

object Zadanie3 {

  def main(args: Array[String]): Unit = {
    class Person(var firstName: String, var lastName: String){
      def matchTest(x: String): String = x match {
        case "Kowalski" => "Witaj Kowalski"
        case "Nowak" => "Witaj Nowak"
        case "Sasin" => "Witam organizatora"
        case _ => "Witaj nieznajomy"
      }
      println(matchTest(lastName))
    }
    var Jaco = new Person("Jacek","Sasin")
    var Adam = new Person("Adam","Kowalski")
    var Marek = new Person("Marek","Nowak")
    var Socha = new Person("Gosia","Socha")
  }
}
