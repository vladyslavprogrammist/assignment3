package com.shpp.p2p.cs.vyevtushenko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part2 extends TextProgram {

    public void run() {
        int value, result;
        print("Enter a number: ");
        value = readInt();
        result = value;
        while(true){
            if(result == 1) {
                println("The end.");
                break;
            }
            if(result % 2 == 0) {
                print(result);
                result /= 2;
                println(" is even so I take half: " + result);
            } else {
                print(result);
                result = (3 * result + 1);
                println(" is odd so I make " + result);
            }
        }
    }
}
