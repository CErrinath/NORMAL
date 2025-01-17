package Week2;

class Employee {

    String name;

    
    public Employee(String name) {
        this.name = name;
    }

 
    public void eat() {
        System.out.println(name + "  eating CHICKEN ");
    }
}


class Human extends Employee {
    
    
    public Human(String name) {
        super(name); 
    }

   
    public void profession() {
        System.out.println(name + "  Software engineer ");
    }
}

public class InheritanceExample {
	
    public static void main(String[] args) {
        
        Human h = new Human("KGF");

       
        h.eat();  
        h.profession(); 
    }
}

