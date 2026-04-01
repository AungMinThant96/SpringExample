package car.setter.injection;
public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displaySpecification(){
        System.out.println("Car Detail:" + this.specification);
    }
}
