package structural.facade;

class IDE { void open() { System.out.println("Opening IntelliJ IDEA..."); } }
class Docker { void start() { System.out.println("Starting Docker containers..."); } }

public class WorkFacade {
    private IDE ide = new IDE();
    private Docker docker = new Docker();
    public void startWorkDay() {
        ide.open();
        docker.start();
        System.out.println("Ready to code!");
    }
}