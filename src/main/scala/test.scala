object test {
  def main(args: Array[String]): Unit = {
    val start_time=System.currentTimeMillis()
    import java.text.SimpleDateFormat
    val timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(start_time)
    print(timeStamp)
  }
}
