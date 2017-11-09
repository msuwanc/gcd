class GCD {
  def cal(a: Int, b: Int): Int = {
    if(a % b == 0) b
    else cal(b, a % b)
  }
}