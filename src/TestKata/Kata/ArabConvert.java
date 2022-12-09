package TestKata.Kata;


class ArabConvert {
    public enum ArabConvertRom {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
        int i;

        ArabConvertRom(int i) {

            this.i = i;
        }

        public int getArabConvertRom() {

            return i;
        }
    }

    ArabConvertRom[] array = ArabConvertRom.values();
    ArabConvertRom a;


    public static StringBuilder comparison(int resultRomanNum) throws Exception {
        if (resultRomanNum < 0) throw new Exception("т.к. в римской системе нет отрицательных чисел");
        ArabConvertRom[] array = ArabConvertRom.values();
        ArabConvertRom a;
        int b;
        int abc = 0;
        StringBuilder str = new StringBuilder();
        for (int j = ArabConvertRom.values().length - 1; j >= 0; ) {
            a = array[j];
            b = a.getArabConvertRom();
            while (resultRomanNum >= b) {
                abc = resultRomanNum - b;
                resultRomanNum = abc;
                str.append(a);
            }
            j--;

        }
        return str;


    }
}

