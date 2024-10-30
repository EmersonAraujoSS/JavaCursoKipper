package javaCurso;

public class casting {

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


        //CASTING = mudança de tipos

        //de DOUBLE para INT
        double resultado = 0.0;
        int resultadoInt = (int) resultado;


        //de INT para DOUBLE
        int meuInt = 10;
        double meuDouble = meuInt;


        //de STRING para INT
        String meuString = "Meu String";
        int meuInt2 = Integer.parseInt(meuString);

        //reconvertendo
        String minhaString = String.valueOf(meuInt2);
    }
}
