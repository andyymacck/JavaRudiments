import java.util.Scanner;

class Animal {
   void sound() {
       System.out.println("An animal makes a sound based on the animal that it is.");
   }

   Animal() {
       System.out.println("I am an animal");
   }
}

class pig extends Animal {
   void sound() {
       System.out.println("oink");
   }

   pig() {
       System.out.println("I am a pig");
   }
}

class sheep extends Animal {
   void sound() {
       System.out.println("baah");
   }

   sheep() {
       System.out.println("I am a sheep");
   }
}

class duck extends Animal {
   void sound() {
       System.out.println("quack");
   }

   duck() {
       System.out.println("I am a duck");
   }
}

class cow extends Animal {
   void sound() {
       System.out.println("moo");
   }

   cow() {
       System.out.println("I am a cow");
   }
}

public class AnimalTest {
   public static void main(String[] args) {
       Animal a = null;
       Scanner input = new Scanner(System.in);
       int choice = 1;
       while (choice != 5) {
           System.out.println("Enter the type of animal : \n1.Pig\n2.Sheep\n3.Duck\n4.Cow\n5.exit");
           {
               choice = input.nextInt();
               switch (choice) {
               case 1:
                   a = (pig) new pig();
                   break;
               case 2:
                   a = (sheep) new sheep();
                   break;
               case 3:
                   a = (duck) new duck();
                   break;
               case 4:
                   a = (cow) new cow();
                   break;
               case 5:
                   break;
               default:
                   System.out.println("Enter Correct Choice!!");
                   continue;
               }
               a.sound();
           }
       }
   }
}

