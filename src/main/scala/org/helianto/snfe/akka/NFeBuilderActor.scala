package org.helianto.snfe.akka

import akka.actor.{ActorLogging, Actor}
import akka.event.LoggingReceive

/**
 * Created by mauriciofernandesdecastro on 05/09/15.
 */
class NFeBuilderActor extends Actor with ActorLogging {

  def receive = LoggingReceive {
    case _ =>
  }

}
