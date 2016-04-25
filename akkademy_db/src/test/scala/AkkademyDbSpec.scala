
import akka.actor.ActorSystem
import akka.testkit.TestActorRef
import com.akkademy.messages.SetRequest
import org.scalatest.{BeforeAndAfterEach, FunSpecLike, Matchers}
import  com.akkademy.AkkademyDb
import scala.concurrent.duration
/**
  * Created by rkhan on 4/24/2016.
  */
class AkkademyDbSpec extends FunSpecLike with Matchers with BeforeAndAfterEach{
implicit  val system = ActorSystem()
  describe("AkkademyDb"){
    it("given SetRequest"){
      val actorRef= TestActorRef(new AkkademyDb)
      actorRef ! SetRequest("key","value")
      val akkademyDb = actorRef.underlyingActor
      akkademyDb.map.get("key" ) should equal(Some("value"))

    }

  }
}
