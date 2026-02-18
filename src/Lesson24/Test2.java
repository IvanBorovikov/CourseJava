package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolochistvoStoron);
    }
}

abstract class Figura {

    int kolochistvoStoron = 0;

    abstract void perimetr();
    abstract void ploshad();
    void show(){
        System.out.println("Это фигура");
    }

}

class Kvadrat extends Figura{

    int kolochistvoStoron = 4;
    int storona1 = 10;
   public void perimetr(){
       System.out.println("Периметр квадрата = " + kolochistvoStoron * storona1);
    }
    public void ploshad(){
       System.out.println("Площадь квадрата = " + storona1 * storona1);
    }
}

class Prymougolnik extends Figura{
    int kolochistvoStoron = 2;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr(){
        System.out.println("Периметр прямоугольника = " + kolochistvoStoron * (storona1 + storona2));
    }
    public void ploshad(){
        System.out.println("Площадь квадрата = " + storona1 * storona2);
    }
}

class Okryjnost extends Figura{
    int kolochistvoStoron = 0;
    int radius = 3;
    public void perimetr(){
        System.out.println("Периметр окружности = " + 2 * 3.14 * radius);
    }
    public void ploshad(){
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura{
    void def(){
        System.out.println("Это четырехугольник");
    }
}
