package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.Test;

public class OuterClassesTeste03 {
    private String name;
    static class Nested{
        void print(){
            System.out.println(new OuterClassesTeste03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
