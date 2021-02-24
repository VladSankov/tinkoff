import java.util.Scanner;

class sorter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = in.nextInt();
        System.out.print("Input array elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        sort_tanos(a, 0, n);

    }

    static int[] sort_tanos(int[] a, int begin, int end) {
        int ans = 0;
        if (end - begin == a.length)
            ans = end;
        if (begin + 1 >= end)
            return null;
        double sum = 0;
        int[] res = new int[end - begin];
        boolean same = false;
        for (int i = begin; i < end; i++) {
            if (i != begin)
                if (a[i] != a[i - 1])
                    same = true;
            sum += a[i];
        }
        if (same == false)
            return null;
        sum /= end - begin;
        int l = 0, r = end - begin - 1;
        for (int i = begin; i < end; i++) {
            if (a[i] <= sum) {
                res[l] = a[i];
                ++l;
            } else {
                res[r] = a[i];
                --r;
            }
        }
        int length = res.length;
        for (int i = begin; i < begin + length; i++) {
            a[i] = res[i - begin];
        }
        sort_tanos(a, begin, begin + l);
        sort_tanos(a, begin + l, end);

        if (ans == end) {
            System.out.print("Sorted array: ");
            for (int i = 0; i < end; ++i) {
                System.out.print(a[i] + " ");
            }
            System.exit(0);
        }
        return null;
}

}