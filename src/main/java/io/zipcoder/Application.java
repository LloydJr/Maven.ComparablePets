package io.zipcoder;


import java.util.Scanner;

public class Application {

    void run(){

    }

    Scanner scanner = new Scanner(System.in);


    private Integer numberOfPets(Scanner scanner){
        System.out.println("How many pets do you own?");
         return scanner.nextInt();
    }
    public static String petList(Integer numberOfPets, String[] typeOfPet, String[] nameOfPet) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfPets; i++)
            sb.append(String.format("%s %s \n", typeOfPet[i], nameOfPet[i]));
        return sb.toString();
    }
    public static String petSpeaks(Pet[] pets){
        StringBuilder sb = new StringBuilder();
        for (Pet pet : pets)
            sb.append(String.format("%s the %s says \n\t%s\n", pet.getName(), typeOfPetinString(pet), pet.speak()));
        return sb.substring(0, sb.length() - 1);
    }
    private static String typeOfPetString(Pet pet) {
        if (pet instanceof Cat)
            return "cat";
        else if (pet instanceof Dog)
            return "dog";
        else
            return null;
    }
    public static String typeAndNameOfPet(Pet pet0 {

    }
}
