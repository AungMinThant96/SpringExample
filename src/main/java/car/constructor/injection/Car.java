package car.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displaySpecification(){
        System.out.println("Car Detail:" + this.specification);
    }
}
