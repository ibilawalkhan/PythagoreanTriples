public class Main {
    public static void main(String[] args) {

        int maxSide = 500;

        System.out.println("Pythagorean Triples:");
        System.out.println("--------------------");
        System.out.println("Side 1\tSide 2\tHypotenuse");

        for(int side1 = 1; side1 < maxSide; side1++) {
            for (int side2 = 1; side2 < maxSide; side2++) {
                for( int hypotenous = 1; hypotenous < maxSide; hypotenous++) {
                    if ((side1 * side1) + (side2 + side2) == (hypotenous * hypotenous)) {
                        System.out.println(side1 + "\t" + side2 + "\t" + hypotenous);
                    }
                }
            }
        }
    }
}