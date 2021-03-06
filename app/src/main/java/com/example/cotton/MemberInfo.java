package com.example.cotton;

public class MemberInfo {
    private String name;
    private String phoneNumber;
    private String wallet;
    private int ticket;
    private String profileLink;

    public MemberInfo() {
    }

    public MemberInfo(String name, String phoneNumber, String wallet, int ticket, String profileLink) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet;
        this.ticket = ticket;
        this.profileLink = profileLink;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }
}

