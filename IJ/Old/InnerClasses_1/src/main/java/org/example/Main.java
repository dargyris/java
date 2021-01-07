package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static L_Button btnPrint = new L_Button("Print");

    public static void main(String[] args) {
        class ClickListener implements L_Button.IClickLlistener {
            public ClickListener() {
                System.out.println("Constructor called.");
            }

            @Override
            public void onClick(String title) {
                System.out.println("Was clicked.");
            }
        }

        btnPrint.setClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}