public class Coche {

    private int numberDoor;

    public Coche(){
       numberDoor=0;
    }

    public void addDoor(){
        numberDoor+=1;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }
}
