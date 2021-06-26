package Cwiczenia2

object Zadanie5 {
  case class Osoba(val imie: String, val nazwisko: String) {
    val podatek = 0
  }
  trait Pracownik extends Osoba {
    override val podatek: Int = 20
    var pensja: Double = 0
  }
  trait Student extends Osoba {
    override val podatek: Int = 0
  }
  trait Nauczyciel extends Pracownik {
    override val podatek: Int = 10
  }
  def main(args: Array[String]): Unit = {
    val osoba1 = new Osoba("Osoba", "pierwsza") with Student
    println(s"Podatek studenta to: ${osoba1.podatek}%")

    val osoba2 = new Osoba("Osoba", "druga") with Pracownik
    println(s"Podatek pracownika to ${osoba2.podatek}%")

    val osoba3 = new Osoba("osoba", "trzecia") with Nauczyciel
    println(s"Podatek nauczyciela to ${osoba3.podatek}%")

    val osoba4 = new Osoba("osoba", "czwarta") with Student with Pracownik
    println(s"Podatek studenta,pracownika to ${osoba4.podatek}%")

    val osoba5 = new Osoba("osoba", "piata") with Pracownik with Student
    println(s"Podatek pracownika, studenta to ${osoba5.podatek}%")
  }

}
