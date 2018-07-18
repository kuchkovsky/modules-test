name := "Modules Test"
version := "1.0"
scalaVersion := "2.12.6"

lazy val global = (project in file("."))
  .aggregate(
    core,
    module1,
    module2,
    module3
  )

lazy val core = project
  
lazy val module1 = project
  .dependsOn(core)

lazy val module2 = project
  .dependsOn(core)

lazy val module3 = project
  .dependsOn(core)
