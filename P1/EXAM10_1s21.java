class EXAM10_1s21{
    public static void main(String[] args) {
        int o;
        for (o = 1; o <= 100; o++) {
            System.out.print(o + " ");
            if (o % 10 == 0) {
                System.out.println();
            }
        }
    }
}