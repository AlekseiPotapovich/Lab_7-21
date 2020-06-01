

object Main{
  var ms = Array("+375291234569", "+375334567813", "+8805553535", "+375447894512", "+456145851235");
  def main(args: Array[String]): Unit = {
    getNumberBLR
  }
  
  def getNumberBLR() : Unit = {
    var index : String = "+375"
    var index2 : String = ""
    var size : Int = ms.size
    for(i <- 0 until size){
      var str = ms(i)
      var str2 : String = str.substring(0, 4)
      if(index == str2){
        printf(ms(i) + "\n")
      }
    }
  }
}