package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.Test;

public class OuterClassesTeste02 {
        private String name = "Monkey D. Luffy";

    void print(){
        String lastName = "Last Name";

        class LocalClass{
            public void printLocal(){
                System.out.println(name+" "+lastName);
        }
    }
    new LocalClass().printLocal();

    }

    public static void main(String[] args) {
            OuterClassesTeste02 outerClasse = new OuterClassesTeste02();
            outerClasse.print();
    }
}
