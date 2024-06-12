package com.mycompany.tugas_besar_mkepl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LingkaranTest {

    Lingkaran lingkaran = new Lingkaran("Sirkel", 14);

    @Test
    public void hitungKeliling() {
        assertEquals(87.92, lingkaran.hitungKeliling(), 0);
    }

    @Test
    public void hitungLuas() {
        assertEquals(615.44, lingkaran.hitungLuas(), 0);
    }
}