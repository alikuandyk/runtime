package lesson10.classwork;

public class WeatherCalendar {
        private String month;
        private int numberOfDays;
        private int rainyDays;
        private int year;
        private boolean isRainyMonth;

        public WeatherCalendar(String month, int numberOfDays, int rainyDays, int year, boolean isRainyMonth) {
                this.month = month;
                this.numberOfDays = numberOfDays;
                this.rainyDays = rainyDays;
                this.year = year;
                this.isRainyMonth = isRainyMonth;
        }

        public String getMonth() {
                return month;
        }

        public int getNumberOfDays() {
                return numberOfDays;
        }

        public int getRainyDays() {
                return rainyDays;
        }

        public int getYear() {
                return year;
        }

        public boolean getIsRainyMonth() {
                return isRainyMonth;
        }

        public void setIsRainyMonth(boolean b) {
                this.isRainyMonth = b;
        }

        // Увеличить переменную rainyDays на единицу
        public void addRainyDay() {
        rainyDays += 1;
        }
}
