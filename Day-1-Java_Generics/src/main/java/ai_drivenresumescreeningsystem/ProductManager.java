package ai_drivenresumescreeningsystem;

public class ProductManager extends JobRole{
    public ProductManager(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Product Manager  : " + getName());
        System.out.println("Experience       : " + getExperience() + " years\n");
    }
}
