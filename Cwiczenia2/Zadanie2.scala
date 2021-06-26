package Cwiczenia2

object Zadanie2 {
  def main(args: Array[String]): Unit = {
    class Kontobankowe(var stanKonta: Int = 0){
      def wplata(dx: Int): Unit = {
        stanKonta = stanKonta + dx
      }
      def wyplata(dy: Int): Unit = {
        stanKonta = stanKonta - dy
      }
    }
  }
}
