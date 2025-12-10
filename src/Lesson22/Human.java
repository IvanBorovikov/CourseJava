package Lesson22;

public class Human {
    final String pol;
    public Human(String pol){
        this.pol = pol;
    }
    private StringBuilder name;
    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s){
        name = s;
    }

    private boolean clever;
    public boolean isClever(){
        return clever;
    }

    public void setClever(boolean c){
        clever = c;
    }

    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int i){
        if (i > 0){
            age = i;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w){
        if (w > 0){
            weight = w;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName(new StringBuilder("Ivan"));
        h.getName().append("!!!!");
        System.out.println(h.getName());
    }
}
