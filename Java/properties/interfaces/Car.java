package properties.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("applying brakes.");
    }

    @Override
    public void start() {                       // start methods are present in both Engine and Media interfaces but Car class does not care which one start method is it overriding because
                                                // it's just the method name which we pick up from there but actually it is defined over here.
        System.out.println("starting the car engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate the car");
    }
}
