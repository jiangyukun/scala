package me.jiangyu

import scala.io.Source

/**
 * Scala class, object
 * Created by jiangyukun on 2015/5/20.
 */
class ScalaClass extends A {

  override
  def a(): Int = {
    println("instance")
    println("---------end--------")
    ScalaClass.c()
    1
  }
}

object ScalaClass {
  def main(args: Array[String]) {
    val scalaClass = new ScalaClass
    scalaClass.a()

    val lines = Source.fromFile("D:/2015/PROJECT/branch/scala/src/a.txt", "utf8").getLines()
    for (line <- lines) {
      println(line)
    }
    try {
      a()
    } catch {
      case e: Exception =>
        println(e)
        val s = b("call b()")
        println("::" + s)
        println(1)
    }
  }

  def a(): Int = {
    val a = 1
    throw new Exception("xxx")
  }

  def b(str: String): String = {
    val a = 11
    println(a + str)
    "xxx"
  }

  def c(): Unit = {
    println("static c method")
  }
}
