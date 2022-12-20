package com.example.myapplication

import kotlin.random.Random

class Animal(
    var e : Int,
    var w : Int = 0,
    var a : Int = 0,
    private val maxAge : Int ,
    val name : String
    ){



    var age = a
        private set(value){
            field = value
        }
        get(){
            return field
        }

    var energy = e
        private set(value){
            field = value
        }
        get(){
            return field
        }

    var weight = w
        private set(value){
            field = value
        }
        get(){
            return field
        }

    val isTooOld = age>=maxAge

    fun sleep(){
        if(!isTooOld){
            energy+=5
            age+=1
            println("$name спит")
        }
    }

    public fun eat(){
        if(!isTooOld){
            energy+=3
            weight-=1
            incrementAgeSometimes()
            println("$name ест")
        }
    }

    fun move(){
        if(!isTooOld || (energy>=5 && weight>=1)) {
            energy -= 5
            weight -= 1
            incrementAgeSometimes()
            println("$name двигается")
        }
    }

    fun makeChild() : Animal{
        val newEnergy = Random.nextInt(10)+ 1
        val newWeight = Random.nextInt(5) + 1
        println("родился новый $name с весом $newWeight и енергией $newEnergy")
        return Animal(e = newEnergy, name = this.name, maxAge = this.maxAge, w = newWeight)
    }

    private fun incrementAgeSometimes(){
        if(Random.nextBoolean())
            age++
    }
}