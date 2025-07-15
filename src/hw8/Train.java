package hw8;

import java.util.*;

class Train {
    // 屬性
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    // 建構子
    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() 方法，方便列印 Train 物件
    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }

    // 重寫 equals 和 hashCode 以確保在集合中能夠正確判斷是否重複
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return number == train.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public static void main(String[] args) {
        // 建立 Train 物件並加入集合中
        Set<Train> trainSet = new HashSet<>();
        trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

        // 不重複的列車資料
        System.out.println("不重複的列車資料:");
        for (Train train : trainSet) {
            System.out.println(train);
        }

        // 使用 TreeSet 來依班次編號由大到小排序列車
        Set<Train> sortedTrainSet = new TreeSet<>((t1, t2) -> t2.getNumber() - t1.getNumber());
        sortedTrainSet.addAll(trainSet);

        // 班次編號由大到小排序並印出
        System.out.println("\n班次編號由大到小排序的列車資料:");
        for (Train train : sortedTrainSet) {
            System.out.println(train);
        }
    }
}

