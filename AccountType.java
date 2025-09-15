package Banka;

public enum AccountType {

    // TODO Bu Class'da bir degisiklik yapmaniza gerek yok
    CHECKING("Vadesiz Hesap"),   // vadesiz hesap
    SAVINGS("Tasarruf Hesap"),    // tasarruf hesabı
    CREDIT("Kredi Hesap") ;     // kredi hesabı

    public String accaountType;

    AccountType(String accaountType) {
        this.accaountType=accaountType;
    }

    public String getAccaountType() {
        return accaountType;
    }
}
