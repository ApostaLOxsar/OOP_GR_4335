public class Task4 {
    /* Задачи со *(подсказок нет!, это же сложные задания)
        4) Переписать код в соответствии с Liskov Substitution Principle:*/
    public abstract class Shape{
        private int width;
        private int height;

        public abstract void setWidth(int width);
        public abstract void setHeight(int height);
        public int area() {
            return this.width * this.height;
        }

    }

    public class Rectangle extends Shape {
        @Override
        public void setWidth(int width) {
            super.width = width;
        }
        @Override
        public void setHeight(int height) {
            super.height = height;
        }

    }
    public class Square extends Shape {
        @Override
        public void setWidth(int width) {
            super.width = width;
            super.height = width;
        }
        @Override
        public void setHeight(int height) {
            super.width = height;
            super.height = height;
        }
    }
}
