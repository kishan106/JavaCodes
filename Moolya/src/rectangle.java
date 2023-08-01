class rectangle1 {

    public double area(int a, int b) {
        double area = a * b;
        return area;

    }

    public double perimeter(int a,int b) {
        double perimeter = 2*(a+b);
       return perimeter;
    }
}





public class rectangle {
    public static void main(String[] args) {

        rectangle1 obj = new rectangle1();
         System.out.println("area of rectangle is: " +obj.area(3,4));
        System.out.println("perimeter of rectangle is: "+ obj.perimeter(3,4));

    }
}
