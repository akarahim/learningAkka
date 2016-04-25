package  com.akkademy
import akka.actor.{Actor, Props, Status}


/**
  * Created by rkhan on 4/25/2016.
  */
class ScalaPongActor extends Actor {
  override def receive: Receive = {
    case "ping"=>sender() ! "Pong"
    case _=> sender() ! Status.Failure(new Exception("unknown Message"))

  }
}
object  ScalaPongActor{
  def props(response:String):Props= {
    Props(classOf[ScalaPongActor], response)
  }
  }


