package pair.programming.day5.Places;

public class Theater extends Building{

    public Theater(int capacity) {
        this.setCapacity(capacity);
    }

    public void showEvents(){
        System.out.println("Events ready to be hosted !!");
    }
    public void showArea(){
        System.out.println("Theater area: " + this.getCapacity()*12);
    }
}
