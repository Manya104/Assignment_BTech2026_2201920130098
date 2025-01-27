class Rectangle

{

    double length;

    double width;

    double area;

    Rectangle()

    {

        this.length = 1.0;

        this.width = 1.0;

    }

    Rectangle(double length, double width)

    {

        this.length = length;

        this.width = width;

    }

    public double calculateArea()

    {

        area = length * width;

        return area;

    }

    public void displayDetails()

    {

        System.out.println("Length : %.2f\n" + this.length);

        System.out.println("Width : %.2f\n" + this.width);

        System.out.println("Area : %.2f\n" + this.area);

    }

};
