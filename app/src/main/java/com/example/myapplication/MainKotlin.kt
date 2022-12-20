package com.example.myapplication

import com.example.myapplication.Animal



fun main(){
     var  cat = Animal(e= 50, w = 12 ,maxAge = 15, name = "petushok")

     while(!cat.isTooOld){
          cat.eat()
          cat.move()
          cat.sleep()
     }
     cat = cat.makeChild()
}