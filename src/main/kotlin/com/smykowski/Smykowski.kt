package com.smykowski
import spark.Spark.*

fun main(args: Array<String>) {
  post("/log") { request, response ->
    println(request.body())
    response.status(200)
    "ok"
  }
}
