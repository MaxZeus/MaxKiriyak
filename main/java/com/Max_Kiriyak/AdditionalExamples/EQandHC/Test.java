package main.java.com.Max_Kiriyak.AdditionalExamples.EQandHC;

class Money {
    int amount;
    String currencyCode;

    Money() {}
    Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money other = (Money) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) ||
                (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;

    }
}

class VoucherMoney extends Money {
    private String store;

    public VoucherMoney(int money, String currencyCode, String store) {
        super(money, currencyCode);
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VoucherMoney)) return false;

        var other = (VoucherMoney) o; // Встал var из любопытства.
        boolean currentCodeEquals = (this.currencyCode == null && other.currencyCode == null) ||
                (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null) ||
                (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currentCodeEquals && storeEquals;

    }
}
class Voucher {
    private Money money;
    private String store;

    Voucher (int amount, String currencyCode, String store) {
        money = new Money(amount, currencyCode);
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voucher)) return false;

        var vc = (Voucher) o;
        boolean moneyEquals = (this.money == null && vc.money == null) ||
                (this.money != null && this.money.equals(vc.money));
        boolean storeEquals = (this.store == null && vc.store == null) ||
                (this.store != null && this.store.equals(vc.store));
        return moneyEquals && storeEquals;
    }
}


public class Test {
    public static void main(String[] args) {
        Money one = new Money(55, "USD");
        Money three = new Money();

        VoucherMoney vm = new VoucherMoney(55, "USD", "Amazon");
        Voucher vc = new Voucher(55, "USD", "Amazon");
        Voucher vf = new Voucher(55, "USD", "Amazon");


        System.out.println(vc.equals(vf));
        System.out.println(one.equals(vm));


    }
}
