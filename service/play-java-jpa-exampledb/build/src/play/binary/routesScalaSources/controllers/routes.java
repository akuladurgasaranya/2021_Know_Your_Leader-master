// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sai Jyothisma Pamidi/2020_Know_Your_Leader-master/2020_Know_Your_Leader-master/service/play-java-jpa-exampledb/conf/routes
// @DATE:Wed Apr 28 19:16:51 IST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRatingController RatingController = new controllers.ReverseRatingController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseActionController ActionController = new controllers.ReverseActionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRatingController RatingController = new controllers.javascript.ReverseRatingController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseActionController ActionController = new controllers.javascript.ReverseActionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
