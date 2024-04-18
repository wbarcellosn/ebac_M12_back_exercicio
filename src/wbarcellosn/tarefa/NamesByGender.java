/**
 * @author winic
 */
package wbarcellosn.tarefa;

import java.util.Scanner;

public class NamesByGender {
    Scanner s = new Scanner(System.in);

    String namesList;
    String[] arrayNames;
    String[] maleArray;
    String[] femaleArray;

    public void setNamesList(){
        String namesList;
        do {
            System.out.println("****Digite dois ou mais nomes com seus respectivos sexos na seguinte formatação 'nome-siglaDoSexo' e separe-os por vírgula****");
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
            arrayNames = this.namesList.split(",");
            getByGender(arrayNames);
            printNamesList();
        }
    }

    public void printNamesList(){
        System.out.println("\n****LISTA GERAL****\n");
        for(String name : arrayNames) {
            System.out.println(name);
        }

        System.out.println("\n****LISTA MASCULINA****\n");
        for(String name : maleArray) {
            if (name != null) {
                System.out.println(name);
            }
        }

        System.out.println("\n****LISTA FEMININA****\n");
        for(String name : femaleArray) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }

    public void getByGender(String[] arr){
        maleArray = new String[arr.length];
        femaleArray = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String string = arr[i].toLowerCase();
            if (string.contains("-m") || string.contains("- m")) {
                maleArray[i] = arr[i];
            } else {
                femaleArray[i] = arr[i];
            }
        }
    }
}
