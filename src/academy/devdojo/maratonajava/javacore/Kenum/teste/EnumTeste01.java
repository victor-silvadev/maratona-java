package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class EnumTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Shikamaro", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Shikamaro", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Shikamaro", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Shikamaro", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
