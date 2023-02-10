package armstrong;
//Write a program to print out all Armstrong numbers (An Armstrong number of
// three digits is an integer such that the sum of the cubes of its digits is equal
// to the number itself) between 1 and 500.

//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//1 corresponds to the variable hundred_position
//5 corresponds to the variable ten_position
//3 corresponds to the variable unit_position
public class Mainarm {
    public static void main(String[] args) {
        for (int hundred_position = 1; hundred_position < 6; hundred_position++)
            for (int ten_position = 0; ten_position < 10; ten_position++)
                for (int unit_position = 0; unit_position < 10; unit_position++) {
                    //System.out.println("" + a + "" + b + "" + c);
                    int number = hundred_position * 100 + ten_position * 10 + unit_position;
                    int cubes = hundred_position * hundred_position * hundred_position+ ten_position * ten_position * ten_position + unit_position * unit_position * unit_position;
                    if (number <= 500 && number == cubes)
                        System.out.println(number);

                }
    }
}
