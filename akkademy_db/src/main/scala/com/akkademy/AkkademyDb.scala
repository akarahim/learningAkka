package com.akkademy

import akka.actor.Actor
import akka.event.Logging
import com.akkademy.messages.SetRequest

import scala.collection.mutable.HashMap

/**
  * Created by rkhan on 4/24/2016.
  */
class AkkademyDb extends Actor{
  val map= new HashMap[String,Object]
  val log = Logging(context.system,this)
  override def receive: Receive = {
    case SetRequest(key,value)=>{
    log.info("received Set - Key:{} value:{}",key,value)
  map.put(key, value)
    }
    case o=>log.info("receibed unknown message :{} ",o)

  }
}
