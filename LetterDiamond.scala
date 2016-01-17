/**
  * Created by sethur on 15/01/2016.
  */
object LetterDiamond extends App{

  def printUsageExit() = {
    println("Invalid Input")
    System.exit(1)
  }

  val endChar={
    if(args.length==0) printUsageExit()
    val upper: Char = args(0).charAt(0).toUpper
    if(!upper.isLetter) printUsageExit()
    upper
  }

  val lines = for (char <- 'A' to endChar) yield {
    if(char != 'A')
      s"${" " * (endChar - char)}$char${" " *  ((char - 'A') * 2 - 1)}$char"
    else
      s"${" " * (endChar - char)}$char"
  }
  lines.foreach(println(_))
  lines.reverse.drop(1).foreach(println(_))

}
