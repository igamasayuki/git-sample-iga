package jp.co.runy.sample;

public class Car {
  private int speed;
  private String bodyColor;


  public Car() {
  }

  public Car(int speed2, String bodyColor) {
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

// 削除した
}
