package trafficLight;

import java.awt.*;

public class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String Color,int Duration){
        this.color=Color;
        this.duration=Duration;
    }
    public void changecolor(String newcolor){
        color=newcolor;
    }
    public boolean green(){
        return color.equals("Its green color");
    }
    public boolean red(){
        return color.equals("Its red color");
    }
    public int duration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight("green",30);
        System.out.println("The traffic light is green"+ trafficLight.green());
        System.out.println("The light is red"+ trafficLight.red());
        trafficLight.changecolor("red");
        System.out.println("The traffic light is red"+ trafficLight.red());
        System.out.println("The traffic light duration"+ trafficLight.duration());
        trafficLight.setDuration(45);
        System.out.println("the traffic light duration"+ trafficLight.duration());
      //TrafficLight trafficLight1=new TrafficLight("Green",45);
        //System.out.println("The traffic light is Green"+trafficLight1.green());
    }
}
