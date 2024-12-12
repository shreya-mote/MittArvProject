package com.mittarv.utils;



public class PropertyFile {
  static String filepath=System.getProperty("user.dir")+"/src/test/resources/config/data.properties";
  
  public static String getBrowser() {
  	return PropUtils.readPropertiesFile(filepath,"browserName");
  }
  public static String getUrl() {
  	return PropUtils.readPropertiesFile(filepath,"launch_Url");
  }
}
