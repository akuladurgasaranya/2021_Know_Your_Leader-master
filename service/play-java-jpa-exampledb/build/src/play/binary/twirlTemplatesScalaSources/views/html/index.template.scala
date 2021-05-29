
package views.html

import models._
import controllers._
import play.api.i18n._
import play.api.templates.PlayMagic._
import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.libs.F
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
import views.html._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<script type='text/javascript' src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/index.js")),format.raw/*4.82*/("""'></script>


    <form method="POST" action=""""),_display_(/*7.34*/routes/*7.40*/.PersonController.addPerson()),format.raw/*7.69*/("""" >
        Person name:
        <input name='person' type="text"/>

        <button>Add Person</button>
    </form>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 28 19:17:07 IST 2021
                  SOURCE: C:/Users/Sai Jyothisma Pamidi/2020_Know_Your_Leader-master/2020_Know_Your_Leader-master/service/play-java-jpa-exampledb/app/views/index.scala.html
                  HASH: 134976e6c21bba41ab8b4ea5b73ed836a878297f
                  MATRIX: 960->1|1056->3|1084->6|1115->29|1154->31|1185->36|1248->73|1262->79|1316->113|1389->160|1403->166|1452->195|1600->313
                  LINES: 29->1|34->1|36->3|36->3|36->3|37->4|37->4|37->4|37->4|40->7|40->7|40->7|46->13
                  -- GENERATED --
              */
          