object main {
  def main(args: Array[String]): Unit = {
    println("Testing Main")

    //testing config
    val firstConfig = config("Scott",98212388,"200 Water Street", false, Some("Bianca"))
    print(firstConfig.isAlive)

    //testing variations of config
    val testConfig = config(name = "Max", number = 98202388, partner = Some("Vivian"), address = "test address")
    print(testConfig)
  }
}
