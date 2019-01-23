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
        StringBuilder vinNumber = new StringBuilder(17);
        //String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int first3Digit = random.nextInt(900) + 100;
        vinNumber.append(Math.abs(first3Digit));
        for (int i = 0; i < 14; i++) {
            vinNumber.append(alphabetString.charAt(1 + random.nextInt(25)));
        }
        return vinNumber.toString();
    }

    public String engineNumber(){
        Random random = new Random();
        StringBuilder engineNum = new StringBuilder();
        //String alphabeString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
