package Bike;

public class Bike {
    private boolean turnOn;
    private int speed;


    public void TurnOn() {
        this.turnOn = true;
    }

    public void TurnOff() {
        this.turnOn = false;
    }

    public boolean isOn() {
        return turnOn;
    }

    public void increaseAcceleration() {
        if(speed >= 0 && speed <= 20) this.speed++;
        if(speed >= 21 && speed <= 30) this.speed+=2;
        if(speed >= 31 && speed <= 40) this.speed+=3;
        if(speed >= 41) this.speed+=4;
    }


    public void decreaseAcceleration() {
        if(speed >= 0 && speed <= 20) this.speed--;
        if(speed >= 21 && speed <= 30) this.speed-=2;
        if(speed >= 31 && speed <= 40) this.speed-=3;
        if(speed >= 41) this.speed-=4;
    }


    public int getAcceleration() {
        return speed;

    }

    public void setAcceleration(int  speed) {
        this.speed = speed;
    }


}
