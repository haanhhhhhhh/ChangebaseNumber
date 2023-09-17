package controller;

import common.Algorithm;
import common.Library;
import common.Validation;
import view.Menu;


public class ChangeBaseNumberManagement extends Menu<String> {

    static String[] mc = {"Binary (2)", "Decimal (10)","Hexadecimal (16)", "Exit"};
    Algorithm ar;
    Library l;

    public ChangeBaseNumberManagement() {
        super("PROGRAMMING", mc);
        l = new Library();
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                changeNumbers(n);
                break;
            }
            case 2: {
                changeNumbers(n);
                break;
            }
            case 3: {
                changeNumbers(n);
                break;
            }
            case 4:
                System.exit(0);
        }
    }

    public void changeNumbers(int input) {
        int output = l.getInt("Enter output type(1-3)", 1, 3);
        String str = l.getString("Enter number: ");
        if(input == 1) {
            while(!Validation.checkBinary(str)) {
                str = l.getString("Enter number again: ");
            }
        }
        else if(input == 2) {
            while(!Validation.checkDecimal(str)) {
                str = l.getString("Enter number again: ");
            }
        }
        else if(input == 3) {
            while(!Validation.checkHex(str)) {
                str = l.getString("Enter number again: ");
            }
        }
        String changeValue = ar.convertBase(str, input, output);      
        System.out.println("Output: "+ changeValue);
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}