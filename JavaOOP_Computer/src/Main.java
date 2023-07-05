
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(4,16,512,15.6,Keyboard.INTERNATIONAL);
        Laptop laptop2 = new Laptop(2,8,512,17.2,Keyboard.US);
        Laptop laptop3 = new Laptop(4,8,256,15.6, Keyboard.US);
        MobilePhone mobilePhone1 = new MobilePhone(2,2,128,32,Network.G4);
        MobilePhone mobilePhone2 = new MobilePhone(2,4,256,64,Network.G5);
        ArrayList<Computer> listOfComputers = new ArrayList<>();
        listOfComputers.add(laptop1);
        listOfComputers.add(laptop2);
        listOfComputers.add(laptop3);
        listOfComputers.add(mobilePhone1);
        listOfComputers.add(mobilePhone2);
        for(int i = 0; i<listOfComputers.size(); i++){
            Computer computer = listOfComputers.get(i);
            if(computer instanceof Laptop){
                System.out.println(computer.toString());
            }
            else{
                System.out.println(computer.toString());
            }

    }}}
