package com.akkademy

import akka.actor.{ActorRef, ActorSystem, Props}

object Main extends App {
  private implicit val system = ActorSystem()
  val actor:ActorRef=  system.actorOf(ScalaPongActor props "pongFoo")
}
