import java.util.Scanner;
public class Nrepolygon
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double side_len = 0.0d,perimeter = 0.0d,area = 0.0d,half_side_len = 0.0d,height_of_single_triangle = 0.0d;
        long noe = 0L;
        double half_radian_of_each_angle = 0.0d;
        System.out.println("o.:N-regular-polygon");
        System.out.print("i.:Side_length:");
        //get the side length
        if(in.hasNextDouble())
        {
            side_len = in.nextDouble();
            half_side_len = side_len / 2.0d;
        }
        else
        {
            System.out.println("error");
            return;
        }
        System.out.print("i.:Number_of_edges:");
        //get number of edges
        if(in.hasNextLong())
        {
            noe = in.nextLong();
            half_radian_of_each_angle = Math.PI / (double)noe;
            height_of_single_triangle = half_side_len / Math.tan(half_radian_of_each_angle);
        }
        else
        {
            System.out.println("error");
            return;
        }
        //now we know the perimeter
        perimeter = (double)noe * side_len;
        //then compute the area
        area = noe * half_side_len * height_of_single_triangle;
        //give result
        if((perimeter - (int)perimeter) == 0)
            System.out.printf("o.:Perimeter: %.0f\no.:Area: %.16f",perimeter,area);
        else
            System.out.printf("o.:Perimeter: %.12f\no.:Area: %.16f",perimeter,area);
    }
}