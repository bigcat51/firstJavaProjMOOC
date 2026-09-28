package mooc.ui.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        int num = 0;
        System.out.println("Application logic is working");
        while (true) {
            if (num == 3) {
                break;
            }
            ui.update();
            num++;
        }

    }
}
