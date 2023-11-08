public class CountWordOccurrence {
    public static void main(String[] args) {

        String s = "This is a test. This is only a test.";
        String a[] = s.split(" ");
        for (int i = 0; i < a.length; i++) {

            int f = 1;
            a[i] = a[i].toLowerCase();
            for (int j = i + 1; j < a.length; j++) {
                a[j] = a[j].toLowerCase();
                if (a[i].equals(a[j])) {

                    f++;
                    a[j] = "";
                }
            }
            if (!a[i].equals("")) {
                System.out.println("Occurrence of " + a[i] + ":" + f);
            }

        }

    }

}
