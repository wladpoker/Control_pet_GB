package Model;

public class PetCreator extends Creator {

    @Override
    protected Pet createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Homack:
                return new Homack();
        }
        return null;
    }
}
