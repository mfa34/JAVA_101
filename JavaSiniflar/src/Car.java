public class Car {
    String type ;
    String model ;
    String colour ;
    int speed ;
    int limit=180;


    void increaseSpeed(int increment ){
        if (speed + increment < limit){
            speed+=increment;
        }

    }
    void decreaseSpeed (int decrease){
        if (speed>0){
            speed-=decrease;
        }

    }
    void printSpeed (){
        System.out.println("hiziniz =" + speed);
    }

    public static void main(String[] args) {
        
    }
}
