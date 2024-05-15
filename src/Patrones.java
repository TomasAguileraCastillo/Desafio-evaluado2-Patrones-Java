import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        muestraPatrones();

        System.out.print("\n Ingresar Cantidad de caracteres a mostrar : ");
        numero = sc.nextInt();
        System.out.println("\n");
        patron1(numero);
        patron2(numero);
        patron3(numero);

    }

    static void patron3(int num){
        System.out.print("Patron 3 : ");
        int i;
        for(i=0;i<num;i++) {
            if(i%2==0)
                System.out.printf("||");
            else
                System.out.printf("*");
        }
        System.out.printf("\n");
    }
    static void patron2(int num){
        System.out.print("Patron 2 : ");
        int i=1;
        for (int j = 1; j <= num; j++) {
            System.out.print(i);
            i++;
            if (i==5){
                i = 1;
            }

        }
        System.out.printf("\n");


    }


    static void patron1(int num){
        System.out.print("patron 1 : ");
        int i;
        for(i=0;i<num;i++) {
            if(i%2==0)
                System.out.printf("*");
            else
                System.out.printf(".");
        }
        System.out.printf("\n");
    }





    static void patroncuadrado(int num){
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num ; j++) {

                if (i == 0 || i == num - 1) {
                    System.out.printf("*");
                } else if (j == 0 || j == num - 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");

        }

    }


    static void muestraPatrones(){
        System.out.println("  Patrones de muestra \n");
        System.out.print("Patron 1 : ");
        System.out.print ("*.*.*.*.*.*.*\n");
        System.out.print("Patron 2 :");
        System.out.print("12341234\n");
        System.out.print("Patron 3 :");
        System.out.print("||*||*||*||*\n");
    }









}