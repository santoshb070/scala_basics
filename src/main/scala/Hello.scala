/**
  * Created by santosh on 02/04/2017.
  */
object Hello {
  def main(args: Array[String]): Unit = {
    val first_name="Santosh"
    val last_name=" Bhamidipati"
    val name = first_name.concat(last_name)
    println(name)

    //we can import packages where ever needed in scala there is no condition like it is needed to be given at the starting of the code
    import org.apache.spark.{SparkContext,SparkConf}
    val conf = new SparkConf().setAppName("spark-1").setMaster("local")
    val sc = new SparkContext(conf)

    //parallelizing an existing collection in spark
    val data = sc.parallelize(List(1,2,3,4))
    val output=data.map(l=>l+1)
    output.foreach(println)

    //choosing file from an existing location
    val textdata = sc.textFile("Data/test_data_file")
    val text_finder=textdata.map(l=>l.contains("santosh")).collect()
    text_finder.foreach(println)

  }

}
