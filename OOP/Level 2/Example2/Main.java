import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals={new Cat(),new Dog()}; 
        /**
           Polymorephism : 
         * Do samething in differente way Like how dog eat and how cat eat.
         * It has many forms, but they are common
         * Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
         */
        for(Animal x:animals) {
            x.sound();
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("chose one animal dog or cat");
        String choise=scanner.nextLine();
        if (choise.toLowerCase()=="dog") {
            Animal dog=new Dog();
            System.out.print("this is sound of dog :");
            dog.sound();
        } else {
            Animal cat=new Cat();
            System.out.print("this is sound of cat :");
            cat.sound();
        }

        
    }

}

//  possible qu'une classe interne ne possède pas de nom  ?
//https://koor.fr/Test.wp
//A quoi sert la méthode finalize() ?
