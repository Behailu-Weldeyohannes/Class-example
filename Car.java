package myCar;

public class Car {  //other class have unrestricted access to this class
    private int doors;  // characterstics
    private int wheels;
    private String model;
    private String engine;
    private String color;
 // method helps to update
    public  void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
          this.model = model;
        } else {
            this.model = "Unknown";
        }
       // this.model = model;

    }
    // getter
public String getModel(){
     return this.model;
}

}
