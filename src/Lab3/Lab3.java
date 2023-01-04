package Lab3;

import java.util.*;
import java.util.stream.Collectors;

public class Lab3 {
    public static void main(String[] args) {
        String address = "Ha noi";
        List<GiaoDich> listGiaoDich = new ArrayList<>();
        listGiaoDich.add(new GiaoDich(new KhachHang("Tuan", "Hung yen"), 2021, "Dien thoai IPhone", 100));
        listGiaoDich.add(new GiaoDich(new KhachHang("Quyen", "Hai duong"), 2021, "Dien thoai Samsung", 50));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tuan", "Hung yen"), 2021, "Dien thoai IPhone", 200));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tuan", "Hung yen"), 2021, "Dien thoai IPhone", 50));
        listGiaoDich.add(new GiaoDich(new KhachHang("Quyen", "Hai duong"), 2021, "Dien thoai IPhone", 1400));
        listGiaoDich.add(new GiaoDich(new KhachHang("Quyen", "Hai duong"), 2021, "Dien thoai IPhone", 30));
        listGiaoDich.add(new GiaoDich(new KhachHang("Trung", "Ha noi"), 2021, "Dien thoai IPhone", 50));
        listGiaoDich.add(new GiaoDich(new KhachHang("Trung", "Ha noi"), 2022, "Xe may Honda", 100));
        listGiaoDich.add(new GiaoDich(new KhachHang("Trung", "Ha noi"), 2022, "Dien thoai IPhone", 60));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tue", "Ha noi"), 2021, "Xe dap", 100));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tue", "Ha noi"), 2021, "Dien thoai Xiaomi", 80));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tue", "Ha noi"), 2022, "Dien thoai Xiaomi", 150));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tue", "Ha noi"), 2022, "Dien thoai IPhone", 60));
        listGiaoDich.add(new GiaoDich(new KhachHang("Tuan", "Hung yen"), 2022, "O to mercedes", 100));

        System.out.println("Lab3.1======>");
        List<GiaoDich> list31 = listGiaoDich.stream().filter(giaoDich -> giaoDich.getYear().equals(2021)).sorted(Comparator.comparing((GiaoDich o) -> o.getAmount())).collect(Collectors.toList());
        list31.forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        System.out.println("Lab3.2======>");
//        List<GiaoDich> list32 = listGiaoDich.stream().distinct().collect(Collectors.toList());
        List<String> list32 = listGiaoDich.stream().map(giaoDich -> giaoDich.getTrader().getAddress()).distinct().collect(Collectors.toList());
        list32.forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        System.out.println("Lab3.3======>");
        List<GiaoDich> list33 = listGiaoDich.stream().filter(giaoDich -> giaoDich.getTrader().getAddress().equals("Ha noi")).sorted(Comparator.comparing((GiaoDich o) -> o.getTrader().getName())).collect(Collectors.toList());
        list33.forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        System.out.println("Lab3.4======>");
        List<String> list34 = listGiaoDich.stream().map(giaoDich -> giaoDich.getTrader().getName()).sorted().distinct().collect(Collectors.toList());
        list34.forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        System.out.println("Lab3.5======>");
        if(list32.contains(address)){
            System.out.println("Co khach hang");
        }else System.out.println("Khong co khach hang");
        System.out.println("-----------------------------------------------");

        System.out.println("Lab3.6======>");
        Optional<GiaoDich> list36 = listGiaoDich.stream().max(Comparator.comparing(giaoDich -> giaoDich.getAmount()));
        System.out.println(list36);
        System.out.println("-----------------------------------------------");

        System.out.println("Lab3.7======>");
        int list37 = listGiaoDich.stream().filter(giaoDich -> giaoDich
                .getTrader().getAddress().equals(address)).mapToInt(value -> value.getAmount()).sum();
        System.out.println(list37);

        int a = 1;
        Integer aa = new Integer(1);
        System.out.println(a==aa);
        /** limit(n): trả về 1 stream với số lượng phần tử tối đa là n phần tử. Ý nghĩa tương tự từ khóa limit trong SQL
         *
         */
//        List<GiaoDich> list48 = listGiaoDich.stream().sorted().limit(2).collect(Collectors.toList());

        /** anyMatch: sử dụng để kiểm tra xem các phần tử của stream, có bất kỳ phần tử nào thỏa mãn 1 điều kiện nào đó hay không
         *
         */
        boolean list49 = listGiaoDich.stream().anyMatch(giaoDich -> giaoDich.getAmount() ==100);

        /** allMatch: chỉ trả về true khi tất cả các phần tử trong stream đều thỏa mãn điều kiện
         *
         */
        boolean list50 = listGiaoDich.stream().allMatch(giaoDich -> giaoDich.getAmount() == 100);

    }
}