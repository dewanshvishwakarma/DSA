package pattern;
public class dewansh {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        String[] pattern = {
                "*****   ******  *       *    ***    *     *   *****    *     *",
                "*    *  *       *       *   *   *   **    *  *         *     *",
                "*    *  *       *   *   *  *     *  * *   *  *         *     *",
                "*    *  *****   *  * *  *  *******  *  *  *   *****    *******",
                "*    *  *       * *   * *  *     *  *   * *        *   *     *",
                "*    *  *       **     **  *     *  *    **        *   *     *",
                "*****   ******  *       *  *     *  *     *   *****    *     *"
        };

        for (int i = 0; i < pattern.length; i++) {
            System.out.println(pattern[i]);
        }

        System.out.println();
        System.out.println();
//        System.out.println();



                for (int i = 0; i <= 6; i++) {
                    for (int j = 0; j <= 7; j++) {
                        if ((i == 0 && (j == 1 || j == 2 || j == 5 || j == 6)) ||
                                (i == 1 && (j == 0 || j == 3 || j == 4 || j == 7)) ||
                                (i >= 2 && i <= 4) ||
                                (i == 5 && (j >= 1 && j <= 6)) ||
                                (i == 6 && (j >= 2 && j <= 5))) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }


        System.out.println();
        System.out.println();
//        System.out.println();




        String[] p = {
                " *****     *     *   *     *****      *      *     *     *    ",
                "*         * *    **  *       *       * *     **    *    * *   ",
                "*        *   *   * * *       *      *   *    * *   *   *   *  ",
                " *****   *****   *  **       *      *****    *  *  *   *****  ",
                "      *  *   *   *   *       *      *   *    *   * *   *   *  ",
                "      *  *   *   *   *       *      *   *    *    **   *   *  ",
                " *****   *   *   *   *       *      *   *    *     *   *   *  ",
                "                         * *"
        };

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}