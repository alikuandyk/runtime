package lesson4.homework.task3;

public class СlockSimulation {
    public static void main(String[] args) {
//        вариант ChatGPT
//        for (int h = 0; h <= 23; h++) {
//            for (int m = 0; m <= 59; m++) {
//                String hour = h < 10 ? "0" + h : String.valueOf(h);
//                String minute = m < 10 ? "0" + m : String.valueOf(m);
//
//                System.out.println(hour + ":" + minute);
//            }
//        }

//        вариант 1
//        for (int h = 0; h <= 23; h++) {
//            if (h < 10) {
//                for (int m = 0; m <= 59; m++) {
//                    if (m < 10) {
//                        System.out.println("0" + h + ":" + "0" + m);
//                    } else {
//                        System.out.println("0" + h + ":" + m);
//                    }
//                }
//            } else {
//                for (int m = 0; m <= 59; m++) {
//                    if (m < 10) {
//                        System.out.println(h + ":" + "0" + m);
//                    } else {
//                        System.out.println(h + ":" + m);
//                    }
//                }
//            }
//        }

//        вариант 2
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h < 10) {
                    if (m < 10) {
                        System.out.println("0" + h + ":" + "0" + m);
                    } else {
                        System.out.println("0" + h + ":" + m);
                    }
                } else {
                    if (m < 10) {
                        System.out.println(h + ":" + "0" + m);
                    } else {
                        System.out.println(h + ":" + m);
                    }
                }
            }
        }
    }
}
