package TestKata.Kata;

import java.util.Scanner;

import static TestKata.Kata.ArabConvert.comparison;

public class Main {


    public static void main(String[] args) throws Exception {
        Main scanNum = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanNum.calc(input);

    }


    public static String calc(String input) throws Exception {
        String arrayNum[] = input.split(" ");// разбиваем по пробелу строку, загоняем ее в массив
        if (arrayNum.length != 3)    // проверяем длинну массива, колличество введенных символов
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        String str1 = arrayNum[0];            // 1- элемент массива  (цыфра)
        String str3 = arrayNum[2];            // 3 - элемент массива  (цыфры)
        String str2 = arrayNum[1];            // 2 -элемент массива   (математический знак)
        if (Regex.isArab(str1) && Regex.isArab(str3) && Regex.isMathSymbol(str2)) {//проверяем арабские ли цифры и мат.знак
            int arabNum1 = Integer.parseInt(str1); // преводим строку в цифру
            int arabNum2 = Integer.parseInt(str3);  // преводим строку в цифру
            if (arabNum1 <= 10 && arabNum2 <= 10) {      // проверяем условие - цыфры <= 10
                switch (str2) {                           // действие на цифрами в соответствии с мат. знаком
                    case "+":
                        input = String.valueOf(arabNum1 + arabNum2);
                        System.out.println(input);
                        return input;

                    case "-":
                        input = String.valueOf(arabNum1 - arabNum2);
                        System.out.println(input);
                        return input;

                    case "*":
                        input = String.valueOf(arabNum1 * arabNum2);
                        System.out.println(input);
                        return input;
                    case "/":
                        input = String.valueOf(arabNum1 / arabNum2);
                        System.out.println(input);
                        return input;

                }


            }
        } else if (Regex.isRoman(str1) && Regex.isRoman(str3) && Regex.isMathSymbol(str2)) {//проверяем римские ли цифры и мат.знак
            int romanNum1 = RomansConvert.convert(str1); // преводим символ римской цыфры в арабскую цыфру
            int romanNum2 = RomansConvert.convert(str3);  // преводим символ римской цыфры в арабскую цыфру
            int resultRomanNum = 0;
            if (romanNum1 <= 10 && romanNum2 <= 10) {// проверяем условие - цыфры <= 10

                switch (str2) {                           // действие над цифрами в соответствии с мат. знаком
                    case "+":
                        resultRomanNum = romanNum1 + romanNum2;
                        break;

                    case "-":
                        resultRomanNum = romanNum1 - romanNum2;
                        break;

                    case "*":
                        resultRomanNum = romanNum1 * romanNum2;
                        break;
                    case "/":
                        resultRomanNum = romanNum1 / romanNum2;
                        break;

                }
                input = String.valueOf(comparison(resultRomanNum)); // преобразуем результат в строку


            }

        }

        System.out.println(input);
        return input;
    }

}







