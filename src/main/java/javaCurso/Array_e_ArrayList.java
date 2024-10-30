package javaCurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_e_ArrayList {

    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'E';
        String str = "Emerson";
        boolean bool = true;


        //array vetor
        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        System.out.println(colecaoInteiros[0]);


        int[] colecao = new int[5];
        System.out.println(colecao.length);


        String[] nomesArr = new String[10];
        nomesArr[0] = "John";
        nomesArr[1] = "Jane";
        nomesArr[2] = "Doe";



        //ArrayList
        List<String> nomes = new ArrayList<>();
        nomes.add("Jose");
        nomes.add("Ana");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Luis");
        nomes.add("Pedro");
        //nomes.remove("Pedro");
        System.out.println(nomes.get(0)); // -> para acessar o elemento na posição 0
        System.out.println(Arrays.toString(nomes.stream().toArray()));


        //percorrer a lista com o for (For = Enquanto eu não chego àquela condição ele vai executando)
        for (int meuIterador = 0; meuIterador < nomes.size(); meuIterador++) {
            System.out.println(nomes.get(meuIterador));
        }


        //percorrer lista de array
        for (int meuIterador = 0; meuIterador < nomesArr.length; meuIterador++){
            System.out.println(nomesArr[meuIterador]);
        }


        //percorrer lista com for
        for (String nome : nomes){
            System.out.println(nome);
        }


        //percorrer lista com while (While = Vai ser executado até que uma condição seja atingida)
        int contador = 0;
        while (contador < 3){
            System.out.println("Estou no contador");
            contador++;
        }

    }
}
