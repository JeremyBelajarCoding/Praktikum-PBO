package Jobsheet3;

public class Member {
    private String idCard;
    private String name;
    private int limitLoan;
    private int loanAmount;

    public Member(String idCard, String name, int limitLoan) {
        this.idCard = idCard;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0;
    }
    public String getIdCard() {
        return idCard;
    }
    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return limitLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }


    public void borrow(int amount) {
        if (this.loanAmount + amount > this.limitLoan) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.loanAmount += amount;
        }
    }

    public void installment(int amount) {
        if (amount < (this.loanAmount * 0.10)) {
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        } else {
            this.loanAmount -= amount;
        }

    }
    }