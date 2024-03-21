
class House {
    private double area;

    public House(double length, double width) {
        this.area = length * width;
    }

    public void showData() {
        System.out.println("I am a house, my area is " + area + " m2");
    }
}
