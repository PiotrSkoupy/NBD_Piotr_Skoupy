package Cwiczenia2

object Zadanie1 {
  def main(args: Array[String]): Unit = {
    def matchTest(x: String): String = x match {
      case "Poniedziałek" => "praca"
      case "Wtorek" => "praca"
      case "Środa" => "praca"
      case "Czwartek" => "praca"
      case "Piątek" => "praca"
      case "Sobota" => "weekend"
      case "Niedziela" => "weekend"
      case _ => "Nie ma takiego dnia"
    }
    println(matchTest("Poniedziałek"))
    println(matchTest("Niedziela"))
    println(matchTest("Kawa"))
  }

}
