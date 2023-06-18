public class Task3 {
    //3) Переписать код в соответствии с Interface Segregation Principle:
    public class Circle implements Area {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }

    }

    public class Cube implements Area, Volume {
        private int edge;
        public Cube(int edge) {
            this.edge = edge;
        }
        @Override
        public double area() {
            return 6 * edge * edge;
        }
        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }


    public interface Area{
        double area();
    }

    public interface Volume{
        double volume();
    }

    //Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
}
