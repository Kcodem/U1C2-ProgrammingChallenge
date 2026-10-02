public class Solution {
    /**
         * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
         *
         * Problem 1: Exam Average
         */

        public double average(double t1, double t2, double t3, double t4) {
            double average = (t1 + t2 + t3 +t4)/4;
            return average;
        }

        public int roundAverage(double average) {
            int roundAverage = (int) (average + 0.5);
            return roundAverage;
        }

        public boolean isPassing(int roundedAverage) {
            boolean isPassing = roundedAverage >= 65;
            return true;
        }

    /*
    Problem 2: Stock Price
    */

        public double totalStock(int shares, double price) {
            double totalStock = (shares * price);
            return totalStock;
        }


        public int roundValueChange(double totalStock) {
            int roundValueChange = (int) (totalStock + 0.5);
            return roundValueChange;
        }

    /*
    Problem 3: Digit Incrementer
    */

        public double adjustDigits(double userDouble) {
            int wholeUser = (int) (userDouble * 100);
            int whole1 = (((int) (wholeUser / 10000)) + 1) % 10;
            int whole2 = (((int) ((wholeUser % 10000)/1000))+1) % 10;
            int whole3 = (((int) ((wholeUser % 1000)/100))+1) % 10;
            int whole4 = (((int) ((wholeUser % 100)/10))+1) % 10;
            int whole5 = (((int) (wholeUser % 10))+1) % 10;
            String newWholeUser = ("whole1" + "whole2" + "whole3" + "whole4" + "whole5");
            double number = Double.parseDouble(newWholeUser);
            double adjustDigits = number / 100;
            return adjustDigits;
        }

        void main(String[] args) {
            Solution s = new Solution();
            System.out.println(s.adjustDigits(12.90));
            //23.01
        }    

    }

