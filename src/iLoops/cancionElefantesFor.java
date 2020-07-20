package iLoops;

import libs.Input;

public class cancionElefantesFor {

    public static void main(String[] args) {
        int numeroElefantes;
        int i;

        System.out.println("Cuántos elefantes ? ");
        numeroElefantes = Input.get_int();
        for (i=1; i<=numeroElefantes ; i++)
        {
            System.out.println(i + " elefante se columpiaba sobre la tela de una araña,\n" +
                    "como veia que resistia, fue a llamar a otro elefante");
        }

    }
}
