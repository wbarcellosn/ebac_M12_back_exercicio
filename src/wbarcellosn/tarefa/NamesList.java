/**
 * @author winic
 */
package wbarcellosn.tarefa;

import java.util.Scanner;

public class NamesList {
    Scanner s = new Scanner(System.in);

    String namesList;

    public void setNamesList(){
        String namesList;
        do {
            System.out.println("****Digite dois ou mais nomes e separe-os por vírgula****");
            namesList = s.nextLine();

            if(!namesList.isEmpty()){
                thereIsComma(namesList);
            }
            else {
                System.out.println("Você não digitou nada!\n");
            }
        } while(namesList.isEmpty());
    }

    public void thereIsComma(String tempNamesList){

        if (!tempNamesList.contains(",")) {
            System.out.println("Você não utilizou virgula ou digitou apenas um nome!\n");
            setNamesList();
        }
        else {
            this.namesList = tempNamesList;
            printNamesList();
        }
    }

    public void printNamesList(){
        String[] arrayNames = this.namesList.split(",");

        System.out.println("\n****LISTA DE NOMES EM ORDEM NÃO ALFABÉTICA****\n");
        for(String name : arrayNames) {
            System.out.println(name);
        }
        System.out.println("\n****LISTA DE NOMES EM ORDEM ALFABÉTICA****\n");
        bubbleSort(arrayNames);
        for(String name : arrayNames) {
            System.out.println(name);
        }

    }

    public void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
