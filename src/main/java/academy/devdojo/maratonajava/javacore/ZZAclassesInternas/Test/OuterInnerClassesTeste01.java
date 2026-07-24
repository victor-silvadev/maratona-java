package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.Test;

public class OuterInnerClassesTeste01 {
        private String name = "Monkey D. Luffy";

        class Inner{
            public void printOuterClassAttribute(){
                System.out.println(name);
            }
        }

    public static void main(String[] args) {
            OuterInnerClassesTeste01 outerClasse = new OuterInnerClassesTeste01();
            Inner inner = outerClasse.new Inner();
            inner.printOuterClassAttribute();
    }
}
