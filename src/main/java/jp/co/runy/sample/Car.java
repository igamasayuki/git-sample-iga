package jp.co.runy.sample;

public class Car {
  private int speed;
  private String bodyColor;


  public Car() {
  }

  public Car(int speed, String bodyColor) {
    this.speed = speed;
    this.bodyColor = bodyColor;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
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
