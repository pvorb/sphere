import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "Sphere"
  val appVersion      = "0.0.0"

  val appDependencies = Nil

  val main = PlayProject(
    appName, appVersion, appDependencies, mainLang = SCALA
  )
}
