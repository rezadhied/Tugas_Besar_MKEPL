package com.mycompany.tugas_besar_mkepl;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersegiPanjangTest {

    PersegiPanjang persegiPanjang = new PersegiPanjang("Rektenggel", 8,9);

    @Test
    public void hitungKeliling() {
        assertEquals(34, persegiPanjang.hitungKeliling(),0);
    }

    @Test
    public void hitungLuas() {
        assertEquals(72, persegiPanjang.hitungLuas(),0);
    }
}