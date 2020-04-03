package com.example.kotlinshallowdive

//Data types
//Numbers
/**
 * Integers - [Int]  -2^32- 0 - 2^32
 * Float - [Float] 1F
 * Double - [Double] 1.00
 * Long - [Long]  -2^63 to 2^63-1
 * Short - [Short] -
 * Byte - [Byte] -
 */

//Boolean - [Boolean]
//True or False

//String, Char, CharSequence

//Array

val kotlin: Int = 0
var javaV: Long = 0

//Access modifiers
/*private CTRL+ALT+/(Windows) CMD+OPTION+/(Mac)
public
internal*/

//Functions
fun playGround(newJava: Long = 10, multiplier: Int? = null) {
    javaV = newJava
    if (multiplier != null)
        javaV *= multiplier

    println("Java Value:$javaV")
}


//Classes
class KotlinIntro {

}

data class Kotlin(val username: String)

open class Kt: KotlinKtx {
    override fun newClass() {

    }
}

class Ct: KotlinCtx() {
    override fun newClass() {

    }
}

sealed class Ktx {
    data class Azeeza(val name: String) : Ktx()
    data class UgWonder(val height: Float) : Ktx()
    data class Martins(val weight: Double) : Ktx()
}

//Interfaces and Abstract classes
interface KotlinKtx{
    fun newClass()
}

/**
 * Use-cases for interfaces or abstract classes
 * CallBacks
 */

abstract class KotlinCtx {
    abstract fun newClass()
}