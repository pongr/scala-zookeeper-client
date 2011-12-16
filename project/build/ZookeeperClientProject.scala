import sbt._
import com.twitter.sbt._

class ZookeeperClientProject(info: ProjectInfo) extends StandardProject(info) {
  val slf4jVersion = "1.6.4"
  val slf4jApi = "org.slf4j" % "slf4j-api" % slf4jVersion
  val log4jOverSlf4j = "org.slf4j" % "log4j-over-slf4j" % slf4jVersion
  val apacheZookeeper = "org.apache" % "zookeeper" % "3.3.1"
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.9" % "test"
  
  override def ivyXML = 
    <dependencies>
      <exclude name="log4j" />
    </dependencies>

  override def pomExtra =
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
}
