class q5 {
    public static void main(String[] args) {

        double base = 10;
        double height = 5;

        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);
    }
}