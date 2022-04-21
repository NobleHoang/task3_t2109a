public class CylinderCompution {
    public static void main(String[] args){
        double radius, height, surfaceArea, baseArea, Volume;
        final double PI = 3.14129565;
        radius = 6;
        height = 8;
        surfaceArea = (radius*2*PI)*height;
        baseArea = surfaceArea + 2*(radius*radius*PI);
        Volume = PI*radius*radius*height;
        System.out.print("The surface Area is: ");
        System.out.println(surfaceArea);
        System.out.print("The base Area is: ");
        System.out.println(baseArea);
        System.out.print("The volume is: ");
        System.out.println(Volume);
        System.out.println();
        System.out.println("Enter to complete");
    }
}
