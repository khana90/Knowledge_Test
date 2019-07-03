


/**
 *
 * @author A
 */
//inheritance is the important mechanism in OOP language.
//this is the animal class 
public class Animal {

  void eat(){
      System.out.println("dog eats");
  }
}
 class Dog extends Animal{
 void flies (){
     System.out.println("eagle flies");
 }
}

 class DomesticAnimal{
    
public static void main(String args[]){
 
    Dog d=new Dog();
    d.eat(); 
    d.flies();
} 
}  
    

