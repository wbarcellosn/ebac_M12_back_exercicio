/**
 * @author winic
 */

package wbarcellosn.tarefa;

public class CollectionsTask2 {


    public static void main(String[] args){
        NamesList task1 = new NamesList();
        NamesByGender task2 = new NamesByGender();
        System.out.println("\n********Iniciando o programa********\n");
        System.out.println("######TAREFA 1######\n");
        task1.setNamesList();
        System.out.println("\n######TAREFA 2######\n");
        task2.setNamesList();
        System.out.println("\n********Encerrando o programa********\n");
    }


}
