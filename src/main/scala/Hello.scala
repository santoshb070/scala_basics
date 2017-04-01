/**
  * Created by bhami on 02/04/2017.
  */
object Hello {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=12
    val c = a*b+10
    println(c)
    val string = "santosh"
    println("length of first name is "+string.length)
    val name = string.concat(" bhamidipati")
    println("original name is "+name)

    import org.apache.spark.{SparkContext,SparkConf}
    val conf = new SparkConf().setAppName("spark-1").setMaster("local")
    val sc = new SparkContext(conf)

    val data = sc.parallelize(List(1,2,3,4))
    val output=data.map(l=>l+1)
    output.foreach(println)

  }

}
