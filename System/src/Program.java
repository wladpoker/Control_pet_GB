import Control.PetControl;
import Model.Pet;
import Services.IRepository;
import Services.PetRepository;
import UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetControl Control = new PetControl(myFarm);
        new ConsoleMenu (Control).start();
    }
}    