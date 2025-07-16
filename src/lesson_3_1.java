public class lesson_3_1 {
    public static void main(String[] args) {
        double[] numbers = {4.9, 4.5, -2.3, 7.6, 3.3, 0.9, -5.1, 9.6, 2.2, -0.4, 1.2, 3.7, -4.2, 8.2, 1.1};

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double nums : numbers) {
            if (!foundNegative) {
                if (nums < 0) {
                    foundNegative = true;
                }
                continue;
            }
            if (nums > 0) {
                sum += nums;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел расположенных после первого отрицательного числа: " + average);
        } else {
            System.out.println("Положительные числа расположенных после первого отрицательного не найдены.");
        }
    }
}
