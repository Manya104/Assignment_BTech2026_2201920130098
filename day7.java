class ShapeCalculator{

     private int result;

    public void area(int radius){

        result = (int)(22/7)*radius*radius;

        System.out.println("Area of Circle : " + result);

    }

   

     public void area(int length,int width){

        result  =(int)length*width;

        System.out.println("Area of Rectangle : " + result);

    }

     public void area(int base1, int base2, double height){

          result =  (int)( (base1 + base2) * height) / 2;

          System.out.println("Area of Trapezoid: " + result);

    }
