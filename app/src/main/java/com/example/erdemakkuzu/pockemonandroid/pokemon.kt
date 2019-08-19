package com.example.erdemakkuzu.pockemonandroid

import android.location.Location

class Pokemon{

    var name:String?=null
    var description:String?=null
    var img:Int?=null
    var power:Double?=null
    var location:Location?=null
    var isCatched:Boolean=false
    constructor(img:Int,name:String,description:String,power:Double,lat:Double,log:Double){

        this.name=name
        this.description=description
        this.img=img
        this.power=power
        this.location=Location(name)
        this.location!!.latitude=lat
        this.location!!.longitude=log
        this.isCatched=false


    }


}