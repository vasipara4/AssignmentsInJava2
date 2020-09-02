package gr.codehub.assignment2.exercise1;


import java.util.Arrays;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;
    private static final String[] CATEGORY = {"basic", "mid", "extra", "premium"};

    public StoreAccount(String owner, String storeName, String accountCategory) {
        super(owner);
        this.storeName = storeName;
        if (validCategory(accountCategory))
            this.accountCategory = accountCategory;
    }


    public StoreAccount(String owner, String storeName) {
        super(owner);
        this.storeName = storeName;
    }

    public StoreAccount(String storeName) {
        super(null);
        this.storeName = storeName;
    }


    public boolean validCategory(String category) {
        return (Arrays.asList(CATEGORY).contains(category));
    }

    @Override
    public String toString() {
        return "StoreAccount{" +
                "owner='" + this.getOwner() + '\'' +
                ", storeName='" + storeName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                ", balance='" + this.getBalance() + '\'' +
                ", numberOfTransactions ='" + this.getNumberOfTransactions() + '\'' +
                '}';
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public boolean changeAccountCategory(String accountCategory) {
        if (validCategory(accountCategory)) {
            this.accountCategory = accountCategory;
            return true;
        }
        return false;
    }


}
