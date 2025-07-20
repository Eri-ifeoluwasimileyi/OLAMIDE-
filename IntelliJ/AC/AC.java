package AC;


public class AC {
    private boolean turnOn;
    private int temperature;

    public void TurnACOn() {
        this.turnOn = true;
        this.temperature = 16;
    }

    public void TurnACOff() {
        this.turnOn =  false;
        this.temperature = 0;
    }

    public boolean isOn() {
        return turnOn;
    }

    public void setTemperature(int temperature) {
        if(turnOn) {
            if (temperature >= 16 && temperature <= 30) {
                this.temperature = temperature;
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(turnOn && temperature < 30) {
            this.temperature++;
        }
    }

    public void decreaseTemperature() {
        if(turnOn && temperature > 16) {
            this.temperature--;
        }

    }
}


