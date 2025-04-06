    interface Shape {
        void area();
    }
    class Circle implements Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }

        public void area() {
            double area = Math.PI * radius * radius;
            System.out.printf("Area of Circle: %.5f\n", area); 
        }
    }
    class Rectangle implements Shape {
        private double width, height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void area() {
            double area = width * height;
            System.out.println("Area of a Rectangle: " + area);
        }
    }
    public class CodingChallenge {
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(10,5);

            circle.area();
            rectangle.area();
        }
    }