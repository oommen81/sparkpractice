import org.apache.spark.sql.SparkSession


object test {
  
  
  def main (args : Array[String])
  {
    val sparksession = SparkSession.builder().appName("test")
                                             .master("local")
                                             .getOrCreate()
        sparksession.close()
  }
}