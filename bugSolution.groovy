def someMethod(Map params) {
  if (params instanceof Map) {
    params.each { key, value ->
      println "key: $key, value: $value"
    }
  } else {
    println "Error: Expected a map, but received: $params"
  }
}

def someMethod2(Object params) {
  if (params instanceof List) {
    println "List detected: $params"
  } else if (params instanceof Map) {
    params.each { key, value ->
      println "key: $key, value: $value"
    }
  } else {
    println "Unexpected type: $params"
  }
}

someMethod(["a":1, "b":2])
someMethod2(["a":1, "b":2])
someMethod2([1,2,3])