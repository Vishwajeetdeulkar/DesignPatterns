package com.vishwa.AbstractFactoryDesignPattern.UI;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        System.out.println("Enter machine OS");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        scanner.close();

        IFactory factory = GUIAbstractFactory.createFactory(osType);

        if (factory != null) {
            IButton button = factory.createButton();
            button.press();

            ITextBox textBox = factory.createTextBox();
            textBox.setText("Temporary text");
        } else {
            System.out.println("Invalid OS type");
        }
    }
}
