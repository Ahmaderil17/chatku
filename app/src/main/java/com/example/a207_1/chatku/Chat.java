package com.example.a207_1.chatku;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by 207-1 on 08/01/2018.
 */
public class Chat {
    private User sender;
    private String pesan;
    private Long tanggal;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    public String getPesan() {
        return pesan;
    }

    public User getSender() {
        return sender;
    }

    public Long getTanggal() {
        return tanggal;
    }
}
