package javaCurso;

public class condicionais {

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



        //estrutura if else
        if (bool){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }


        //estrutura if else
        if(b > 99){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }


        //estrutura if else
        if (str.isBlank()){
            System.out.println("Verdadeiro");
        } else if (str == "Emerson"){
            System.out.println("Emerson");
        }
        else {
            System.out.println("Falso");
        }
    }
}
