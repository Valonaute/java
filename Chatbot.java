import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        
        // On Souhaite la bienvenue 
        System.out.println("Bonjour, bienvenue dans ce ChatBot");
        // Pause 3 sec
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Présentations 
        System.out.println("Quelques courtoisies ! ");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // On récupère le nom 
        Scanner scannerUserName = new Scanner(System.in);
        System.out.println("Quel est votre nom ? ");
        String name = scannerUserName.nextLine();
        

        // On se présente 
        System.out.println("Bonjour " + name + " ! Ravi de pouvoir discuter ensemble !");

        // On récupère le sujet de discussion 
        Scanner Subject = new Scanner(System.in);
        System.out.println("De quoi veut tu parler ? A - pour la Gwada, B - pour la pluie parisienne. ");
        String subject = Subject.nextLine();
        
        String subjectLower = subject.toLowerCase();

        if(subjectLower.equals("a")){
            System.out.println(" Ahhh la Gwada ! Excellent choix ! ");
        } else {
            System.out.println(" Humm la pluie parisienne... Tu veux vraiment en parler ? Allons-y !  ");
        }



    }
}