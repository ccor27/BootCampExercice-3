public class Main {

    public static void main(String[] args) {

        //first part
        int add = addNumbers(1,2,3);
        System.out.println("the add is: "+add);

        //second part
        Coche miCoche = new Coche();
        System.out.println("doors: "+miCoche.getNumberDoor());
        miCoche.addDoor();
        miCoche.addDoor();
        System.out.println("doors: "+miCoche.getNumberDoor());
    }

    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }
}
