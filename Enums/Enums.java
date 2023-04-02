enum TrafficSignal{
    RED("STOP"),GREEN("GO"),ORANGE("WAIT");

    private String action;

    public String getAction(){
        return action;
    }
    private TrafficSignal(String action){
     this.action= action;   
    }
}
public class Enums {
    public static void main(String []args){
        TrafficSignal [] signals=TrafficSignal.values();
        for(TrafficSignal signal : signals){
            System.out.println("name :" +signal + " action: " +signal.getAction());
        }
    }
}

