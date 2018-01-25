package Tutorial3;

class RobotMove extends RobotMain {

    public double batteryCharge = 5.0;
    void batteryReCharge(double charge) {
        batteryCharge += charge;
        System.out.println("New battery charge = " + batteryCharge);
    }
    void move(int distance) {

        for(int i=0; i<distance; i++){
            if (batteryCharge==0){
                System.out.println("Out of Power!");
                break;
            } else {
                batteryCharge -= 0.5;
                System.out.print(i+1 + " ");
            }
        }
        System.out.println("\nBattery is now: " + batteryCharge);
    }
}
