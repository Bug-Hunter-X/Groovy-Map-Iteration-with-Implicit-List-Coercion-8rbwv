def someMethod(Map params) {
  params.each { key, value ->
    println "key: $key, value: $value"
  }
}

someMethod( ["a":1, "b":2] )