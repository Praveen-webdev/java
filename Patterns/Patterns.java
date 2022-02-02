
public class Patterns {
    public static void main(String[] args) {
        // sandGlass(13);
        // pyramid(6);
        // diamond(9);
        // numPyramid(5);
        // pascal(13);
        butterfly(11);
    }

    private static void increasingTriangle(int n) {
        // * Inceasing triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void decreasingTriangle(int n) {
        // * Decreasing traingle
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightTriangle(int n) {
        // * Right increasing traingle
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void mountain(int n) {
        // * Mountain
        for (int i = 1; i <= n; i++) {
            // ! Set-1:
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            // * Bringing empty space on right;
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            // ! Set-2:
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void reversePyramid(int n) {
        // *Reverse Pyramid
        for (int i = 1; i <= n; i++) {
            // left part
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void diamond(int n) {
        n = n / 2 + 1;
        // * Diamond
        // Upper portion
        for (int i = 1; i <= n; i++) {
            // Upper portion:
            int p = 1;
            for (int j = i; j < n; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
        // Lower portion
        for (int i = 2; i <= n; i++) {
            int p = n;
            // Lower portion:
            for (int k = 1; k < i; k++) {
                System.out.print("-");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(p-- + " ");
            }
            System.out.println();
        }
    }

    private static void sandGlass(int n) { // * sandglass
        n = n / 2 + 1;
        for (int i = 1, k = 1; i <= n; i++, k++) {
            // left part
            int p = k;
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
        for (int i = 2, k = n - 1; i <= n; i++, k--) { // ! i^ = Decrease in row
            // ! Set-2:
            int p = k;
            for (int j = i; j < n; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }

    }

    private static void butterfly(int n) {
        // // * 8utterfly
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= (j == n ? i - 1 : i); j++) {//decrease in column by 1
        // System.out.print("* ");
        // }
        // for (int j = 1; j <= (n - i - 1); j++) {
        // System.out.print("- ");
        // }
        // for (int j = i; j < n; j++) {
        // System.out.print("- ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = 2; i <= n; i++) { // ! will skip the first row
        // for (int j = i; j <= n; j++) {
        // System.out.print("* ");
        // }
        // for (int j = 1; j < i - 1; j++) {
        // System.out.print("- ");
        // }
        // for (int k = 1; k < i; k++) {
        // System.out.print("- ");
        // }
        // for (int k = i; k <= n; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // * Simplified butterfly
        int stars = 1;
        int spaces = n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i == n / 2 + 1 ? stars - 1 : stars); j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n / 2 + 1) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;

            }

        }

    };

    private static void numPyramid(int n) {
        for (int i = 1, k = 1; i <= n; i++, k++) {
            int p = k;
            for (int j = i; j < n; j++) {
                System.out.print("-  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p++ + "  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p-- + "  ");
            }
            System.out.println();
        }
    }

    private static void pascal(int n) {
        // !n must be an odd number
        n = n / 2 + 1;
        // *upper Portion
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("- ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
