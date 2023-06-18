public class Task2 {
    //2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
    public interface SpeedCalculation {
        double calculateAllowedSpeed(Vehicle vehicle);
    }

    public class Vehicle {
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }
    }


    public class Bus implements SpeedCalculation{
        public double calculateAllowedSpeed(Vehicle vehicle){
            return vehicle.getMaxSpeed() * 0.8;
        }
    }

    public class Car implements SpeedCalculation{

        public double calculateAllowedSpeed(Vehicle vehicle){
            return vehicle.getMaxSpeed() * 0.6;
        }

    }

}

//Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP

/*тут много вопросов коректно ли я реализовал?
Как мы обратимся к этому в коде? Просто будем создавать разный клас для разных видов машин?
 */
