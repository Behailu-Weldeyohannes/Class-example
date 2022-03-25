package myCar;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();  // build the object by initializing
        Car holden = new Car();
        //porsche.setModel("Carrera");
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
