package Mathematics

object Fibonacci {
  private val allFibonacci: Stream[Int] = ???

  /**
    * Method to use the allFibonacci stream to take the first total numbers
    * Using streams is both an easy and efficient way to generate fibonacci numbers (streams are memoized)
    * @param total
    * @return
    */
  def fibGenerate(total: Int): Seq[Int] = ???
}
