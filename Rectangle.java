public class Rectangle {
    private int lenght;
    private int breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }


    public int getBreadth() {
        return breadth;
    }
    public int getLenght() {
        return lenght;
    }
    public int Calculate(int Length,int Breadth){
        int Perimetre=2*(Breadth+Length);
        return Perimetre;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLenght(40);
        rect.setBreadth(20);
        int d1=rect.getLenght();
        int d2 = rect.getBreadth();
        int Result = rect.Calculate(d1,d2);
        System.out.println("Length of Rectangle:"+ d1);
        System.out.println("Breadth of Rectangle :"+d2);
        System.out.println("Perimter:"+ Result);
    }
}
