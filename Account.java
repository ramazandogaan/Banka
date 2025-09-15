package Banka;

public class Account {

    // FIELDS
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;

    // CONSTRUCTORS


    public Account(int accountId, int customerId, AccountType accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }

    // GETTER AND SETTER METHODS
    // TODO GETTER VE SETTER METODLARINI OLUŞTURUN

    /// /////////////////////////////////////////////////////////////////////////

    // TODO PARA EKLE (DEPOSIT) METODU
    //  YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {
    /*
      1. BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
      2. YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN
      3. BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN
      4. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...
     */
        if (amount > 0) {
            balance += amount;
            System.out.println("Tutar hesabınıza eklendi" + balance);

        } else {
            System.out.println("Lütfen 0 dan büyük miktar deneyiniz!");
        }


    }

    /// /////////////////////////////////////////////////////////////////////////////////////


    // TODO PARA ÇEK (WITHDRAW) METODU
    //  ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {

        /*
         1. BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
         2. ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN
         3. ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN
         4. ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE,BAKİYEDEN DÜŞÜP,YENİ BAKİYEYİ KULLANICIYA BİLDİRİN...
         5. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN
         */
        if (amount <= 0) {
            System.out.println("Geçersiz Tutar. Negatif veya Sıfır para çekilemez");
        } else if (amount > balance) {
            System.out.println("Yetersiz Bakiye! Mevcut bakiyeniz: " + balance + " TL dir.");
        } else {
            balance -= amount;
            System.out.println(amount + " Tl Çekildi. Yeni Bakiyeniz: " + balance + " TL dir");
        }


    }
    /////////////////////////////////////////////////////////////////////////////////////

    // TODO TO STRING METODUNU OLUŞTURUN


    ////////////////////////////////////////////////////////////////////////////////////////
}
