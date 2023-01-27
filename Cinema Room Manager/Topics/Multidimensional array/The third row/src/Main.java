class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        String output = "";
        for(int chungus : twoDimArray[2]) {
            output = output + chungus + " ";
        }
        System.out.println(output);
    }
}