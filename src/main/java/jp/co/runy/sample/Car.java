package jp.co.runy.sample;

public class Car {
  private int speed;//f/x1回目
  private String bodyColor; //develop
  


  public Car() {
  }

  public Car(int speed2, String bodyColor) {//f/x2かいめ
    this.speed = speed2;
    this.bodyColor = bodyColor;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = 10;
  }

  public String getBodyColor() {
    return this.bodyColor;
  }

  public void setBodyColor(String bodyColor) {
    this.bodyColor = bodyColor;
  }

  @Override
  public String toString() {
    return "{" +
      " speed='" + getSpeed() + "'" +
      ", bodyColor='" + getBodyColor() + "'" +
      "}";
  }
  
}
