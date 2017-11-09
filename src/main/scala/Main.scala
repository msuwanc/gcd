object Main extends App {
  val gcd = new GCD

  println(Console.GREEN + gcd.cal(8, 12) + Console.RESET)
  
  println(Console.RED + gcd.cal(2, 3) + Console.RESET)
  
  println(Console.YELLOW + gcd.cal(54, 24) + Console.RESET)
  
  println(Console.CYAN + gcd.cal(42, 56) + Console.RESET)
}