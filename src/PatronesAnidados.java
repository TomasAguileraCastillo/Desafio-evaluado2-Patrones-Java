import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        menuPatrones();
    }

    //metodo par presentar menu y seleccionar la opcion
    static void menuPatrones() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" Menu de Patrones en Java");
            System.out.println("  1) Patron 1 ");
            System.out.println("  2) Patron 2 ");
            System.out.println("  3) Patron 3 ");
            System.out.println("  4) Patron 4 ");
            System.out.println("  5) para Terminar \n");
            System.out.print("Seleccione Patron a Mostrar : ");
            opcion = sc.nextInt();
            System.out.print("\n");
            if (opcion == 1) {
                patron1();
                System.out.print("\n");
            } else if (opcion == 2) {
                patron2();
                System.out.print("\n");
            } else if (opcion == 3) {
                patron3();
                System.out.print("\n");
            } else if (opcion == 4) {
                patron4();
                System.out.print("\n");
            }
        } while (opcion <= 4);
    }

    //metodo para realizar el ingreso
    static int ingreso(){
        Scanner sc=new Scanner(System.in);
        int numero;
        System.out.print("Ingrese numero par agenerar el patron : ");
        numero = sc.nextInt();
        return numero;
    }

    //metodo de patron 4
    static void patron4() {
        int num = ingreso();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else if (j == 1) {
                    for (int k = 0; k < num - 2; k++) {
                        System.out.printf("*");
                    }
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
                if (i == num - 1) {
                    System.out.printf("*");

                }
            }
            System.out.printf("\n");

        }

    }

    //metodo de patron 3
    static void patron3() {
        int num = ingreso();
        int y = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if (i == j || i + j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.printf("\n");


        }
    }

    //metodo de patron 2
    static void patron2() {
        int num = ingreso();
        int a = num;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print("*");
                } else if (j == a - 2) {
                    System.out.printf("*");
                    a = a - 1;
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    //metodo de patron 1
    static void patron1() {
        int num = ingreso();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
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








}
