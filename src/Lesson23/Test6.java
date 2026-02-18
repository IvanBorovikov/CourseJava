package Lesson23;

public class Test6 {
}

class Animal{
     String showName(){
        return "someAnimal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal{
     String showName(){
        return "mouse";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
