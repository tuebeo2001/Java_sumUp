package Lab3;

import java.util.Objects;

public class GiaoDich {
    private KhachHang trader;
    private Integer year; // Năm thực hiện giao dịch
    private String prodName; //Tên sản phẩm
    private Integer amount; //Số lượng

    @Override
    public String toString() {
        return trader.toString() + " Transaction(Year: " + year + ", ProdName: " + prodName + ", Amount: " + amount + ")";
    }

    public KhachHang getTrader() {
        return trader;
    }

    public void setTrader(KhachHang trader) {
        this.trader = trader;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public GiaoDich(KhachHang trader, Integer year, String prodName, Integer amount) {
        this.trader = trader;
        this.year = year;
        this.prodName = prodName;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiaoDich giaoDich = (GiaoDich) o;
        return Objects.equals(trader, giaoDich.trader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader);
    }
}