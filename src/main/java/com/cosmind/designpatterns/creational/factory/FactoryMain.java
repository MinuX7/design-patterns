package com.cosmind.designpatterns.creational.factory;

public class FactoryMain {

        public static void main(String[] args) {
            String osName = getOSName();

            Dialog dialog;
            if (osName.equals("Windows")) {
                dialog = new WindowsDialog();
            } else if (osName.equals("Linux")) {
                dialog = new LinuxDialog();
            } else {
                throw new RuntimeException("Error! Unknown operating system.");
            }

            dialog.renderWindow();
        }

        private static String getOSName() {
            return "Linux";
        }
}
