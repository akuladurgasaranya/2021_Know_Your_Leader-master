// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sai Jyothisma Pamidi/2020_Know_Your_Leader-master/2020_Know_Your_Leader-master/service/play-java-jpa-exampledb/conf/routes
// @DATE:Wed Apr 28 19:16:51 IST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  PersonController_2: controllers.PersonController,
  // @LINE:15
  ActionController_3: controllers.ActionController,
  // @LINE:23
  RatingController_1: controllers.RatingController,
  // @LINE:30
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    PersonController_2: controllers.PersonController,
    // @LINE:15
    ActionController_3: controllers.ActionController,
    // @LINE:23
    RatingController_1: controllers.RatingController,
    // @LINE:30
    Assets_0: controllers.Assets
  ) = this(errorHandler, PersonController_2, ActionController_3, RatingController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_2, ActionController_3, RatingController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.PersonController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.PersonController.updatePerson()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delperson""", """controllers.PersonController.deletePerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action""", """controllers.ActionController.addAction()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actioni""", """controllers.ActionController.addActionImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ratingchange""", """controllers.ActionController.ratingChange()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actionprofile/""" + "$" + """email<[^/]+>""", """controllers.ActionController.getUserAction(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actions/""" + "$" + """email<[^/]+>""", """controllers.ActionController.getActions(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actionsf/""" + "$" + """email<[^/]+>/""" + "$" + """filter<[^/]+>""", """controllers.ActionController.getActionsFilter(email:String, filter:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delaction""", """controllers.ActionController.deleteAction()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rating""", """controllers.RatingController.addRating()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""", """controllers.RatingController.addComment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_PersonController_addPerson0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_addPerson0_invoker = createInvoker(
    PersonController_2.addPerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      this.prefix + """person""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PersonController_getPersons1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_getPersons1_invoker = createInvoker(
    PersonController_2.getPersons(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      this.prefix + """persons""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PersonController_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_PersonController_login2_invoker = createInvoker(
    PersonController_2.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PersonController_updatePerson3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_PersonController_updatePerson3_invoker = createInvoker(
    PersonController_2.updatePerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "updatePerson",
      Nil,
      "POST",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PersonController_deletePerson4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delperson")))
  )
  private[this] lazy val controllers_PersonController_deletePerson4_invoker = createInvoker(
    PersonController_2.deletePerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "deletePerson",
      Nil,
      "DELETE",
      this.prefix + """delperson""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ActionController_addAction5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action")))
  )
  private[this] lazy val controllers_ActionController_addAction5_invoker = createInvoker(
    ActionController_3.addAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "addAction",
      Nil,
      "POST",
      this.prefix + """action""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ActionController_addActionImage6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actioni")))
  )
  private[this] lazy val controllers_ActionController_addActionImage6_invoker = createInvoker(
    ActionController_3.addActionImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "addActionImage",
      Nil,
      "POST",
      this.prefix + """actioni""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ActionController_ratingChange7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratingchange")))
  )
  private[this] lazy val controllers_ActionController_ratingChange7_invoker = createInvoker(
    ActionController_3.ratingChange(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "ratingChange",
      Nil,
      "POST",
      this.prefix + """ratingchange""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ActionController_getUserAction8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actionprofile/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActionController_getUserAction8_invoker = createInvoker(
    ActionController_3.getUserAction(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getUserAction",
      Seq(classOf[String]),
      "GET",
      this.prefix + """actionprofile/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ActionController_getActions9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actions/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActionController_getActions9_invoker = createInvoker(
    ActionController_3.getActions(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getActions",
      Seq(classOf[String]),
      "GET",
      this.prefix + """actions/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ActionController_getActionsFilter10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actionsf/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("filter", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActionController_getActionsFilter10_invoker = createInvoker(
    ActionController_3.getActionsFilter(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getActionsFilter",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """actionsf/""" + "$" + """email<[^/]+>/""" + "$" + """filter<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ActionController_deleteAction11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delaction")))
  )
  private[this] lazy val controllers_ActionController_deleteAction11_invoker = createInvoker(
    ActionController_3.deleteAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "deleteAction",
      Nil,
      "DELETE",
      this.prefix + """delaction""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RatingController_addRating12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rating")))
  )
  private[this] lazy val controllers_RatingController_addRating12_invoker = createInvoker(
    RatingController_1.addRating(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RatingController",
      "addRating",
      Nil,
      "POST",
      this.prefix + """rating""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RatingController_addComment13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment")))
  )
  private[this] lazy val controllers_RatingController_addComment13_invoker = createInvoker(
    RatingController_1.addComment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RatingController",
      "addComment",
      Nil,
      "POST",
      this.prefix + """comment""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_PersonController_addPerson0_route(params@_) =>
      call { 
        controllers_PersonController_addPerson0_invoker.call(PersonController_2.addPerson())
      }
  
    // @LINE:9
    case controllers_PersonController_getPersons1_route(params@_) =>
      call { 
        controllers_PersonController_getPersons1_invoker.call(PersonController_2.getPersons())
      }
  
    // @LINE:10
    case controllers_PersonController_login2_route(params@_) =>
      call { 
        controllers_PersonController_login2_invoker.call(PersonController_2.login())
      }
  
    // @LINE:11
    case controllers_PersonController_updatePerson3_route(params@_) =>
      call { 
        controllers_PersonController_updatePerson3_invoker.call(PersonController_2.updatePerson())
      }
  
    // @LINE:12
    case controllers_PersonController_deletePerson4_route(params@_) =>
      call { 
        controllers_PersonController_deletePerson4_invoker.call(PersonController_2.deletePerson())
      }
  
    // @LINE:15
    case controllers_ActionController_addAction5_route(params@_) =>
      call { 
        controllers_ActionController_addAction5_invoker.call(ActionController_3.addAction())
      }
  
    // @LINE:16
    case controllers_ActionController_addActionImage6_route(params@_) =>
      call { 
        controllers_ActionController_addActionImage6_invoker.call(ActionController_3.addActionImage())
      }
  
    // @LINE:17
    case controllers_ActionController_ratingChange7_route(params@_) =>
      call { 
        controllers_ActionController_ratingChange7_invoker.call(ActionController_3.ratingChange())
      }
  
    // @LINE:18
    case controllers_ActionController_getUserAction8_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActionController_getUserAction8_invoker.call(ActionController_3.getUserAction(email))
      }
  
    // @LINE:19
    case controllers_ActionController_getActions9_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActionController_getActions9_invoker.call(ActionController_3.getActions(email))
      }
  
    // @LINE:20
    case controllers_ActionController_getActionsFilter10_route(params@_) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("filter", None)) { (email, filter) =>
        controllers_ActionController_getActionsFilter10_invoker.call(ActionController_3.getActionsFilter(email, filter))
      }
  
    // @LINE:21
    case controllers_ActionController_deleteAction11_route(params@_) =>
      call { 
        controllers_ActionController_deleteAction11_invoker.call(ActionController_3.deleteAction())
      }
  
    // @LINE:23
    case controllers_RatingController_addRating12_route(params@_) =>
      call { 
        controllers_RatingController_addRating12_invoker.call(RatingController_1.addRating())
      }
  
    // @LINE:24
    case controllers_RatingController_addComment13_route(params@_) =>
      call { 
        controllers_RatingController_addComment13_invoker.call(RatingController_1.addComment())
      }
  
    // @LINE:30
    case controllers_Assets_at14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_0.at(path, file))
      }
  }
}
