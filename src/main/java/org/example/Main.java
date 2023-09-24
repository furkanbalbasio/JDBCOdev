package org.example;

import org.example.repository.CalisanRepository;
import org.example.repository.entity.Calisan;

public class Main {
    public static void main(String[] args) {
        CalisanRepository calisanRepository=new CalisanRepository();
        Calisan calisan=new Calisan("Ahmet","Yilmaz");
        calisanRepository.save(calisan);

    }
}