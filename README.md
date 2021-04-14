# DucKLib
DuckTyping for Kotlin
* Based on `DuckLib for Java`

# Install
```groovy
repositories {
    // ...
    
    // Add this line
    maven { url 'https://jitpack.io' }
}

dependencies {
    // ...
    
    // Add this line
    implementation 'com.github.AldieNightStar:kt_ducklib:bbdb1e2233'
}


```

# Simple to use
```kotlin
interface AB {
    fun a(): Int
    fun b(): Int
}

// This class ISN'T implement AB interface
class Test {
    fun a(): Int = 32
    fun b(): Int = 64
}

fun main() {
    val ab: AB = Test().quack() // DuckTyping is going here!

    // Checking that all is working
    println(ab.a())
    println(ab.b())
    
    // Printed:
    //    32
    //    64
}
```
# If you want to get data from object
```kotlin
interface AB {
  fun data(): Test; // JUST add this method - it will return SomeObject, whose Quacked Interface was made from.
  fun a(): Int
  fun b(): Int
}
```
