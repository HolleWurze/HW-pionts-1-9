import java.lang.reflect.Array;

public class HW1_2 {
    public static void main(String[] args) {


        String[] subjArray = new String[] {"Russian lang.","English lang.","Biology      ","Mathematics  ","Geometry     ","Chemistry    ","Physical cult","Geography    "};
        String[] teachersArray = new String[] {"T.Nicolaevna   ","V.Michailovna  ","S.Borisova     ","T.Valentinovna ","B.Andreevich   ","A.Sergeevich   ","N.Danilovna    ","T.Alekseevna   "};


        System.out.println("+---------------------------------------------------------------+");
        for (int i=0, j = 0; (i < subjArray.length) && (j < teachersArray.length); i++,j++) {
                System.out.println("| "+i+" |          " + subjArray[i] + "    |        " + teachersArray[j] + "        |");
        }
        System.out.println("+---------------------------------------------------------------+");

        // String numOneSubj = "Russian lang.";
        // String numTwoSubj = "English lang.";
        // String numThreeSubj = "Biology";
        // String numFourSubj = "Mathematics";
        // String numFiveSubj = "Geometry";
        // String numSixSubj = "Chemistry";
        // String numSevenSubj = "Physical cult.";
        // String numEightSubj = "Geography";
        // String TeachersName1 = "T.Nicolaevna";
        // String TeachersName2 = "V.Michailovna";
        // String TeachersName3 = "S.Borisova";
        // String TeachersName4 = "T.Valentinovna";
        // String TeachersName5 = "B.Andreevich";
        // String TeachersName6 = "A.Sergeevich";
        // String TeachersName7 = "N.Danilovna";
        // String TeachersName8 = "T.Alekseevna";

        // System.out.println("+------------------------------------------------------------+");
        // System.out.println("| 1 |          " + numOneSubj + "    |        " + TeachersName1 + "        |");
        // System.out.println("| 2 |          " + numTwoSubj + "    |        " + TeachersName2 + "       |");
        // System.out.println("| 3 |          " + numThreeSubj + "          |        " + TeachersName3 + "          |");
        // System.out.println("| 4 |          " + numFourSubj + "      |        " + TeachersName4 + "      |");
        // System.out.println("| 5 |          " + numFiveSubj + "         |        " + TeachersName5 + "        |");
        // System.out.println("| 6 |          " + numSixSubj + "        |        " + TeachersName6 + "        |");
        // System.out.println("| 7 |          " + numSevenSubj + "   |        " + TeachersName7 + "         |");
        // System.out.println("| 8 |          " + numEightSubj + "        |        " + TeachersName8 + "        |");
        // System.out.println("+------------------------------------------------------------+");

        
    }
}
