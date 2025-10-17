import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics
import org.apache.spark.mllib.classification.{SVMModel, SVMWithSGD}
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.linalg.Vectors
import ml.dmlc.xgboost4j.scala.spark.{XGBoostClassificationModel,XGBoostClassifier}
object XGBoost_detection {
  def main(args: Array[String]): Unit = {
    
    // Spark Context to allow eclipse to process program
    val sparkContext = new SparkContext(new SparkConf().setAppName("SVMiris").setMaster("local[*]"))
    // Load in raw data 
    val creditData = MLUtils.loadLibSVMFile(sparkContext, "creditcard_data.txt")
    // SMOTE for overfitting
  }
}