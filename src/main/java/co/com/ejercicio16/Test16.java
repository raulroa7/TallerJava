package co.com.ejercicio16;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Person personThree = new Person();
        personThree.setName("Raul");
        personThree.setAge(29);
        personThree.setSex('H');
        personThree.setWeight(83);
        personThree.setHeight(1.86);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre ");
        String name = scanner.nextLine();
        System.out.println("Ingrese Edad ");
        int age = scanner.nextInt();
        System.out.println("Ingrese peso en kg ");
        char sex = scanner.next().charAt(0);
        Double weight = scanner.nextDouble();
        System.out.println("Ingrese altura en metros ");
        Double height = scanner.nextDouble();
        Person person = new Person(name, age, sex, weight, height);
        Person personTwo = new Person(name, age, sex);
    }
}
/**
        System.out.println("Persona1");
        viewMessageWeight(person);
        viewOldeAge(person);
        System.out.println(person.toString());

        System.out.println("Persona2");
        viewMessageWeight(personTwo);
        viewOldeAge(personTwo);
        System.out.println(personTwo.toString());

        System.out.println("Persona3");
        viewMessageWeight(personThree);
        viewOldeAge(personThree);
        System.out.println(personThree.toString());*


        }
    public void viewMessageWieght(Person p){
        int IMC = p.workoutIMC();
        switch (IMC){
            case 0:
                System.out.println("No tiene sobre peso");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso");
                break;
            default:
                System.out.println("La persona esta por debajo de su peso");
                break;
        }
    }
    public static void viewOldeAge(Person p){
        if(p.isAdult()) System.out.println("la persona es mayor de edad");else System.out.println("La persona no es mayor de edad");

    }
*/
