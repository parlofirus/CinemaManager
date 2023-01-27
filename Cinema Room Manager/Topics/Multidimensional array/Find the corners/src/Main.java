class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int index = twoDimArray.length;
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[0].length-1]);
        System.out.println(twoDimArray[index - 1][0] + " " + twoDimArray[index - 1][twoDimArray[index - 1].length-1]);

    }
}