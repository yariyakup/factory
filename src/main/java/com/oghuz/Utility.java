package com.oghuz;

import java.util.Random;

public class Utility {

    final String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static Utility getInstance;
    private Utility() {}
    public static synchronized Utility instance(){
        if (getInstance == null){
            getInstance = new Utility();
        }
        return getInstance;
    }

    public String vinNumber(){
        StringBuilder vinNum = new StringBuilder(17);
        Random random = new Random();
        int firstDigit = random.nextInt(9) + 1;
        vinNum.append(Math.abs(firstDigit));
        for (int i = 0; i < 4; i++) {
            vinNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        }
        int twoDigits = random.nextInt(90) + 10;
        vinNum.append(Math.abs(twoDigits));
        for (int i = 0; i < 4; i++) {
            vinNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        }
        int sixDigits = random.nextInt(900000) + 100000;
        vinNum.append(Math.abs(sixDigits));
        return vinNum.toString();
    }

    public String engineNumber(){
        Random random = new Random();
        StringBuilder engineNum = new StringBuilder();
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        int fiveDigits = random.nextInt(90000) + 10000;
        engineNum.append(Math.abs(fiveDigits));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        int  sevenDigits = random.nextInt(9000000) + 1000000;
        engineNum.append(Math.abs(sevenDigits));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));

        return engineNum.toString();
    }
}
