package org.helianto.snfe

import _root_.akka.actor.{ActorSystem, Props}
import _root_.akka.kernel.Bootable
import akka.actor.ActorSystem
import akka.kernel.Bootable
import org.helianto.snfe.akka.NFeBuilderActor
import org.helianto.snfe.domain.NFe

/**
 * Created by mauriciofernandesdecastro on 05/09/15.
 */
/**
 * Created by mauriciofernandesdecastro on 05/09/15.
 */
class Bootstrap extends Bootable {

  // incializa atores
  val system = ActorSystem("sNFe")


  def startup = {
    println("sNFe starting")
    system.actorOf(Props(new NFeBuilderActor())) ! NFe()
  }

  def shutdown = {
    system.shutdown()
  }
}
