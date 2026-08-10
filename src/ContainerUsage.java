public class ContainerUsage {
    private Container first;
    private Container second;

    public ContainerUsage() {
        first = new Container("First", 100);
        second = new Container("Second", 100);
    }

    public void addLiters(int added) {
        first.addLiters(added);
    }

    public void moveLiters(int num) {
        if (!(num < 0)) {
            if (first.getCurrentLiters() - num < 0) {
                second.addLiters(first.getCurrentLiters());
                first.subtractLiters(first.getCurrentLiters());
            } else {
                second.addLiters(num);
                first.subtractLiters(num);
            }
        }
    }

    public void removeLiters(int num) {
       second.subtractLiters(num);
     }

    public Container getContainer(int option) {
        if (option == 1) {
            return first;
        } else if (option == 2) {
            return second;
        } else {
            return null;
        }
    }
}
