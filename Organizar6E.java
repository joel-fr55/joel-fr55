//Organizar 6 variables de mayor a menor
public class Organizar6E {
    // VARIABLES ENTEROS
    public int A, B, C, D, E, F, cont;
    public int CHA;// variable vacio

    // METODO PARA ASIGNAR LAS VARIABLES
    public void Variables() {

        cont = 0;

        A = (int) (Math.random() * 9) + 1;
        do {
            B = (int) (Math.random() * 9) + 1;
        } while (B == A);
        do {
            C = (int) (Math.random() * 9) + 1;
        } while (C == B || C == A);
        do {
            D = (int) (Math.random() * 9) + 1;
        } while (D == A || D == B || D == C);
        do {
            E = (int) (Math.random() * 9) + 1;
        } while (E == A || E == B || E == C || E == D);
        do {
            F = (int) (Math.random() * 9) + 1;
        } while (F == A || F == B || F == C || F == D || F == E);

    }

    // METODO PARA ORDENAR
    public void Ordenando() {

        for (int i = 1; i <= 6; i++) { // incluir el ciclo for par que se ordenan las variables
            if (A <= B) {
                CHA = A;
                A = B;
                B = CHA;
            }
            if (B <= C) {
                CHA = B;
                B = C;
                C = CHA;
            }
            if (C <= D) {
                CHA = C;
                C = D;
                D = CHA;
            }
            if (D <= E) {
                CHA = D;
                D = E;
                E = CHA;
            }
            if (E <= F) {
                CHA = E;
                E = F;
                F = CHA;
            }

        }

    }

    // MOSTRAR LO ORDENADO
    public void Mostrar() {
        System.out.println("las variables:");
        Variables();
        System.out.println(A + "\t " + B + "\t " + C + "\t " + D + "\t " + E + "\t " + F);
        Ordenando();
        System.out.println("ya estan Organizadas:");
        System.out.print(A + "\t " + B + "\t " + C + "\t " + D + "\t " + E + "\t " + F);

    }

    public static void main(String args[]) {
        Organizar6E Ordenalo = new Organizar6E();

        Ordenalo.Mostrar();

    }
}