package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("This is new application")) 
  }

  def movieList =  Action {
  	val a = Json.toJson(List("Gladiator","Inception", "Memento", "The Prestige"))
  	Ok( a)
  }
  
}
