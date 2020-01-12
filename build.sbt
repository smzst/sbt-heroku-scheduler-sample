name := "heroku-scheduler-sample"

version := "0.1"

scalaVersion := "2.13.1"

enablePlugins(JavaServerAppPackaging)

herokuAppName in Compile := "heroku-scheduler-sample"