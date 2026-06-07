//animal class for every animal
class Animal {
    //have a name
    void name() {
        System.out.println("This Animal has a name...");
    }
    //can have food
    void food() {
        System.out.println("This Animal can have food");
    }
    //can make sounds
    void makeSound () {
        System.out.println("This Animal is making sounds...");
    }

}
//cat class
class Cat extends Animal {
    //override it to change the cat name
    @Override
    void name() {
        //for using parent name
        super.name();
        System.out.println("I'm Cat, name Kitty...");
    }
    //same as name method
    @Override
    void food() {
        super.food();
        System.out.println("I'm Drinking Milk");
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Meaooo..., Meuuuu..., meoooo...");
    }
}
//dog  class
class Dog extends Animal {
    @Override
    void name() {
        super.name();
        System.out.println("I'm Dog, name Zoradaar...");
    }
    @Override
    void food() {
        super.food();
        System.out.println("I'm having Bone");
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Gheu Gheu Gheu..., Gheuoooooooo.., Gheeeeeuuuuu...");
    }
}
//panther class
class Panther extends Animal {
    @Override
    void name() {
        super.name();
        System.out.println("I'm Panther, name also Panther...");
    }
    @Override
    void food() {
        super.food();
        System.out.println("I'm having Meat");
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Hhaluum..., Hhaluum , Ami Baag , Khabo Tore...");
    }
}

public class Main {
    public static void main (String[] args) {
        //just created an object of animal
        Animal myAnimal = new Animal();
        //printing about cat
        System.out.println("About Cat : ");
        Cat myCat = new Cat();
        myCat.name();
        myCat.food();
        myCat.makeSound();
        //printing about dog
        System.out.println("About Dog : ");
        Dog myDog = new Dog();
        myDog.name();
        myDog.food();
        myDog.makeSound();
        //printing about panther
        System.out.println("About Panther : ");
        Panther mypanther = new Panther();
        mypanther.name();
        mypanther.food();
        mypanther.makeSound();
    }
}
