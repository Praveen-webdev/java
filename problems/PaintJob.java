
public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(53.3343, 4.53));
        System.out.println(getBucketCount(7.3030, 7.3030, 4.53));
        System.out.println(getBucketCount(7.3030, 7.3030, 4.53, 2));

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        int getBucket = (int) Math.ceil(area / areaPerBucket);
        return getBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        int getBucket = getBucketCount(width, height, areaPerBucket);
        return (getBucket - extraBucket);
    }

};
