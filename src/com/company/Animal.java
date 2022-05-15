
package com.company;

    abstract class Animal {
        private String name;
        private int age;
        private int Weight;

        public Animal(){
            this.age = Weight  =0;
            this.name = "SS";
        }
        public Animal (int age) { this.age = age;}
        public abstract void eat(String foodname);

        public abstract void getVoice();

        public String getName(){return name;}
        public void setName(String name) {this.name = name;}

        public int getAge(){return age;}
        public void setAge(int age){this.age = age;}
        public int getWeight(){ return Weight;}
        public void setWeight(int weight) {this.Weight = weight;}

    }

    abstract class Mammal extends Animal{
        private String order;

        public Mammal(){
            super();
            order = "SS";
        }
        public Mammal(String name, int age, int weight,String order){
            super(name, age, weight);
            this.order = order;

        }
        public Mammal (int age, String order){
            super(age);
            this.order = order;

        }
        public void drinkMilk(){ System.out.println("slup slup");}

        @Override
        public void getVoice() { System.out.println("Mamma; is making sound");}
        @Override
        public void eat(String foodname){System.out.println("Mammal is eating"+ foodname);}

        public String getOrder() { return order;}
        public void setOrder(String order){this.order = order;}
        @Override
        public String toString(){
            return "Mammal{" + "order" + order +'\'' + '}';
        }
    }

    class Dog extends Mammal{
        private String breed;

        Dog() {
            super();
            breed = "SS";

        }
        public Dog(String name, int age, int weight, String rzad,String breed){
            super(name, age, weight, rzad );
            this.breed = breed;
        }
        public Dog(int age, String rzad, String breed){
            super(age, rzad);
            this.breed = breed;

        }
        public void aport(){ System.out.println("The is retrieving.");}
        @Override
        public void drinkMilk(){System.out.println("The dog is eating" );}
        @Override
        public void getvoice(){System.out.println("the dog i barking");}
        @Override
        public void eat(String foodname){System.out.println("The Dog is eating" + foodname);}

        public String getBreed(){return breed;}
        public void setBreed(String breed){this.breed = breed;}
        @Override
        public String toString(){
            return "Dog{" + "breed ='" + breed + '\''+ '}';
        }
    }

    public class Main{
        public static void main(String[]args){
            Animal animal[] = new Animal[6];
            animal[1] = new Dog(name"butkus", age 5, weight 15,rzad "Carnivora",  breed"mastiff");

        }
    }

}
